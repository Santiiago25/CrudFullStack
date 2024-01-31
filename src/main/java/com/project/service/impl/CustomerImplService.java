package com.project.service.impl;

import com.project.model.dao.CustomerDao;
import com.project.model.entity.Customer;
import com.project.service.IServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImplService implements IServiceCustomer {


    @Autowired
    private CustomerDao customerDao;

    @Override
    public Customer save(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return (List<Customer>) customerDao.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerDao.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        customerDao.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerDao.save(customer);
    }
}
