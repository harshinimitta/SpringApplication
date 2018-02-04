package com.vu.service;

import java.util.List;

import com.vu.model.Customer;
import com.vu.repository.CustomerRepository;
import com.vu.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.vu.service.CustomerService#findall()
	 */
	@Override
	public List<Customer> findall(){
		return customerRepository.findall();
	}

}
