package com.vu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.vu.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findall() {
		List<Customer> customers = new ArrayList<>();
		System.out.println(dbUsername);
		Customer customer = new Customer();
		customer.setFirstName("Harshini");
		customer.setLastName("Mitta");

		customers.add(customer);
		
		return customers;
	}

	/*public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}*/

}
