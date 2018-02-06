package com.vu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vu.model.Customer;

@Repository

public class TestRepoImpl implements CustomerRepository{

	@Override
	public List<Customer> findall() {
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		customer.setFirstName("Teja");
		customer.setLastName("Mitta");

		customers.add(customer);
		return customers;
	}

}
