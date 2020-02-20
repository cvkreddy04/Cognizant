package com.cts.starter.dao;

import org.springframework.data.repository.CrudRepository;

import com.cts.starter.pojo.User;

public interface UserRepository extends CrudRepository<User,String> {
	Iterable<User> findAll();

}
