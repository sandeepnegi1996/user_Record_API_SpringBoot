package com.sandy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sandy.model.UserRecord;
import com.sandy.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<UserRecord> getAllUsers() {
		return userRepository.findAll();
		
	}
	
	public UserRecord getById(int id) {
		return userRepository.findById(id).get();
	}
	
	
	public void addUser(UserRecord user) {
		
		userRepository.save(user);
	}
	
	public void updateUser(UserRecord user) {
		userRepository.save(user);
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	

}
