package com.workintech.manytoone.repository;

import com.workintech.manytoone.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
