package com.tapan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tapan.entity.Account;
import com.tapan.service.AccountServiceInterface;
@RestController
@RequestMapping("/bank")
public class AccountController {
	@Autowired
	private AccountServiceInterface service;
	@GetMapping("/allAccount")
	public List<Account> getAllAccounts()
	{
		return service.getAllAccount();
	}
	@GetMapping("/{id}")
	public Account getAccountById(@PathVariable Integer id)
	{
		return service.getAccountById(id);
	}
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account account)
	{
		return service.createAccount(account);
	}
	@DeleteMapping("/{id}")
	public void deleteAccount(@PathVariable Integer id)
	{
		service.deleteAccount(id);
	}
	@PutMapping("/{id}")
	public Account updateAccount(@PathVariable Integer id,@RequestBody Account account)
	{
		return service.updateAccount(id, account);
	}

}
