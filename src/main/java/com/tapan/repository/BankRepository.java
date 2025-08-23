package com.tapan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapan.entity.Account;

public interface BankRepository extends JpaRepository<Account,Integer>{
	
	
}
