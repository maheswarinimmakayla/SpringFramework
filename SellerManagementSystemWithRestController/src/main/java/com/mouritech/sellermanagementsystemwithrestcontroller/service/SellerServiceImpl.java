package com.mouritech.sellermanagementsystemwithrestcontroller.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemwithrestcontroller.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {
	@Autowired
	private SellerRepository sellerRepository;


	@Transactional
	public List<Seller> getAllSeller() {
		
		return sellerRepository.findAll();
	}

	@Transactional
	public void saveSeller(Seller theNewSeller) {
		sellerRepository.save(theNewSeller);
		
	}
	@Transactional
	public Seller getSellerById(Long sellerid) throws SellerNotFoundException {
		return sellerRepository.findById(sellerid)
				.orElseThrow(() -> new SellerNotFoundException(sellerid));
	}
	@Override
	@Transactional
	public void updateSeller(Long sellerid, Seller theNewSeller) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellerid)
					.orElseThrow(() -> new SellerNotFoundException(sellerid));
			existingSeller.setSellerEmail(theNewSeller.getSellerEmail());
			existingSeller.setSellerMobNo(theNewSeller.getSellerMobNo());
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	@Transactional

	public void updateSellerEmail(Long sellerid, String sellerEmail) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellerid)
					.orElseThrow(() -> new SellerNotFoundException(sellerid));
			existingSeller.setSellerEmail(sellerEmail);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Transactional
	public void updateSellerMobNo(Long sellerid, Long sellerMobNo) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(sellerid)
					.orElseThrow(() -> new SellerNotFoundException(sellerid));
			existingSeller.setSellerMobNo(sellerMobNo);
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
		
			e.printStackTrace();
		}
		
	}
	@Transactional
	public void deleteSeller(Long sellerid) {
		sellerRepository.deleteById(sellerid);
		
	}
}
