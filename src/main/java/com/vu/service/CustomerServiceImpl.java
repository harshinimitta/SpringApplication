package com.vu.service;

import java.util.List;

import com.vu.model.Customer;
import com.vu.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	//private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl (CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public List<Customer> findall(){
		return customerRepository.findall();
	}

	/*public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}*/

}
