package com.tedu.service;

import java.util.List;

import com.tedu.pojo.User;

public interface UserService {
	public List<User> find();
	public User get(Integer id);
}
