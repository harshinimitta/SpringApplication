package com.vu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vu.model.Customer;
import com.vu.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	@Qualifier("hibernateCustomerRepositoryImpl")
	private CustomerRepository customerRepository;
	
	/*@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("using constructor injection autowiring");
		this.customerRepository = customerRepository;
	}*/
	
	@Override
	public List<Customer> findall(){
		return customerRepository.findall();
	}

	/*@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("using setter injection autowiring");
		this.customerRepository = customerRepository;
	}*/

}
