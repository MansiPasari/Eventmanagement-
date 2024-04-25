package com.springboot.aashirvaadeventdemo.Service;

import java.util.List;

import com.springboot.aashirvaadeventdemo.entity.Event;
import com.springboot.aashirvaadeventdemo.entity.User;

public interface UserService {
     
	User createUser(User user);
	User getUserById(int id);
	List<User> getAllUser();
	User updateUser(User user);
	void deleteUser(int id);
}
