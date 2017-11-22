package com.agent.biz.impl;

import java.util.List;

import com.agent.biz.IAccountBiz;
import com.agent.dao.IAccount;
import com.agent.entity.Account;

public class AccountBizImpl implements IAccountBiz{
	
	private IAccount dao;
	
	

	public IAccount getDao() {
		return dao;
	}



	public void setDao(IAccount dao) {
		this.dao = dao;
	}



	@Override
	public List<Account> findAll() {
		return dao.findAll();
	}

}
