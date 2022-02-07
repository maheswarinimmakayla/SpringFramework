package com.mouritech.sellermanagementsystemwithrestcontroller.exception;

public class SellerNotFoundException extends Exception {
private static final long serialVersionUID = 1337935933969360905L;
	
	public SellerNotFoundException(Object sellerid) {
		super(sellerid != null ?sellerid.toString() : null);
	}
}
