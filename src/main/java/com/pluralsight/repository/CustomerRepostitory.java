package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * CustomerRepostitory
 */
public interface CustomerRepostitory {
    List<Customer> findAll();
}