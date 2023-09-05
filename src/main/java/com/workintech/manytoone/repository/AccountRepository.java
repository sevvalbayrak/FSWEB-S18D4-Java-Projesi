package com.workintech.manytoone.repository;

import com.workintech.manytoone.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}