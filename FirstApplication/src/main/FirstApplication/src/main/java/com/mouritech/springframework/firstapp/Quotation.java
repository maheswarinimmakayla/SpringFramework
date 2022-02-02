package com.mouritech.springframework.firstapp;

import org.springframework.stereotype.Service;

@Service("QuotationService")
public class Quotation {

	private String quote;

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}
}
