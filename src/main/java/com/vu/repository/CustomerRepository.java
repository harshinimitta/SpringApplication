package com.vu.repository;

import java.util.List;

import com.vu.model.Customer;

public interface CustomerRepository {

	List<Customer> findall();

}