package com.mouritech.ordermanagement.service;

import java.util.List;

import com.mouritech.ordermanagement.model.Order;

public interface OrderService {
	List<Order> getAllOrders();
	void saveOrder(Order theNewOrder);
	

	Order getOrder(int ordid);

	void deleteOrder(int ordid);
}
