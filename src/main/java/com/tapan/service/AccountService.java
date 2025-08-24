package com.tapan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tapan.entity.Account;
import com.tapan.repository.BankRepository;
@Service
public class AccountService  implements AccountServiceInterface{
	@Autowired
	private BankRepository repo;

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Account getAccountById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(null);
	}

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return repo.save(account);
	}

	@Override
	public void deleteAccount(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public Account updateAccount(Integer id, Account account) {
		// TODO Auto-generated method stub
		 Account acc = repo.findById(id).orElseThrow(null);
		 acc.setAccount_holder_name(account.getAccount_holder_name());
		 acc.setAccount_type(account.getAccount_type());
		 acc.setBalance(account.getBalance());
		 return repo.save(acc);
	}
		

}
