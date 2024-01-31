package com.project.controller;

import com.project.model.entity.Customer;
import com.project.service.IServiceCustomer;
import com.project.service.impl.CustomerImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private IServiceCustomer serviceCustomer;

    @PostMapping("customer")
    public Customer save(@RequestBody Customer customer){
        return serviceCustomer.save(customer);
    }

}
