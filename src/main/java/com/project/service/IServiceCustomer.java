package com.project.service;

import com.project.model.entity.Customer;

import java.util.List;

public interface IServiceCustomer {

    Customer save(Customer customer);

    List<Customer> findAll();

    Customer findById(Long id);

    void deleteById(Long id);

    Customer update(Customer customer);

}
