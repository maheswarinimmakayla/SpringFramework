package com.mouritech.ordermanagement.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.ordermanagement.dao.OrderDao;
import com.mouritech.ordermanagement.model.Order;


@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao ordDao;

	@Transactional
	public List<Order> getAllOrders() {
		
		return ordDao.getAllOrders();
	}

	@Transactional
	public void saveOrder(Order theNewOrder) {
		
		 ordDao.saveOrder(theNewOrder);
	}
	@Transactional
	public Order getOrder(int ordid) {
		
		return ordDao.getOrder(ordid);
	}
	
	@Transactional
	public void deleteOrder(int ordid) {
		 ordDao.deleteOrder(ordid);
		
	}

}
