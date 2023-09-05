package com.workintech.manytoone.repository;

import com.workintech.manytoone.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}