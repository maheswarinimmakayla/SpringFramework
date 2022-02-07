package com.mouritech.ordermanagement.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderid")
	private int orderId;
	
	@Column(name = "orderdate")
	private String orderDate;
	
	@Column(name = "ordervalue")
	private float orderValue;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(String orderDate, float orderValue) {
		super();
		this.orderDate = orderDate;
		this.orderValue = orderValue;
	}

	public Order(int orderId, String orderDate, float orderValue) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderValue = orderValue;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public float getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(float orderValue) {
		this.orderValue = orderValue;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", orderValue=" + orderValue + "]";
	}
	
	
}