package com.mouritech.customermanagementsystem.model;

public class Customer {
 private int customerId;
 private String customername;
 private Long custonerPhoneNo;
 private String customerLocation;
 
 public Customer() {
	 
 }
 
 public Customer(int customerId, String customername, Long custonerPhoneNo, String customerLocation) {
	super();
	this.customerId = customerId;
	this.customername = customername;
	this.custonerPhoneNo = custonerPhoneNo;
	this.customerLocation = customerLocation;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public Long getCustonerPhoneNo() {
	return custonerPhoneNo;
}
public void setCustonerPhoneNo(Long custonerPhoneNo) {
	this.custonerPhoneNo = custonerPhoneNo;
}
public String getCustomerLocation() {
	return customerLocation;
}
public void setCustomerLocation(String customerLocation) {
	this.customerLocation = customerLocation;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customername=" + customername + ", custonerPhoneNo="
			+ custonerPhoneNo + ", customerLocation=" + customerLocation + "]";
}

}
