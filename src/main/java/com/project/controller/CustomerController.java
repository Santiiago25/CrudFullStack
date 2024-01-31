package com.project.controller;

import com.project.model.entity.Customer;
import com.project.service.IServiceCustomer;
import com.project.service.impl.CustomerImplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    private IServiceCustomer serviceCustomer;

    @PostMapping("customer")
    public Customer save(@RequestBody Customer customer){
        return serviceCustomer.save(customer);
    }

    @GetMapping("customers")
    public List<Customer> findAll(){
        return serviceCustomer.findAll();
    }

    @GetMapping("customer/{id}")
    public Customer finById(@PathVariable Long id){
        return serviceCustomer.findById(id);
    }

    @DeleteMapping("customer/{id}")
    public void deleteById(@PathVariable Long id){
        serviceCustomer.deleteById(id);
    }

    //corregir este endpoint
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer) {
        //obetenemos el customer
        Customer customerdb = serviceCustomer.findById(customer.getId());
        customerdb.setNombres(customer.getNombres());
        customerdb.setApellidos(customer.getApellidos());
        customerdb.setEmail(customer.getEmail());
        return serviceCustomer.update(customerdb);
    }

}
