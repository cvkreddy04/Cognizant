package com.cts.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.starter.dao.UserRepository;
import com.cts.starter.pojo.User;

import java.util.*;
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/getAllUsers")
	public Iterable<User> getAllUsers()
	{
	return userRepository.findAll();
	}
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
	System.out.println(user);
	userRepository.save(user);
	return user;
	}
	@PutMapping("/updateUser/{username}")
	public User updateUser(@RequestBody User user,@PathVariable("username") String username) {
	user.setUsername(username);
		System.out.println(user);
	userRepository.save(user);
	return user;
	}
	@DeleteMapping("/deleteUser/{username}")
	public User deleteUser(@RequestBody User user,@PathVariable("username") String username) {
	//user.setUsername(username);
		System.out.println(user);
	userRepository.deleteById(username);
	return user;
	}
}
