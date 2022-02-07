package com.mouritech.ordermanagement.dao;

import java.util.List;

import com.mouritech.ordermanagement.model.Order;

public interface OrderDao {

	List<Order> getAllOrders();

	void saveOrder(Order theNewOrder);
	
	Order getOrder(int ordid);

	void deleteOrder(int ordid);

}