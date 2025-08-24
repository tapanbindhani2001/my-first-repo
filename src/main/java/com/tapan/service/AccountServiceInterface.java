package com.tapan.service;

import java.util.List;

import com.tapan.entity.Account;

public interface AccountServiceInterface{
	
	public List<Account> getAllAccount();
	public Account getAccountById(Integer id);
	public Account createAccount(Account account);
	public void deleteAccount(Integer id);
	public Account updateAccount(Integer id,Account account);

}
