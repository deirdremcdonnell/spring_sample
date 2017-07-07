package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepostitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CustomerServiceImpl
 */
// Business Logic resides in service tier
// Pass through of service to ref real repos
// Hardcoded ref to customerRepos -> spring will help to avoid this hardcoding
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepostitory customerRepository;
    //= new HibernateCustomerRepositoryImpl(); //hardcoded ref to repository

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

}