package com.mouritech.sellermanagementsystemwithrestcontroller.service;

import java.util.List;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;

public interface SellerService {
	List<Seller> getAllSeller();

	void saveSeller(Seller theNewSeller);

	Seller getSellerById(Long sellerid) throws SellerNotFoundException;

	void updateSeller(Long sellerid, Seller theNewSeller);

	void updateSellerEmail(Long sellerid, String sellerEmail);

	void updateSellerMobNo(Long sellerid, Long sellerMobNo);

	void deleteSeller(Long sellerid);
	
}
