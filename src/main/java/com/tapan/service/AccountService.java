package com.tapan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tapan.entity.Account;
import com.tapan.repository.BankRepository;
@Service
public class AccountService {
	@Autowired
	private BankRepository repository;
	public List<Account> getAllAccounts()
	{
		return repository.findAll();
	}
	public Account getAccountByid(Integer id)
	{
		return repository.findById(id).orElse(null);
	}
	public Account createAccount(Account account)
	{
		return repository.save(account);
	}
	public void deleteAccount(Integer id)
	{
		repository.deleteById(id);
	}
	public Account updateAccount(Integer id,Account account)
	{
		Account acc= repository.findById(id).orElse(null);
		if(acc!=null)
		{
			acc.setAccount_holder_name(account.getAccount_holder_name());
			acc.setAccount_type(account.getAccount_type());
			acc.setBalance(account.getBalance());
			repository.save(acc);
			return acc;
		}
		return null;
	}
	

}
