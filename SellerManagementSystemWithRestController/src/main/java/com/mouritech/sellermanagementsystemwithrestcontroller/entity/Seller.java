package com.mouritech.sellermanagementsystemwithrestcontroller.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellerid")
	private Long sellerId;
	@Column(name = "sellername")
	private String sellerName;
	@Column(name = "selleremail")
	private String sellerEmail;
	@Column(name = "sellermobno")
	private Long sellerMobNo;
	@Column(name = "sellercity")
	private String sellerCity;
	@Column(name = "sellercategory")
	private String sellerCategory;
	
	 public Seller() {
		 
	 }
	
	public Seller(Long sellerId, String sellerName, String sellerEmail, Long sellerMobNo, String sellerCity,
			String sellerCategory) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerMobNo = sellerMobNo;
		this.sellerCity = sellerCity;
		this.sellerCategory = sellerCategory;
	}


	public Long getSellerId() {
		return sellerId;
	}


	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getSellerEmail() {
		return sellerEmail;
	}


	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}


	public Long getSellerMobNo() {
		return sellerMobNo;
	}


	public void setSellerMobNo(Long sellerMobNo) {
		this.sellerMobNo = sellerMobNo;
	}


	public String getSellerCity() {
		return sellerCity;
	}


	public void setSellerCity(String sellerCity) {
		this.sellerCity = sellerCity;
	}


	public String getSellerCategory() {
		return sellerCategory;
	}


	public void setSellerCategory(String sellerCategory) {
		this.sellerCategory = sellerCategory;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerMobNo=" + sellerMobNo + ", sellerCity=" + sellerCity + ", sellerCategory=" + sellerCategory
				+ "]";
	}
	
	
}
