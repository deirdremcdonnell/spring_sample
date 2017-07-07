package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CustomerRepository
 */
public interface CustomerRepostitory {
    List<Customer> findAll();
}