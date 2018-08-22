package com.tedu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.tedu.pojo.User;

public interface UserMapper {
	public List<User> find();
	
	/*
	 * 查询一个用户，引用mybatis提供注解方法
	 * @Select mybatis提供，查询SQL语句
	 * @Param mybatis提供，映射SQL语句中的动态参数
	 */
	@Select("select * from user where id=#{id}")
	public User get(@Param("id") Integer id);
	
}
