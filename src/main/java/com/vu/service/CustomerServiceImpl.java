package com.vu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vu.model.Customer;
import com.vu.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("using constructor injection");
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findall(){
		return customerRepository.findall();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("using setter injection");
		this.customerRepository = customerRepository;
	}

}
