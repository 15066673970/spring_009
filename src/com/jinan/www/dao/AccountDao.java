package com.jinan.www.dao;

public interface AccountDao {

	//��Ǯ
	public abstract void increaseMoney(Integer id,Double money);
	
	//��Ǯ
	public abstract void decreaseMoney(Integer id,Double money);
	
	
}
