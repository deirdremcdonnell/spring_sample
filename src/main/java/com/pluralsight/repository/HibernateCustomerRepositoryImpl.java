
package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * HibernateCustomerRepositoryImpl
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepostitory {


    public List<Customer> findAll(){

        List<Customer> customers= new ArrayList<Customer>();
        Customer customer = new Customer();
        customer.setFirstName("Deirdre");
        customer.setLastName("McDonnell");
        customers.add(customer);
        customer = new Customer();
        customer.setFirstName("John");
        customer.setLastName("Bell");
        customers.add(customer);
        return customers;
    }
}