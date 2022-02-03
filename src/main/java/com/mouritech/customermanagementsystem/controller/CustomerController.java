package com.mouritech.customermanagementsystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mouritech.customermanagementsystem.model.Customer;
@Controller
@RequestMapping("/customer")
public class CustomerController {
	public List<Customer> customerList() {
		List<Customer> customer = new ArrayList<Customer>();
		customer.add(new Customer(123,"mahi",45L,"hyd"));
		customer.add(new Customer(124,"mahiReddy",65L,"hyd"));
		customer.add(new Customer(125,"sreeReddy",45L,"hyd"));
		return customer;
		
	}

	@RequestMapping(value = "/listcustomer", method = RequestMethod.GET)
	  public String getUsers(Model model) throws Exception{
	    List<Customer> customers = customerList();
	    CustomerListContainer newcustomerList = new CustomerListContainer();
	    newcustomerList.setCustomer(customers);
	    model.addAttribute("customers", newcustomerList);
	    return "customer";
	  }
}
