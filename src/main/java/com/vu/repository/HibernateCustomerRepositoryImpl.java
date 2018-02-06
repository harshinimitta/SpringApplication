package com.vu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vu.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.vu.repository.CustomerRepository#findall()
	 */
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
