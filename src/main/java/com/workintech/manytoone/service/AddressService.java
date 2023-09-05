package com.workintech.manytoone.service;

import com.workintech.manytoone.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
    Address find(int id);
    Address save(Address address);
    void delete(Address address);
}