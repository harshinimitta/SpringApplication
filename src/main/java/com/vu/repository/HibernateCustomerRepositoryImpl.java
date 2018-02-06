package com.vu.repository;

import java.util.ArrayList;
import java.util.List;

import com.vu.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	
	@Override
	public List<Customer> findall() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstName("Harshini");
		customer.setLastName("Mitta");

		customers.add(customer);
		
		return customers;
	}

}
