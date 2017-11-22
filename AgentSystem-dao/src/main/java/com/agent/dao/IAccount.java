package com.agent.dao;

import java.util.List;

import com.agent.entity.Account;

public interface IAccount {
	//查询所有
	public List<Account> findAll();
}
