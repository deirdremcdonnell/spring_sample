package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepostitory;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * CustomerServiceImpl
 */
// Business Logic resides in service tier
// Pass through of service to ref real repos
// Hardcoded ref to customerRepos -> spring will help to avoid this hardcoding
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepostitory customerRepository = new HibernateCustomerRepositoryImpl(); //hardcoded ref to repository

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}