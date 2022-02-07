package com.mouritech.sellermanagementsystemwithrestcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.sellermanagementsystemwithrestcontroller.entity.Seller;
import com.mouritech.sellermanagementsystemwithrestcontroller.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemwithrestcontroller.service.SellerService;

@RestController
@RequestMapping("/api/v1")
public class SellerController {
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/seller") 
	public ResponseEntity<?> saveSeller(@RequestBody Seller theNewSeller) {
		sellerService.saveSeller(theNewSeller);
		return ResponseEntity.ok().body("New seller added successfully");
	}
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAllSeller() {
		List<Seller> sellerList = sellerService.getAllSeller();
		return ResponseEntity.ok().body(sellerList);
	}
	
	@PutMapping("/seller/{sid}")
	public ResponseEntity<?> updateSeller(@PathVariable("sid") Long sellerid,@RequestBody Seller theNewSeller ) throws SellerNotFoundException {
		
		sellerService.updateSeller(sellerid,theNewSeller);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }

	@PutMapping("/seller/{sid}/{semail}")
	public ResponseEntity<?> updateSellerEmail(@PathVariable("sid") Long sellerid,
			@PathVariable("semail") String selleremail) throws SellerNotFoundException {
	
		sellerService.updateSellerEmail(sellerid,selleremail);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@PutMapping("/seller/{sid}/{smobno}")
	public ResponseEntity<?> updateSellerMobNo(@PathVariable("sid") Long sellerid,
			@PathVariable("smobno") Long sellerMobNo) throws SellerNotFoundException {
	
		sellerService.updateSellerMobNo(sellerid,sellerMobNo);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@GetMapping("/seller/{sid}")
	public ResponseEntity<Seller> getSellerById(@PathVariable("sid") Long sellerid) throws SellerNotFoundException {
		Seller seller = sellerService.getSellerById(sellerid);
		return ResponseEntity.ok().body(seller);
	}
	
	@DeleteMapping("/seller/{sid}")
	public ResponseEntity<?> deleteSeller(@PathVariable("sid") Long sellerid) throws SellerNotFoundException {
		sellerService.deleteSeller(sellerid);
		return ResponseEntity.ok().body("Seller deleted successfully");
	}
}
