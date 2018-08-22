package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public List<User> find(){
		return userMapper.find();
	}
	
	public User get(Integer id){
		return userMapper.get(id);
	}
}
