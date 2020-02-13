package com.sandy.controller;
import com.sandy.model.UserRecord;
import com.sandy.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public List<UserRecord> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/user/{id}",method=RequestMethod.GET)
	public UserRecord getById(@PathVariable("id") int id) {
		return userService.getById(id);
	}
	
	@RequestMapping(value="/add-user",method=RequestMethod.POST)
	public void addUser(@RequestBody UserRecord user) {
		userService.addUser(user);
	}
	
	@RequestMapping(value="/delete-user/{id}",method=RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") int id) {
		userService.deleteUser(id);
	}
	
	@RequestMapping(value="/update-user",method=RequestMethod.PUT)
	public void updateUser(@RequestBody UserRecord user) {
		userService.updateUser(user);
	}

}
