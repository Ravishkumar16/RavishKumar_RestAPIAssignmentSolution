package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.model.User;
import com.greatlearning.service.UserService;

@RestController
@RequestMapping("/employeemanagement/user")
public class UserController {
	
	@Autowired
	UserService userServiceImpl;
	
	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		if(user.getId()!=0) {
			return userServiceImpl.updateUser(user);
		}
		return userServiceImpl.createUser(user);
	}
	
	@GetMapping("/list")
	public List<User> getAllUsers(){
		return userServiceImpl.viewUsers();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		userServiceImpl.deleteUser(id);
	}

}
