package com.workintech.manytoone.service;

import com.workintech.manytoone.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer find(int id);
    Customer save(Customer customer);
    void delete(Customer customer);
}
