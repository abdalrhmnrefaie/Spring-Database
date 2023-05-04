package com.abdalrhmn.dao;

import javax.sql.DataSource;

import com.abdalrhmn.models.User;

public interface UserDao {
	void register(User user);
	public void setDataSource(DataSource ds);
}
