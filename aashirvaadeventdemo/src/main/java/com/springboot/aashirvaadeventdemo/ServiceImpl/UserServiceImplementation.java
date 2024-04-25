package com.springboot.aashirvaadeventdemo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.aashirvaadeventdemo.Service.UserService;
import com.springboot.aashirvaadeventdemo.entity.Order;
import com.springboot.aashirvaadeventdemo.entity.User;
import com.springboot.aashirvaadeventdemo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
    
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		User u1 = userRepository.save(user); 
		return u1;
	}
    
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User existingUser = userRepository.findById(user.getUserId()).get();
		existingUser.setUserName(user.getUserName());
		existingUser.setUserEmail(user.getUserEmail());
		
		User updateUser= userRepository.save(existingUser);
		return updateUser;
	}
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<User> u1 = userRepository.findById(id);
		if(u1.isPresent()) {
			return u1.get();
		}
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	
	

}
