package com.user.service.impl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.ERole;
import com.user.entity.Role;
import com.user.entity.User;
import com.user.repo.RoleRepo;
import com.user.repo.UserRepo;



@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepository;
	
	@Autowired
	RoleRepo roleRepository;
	
	@Override
	public User getUser(int userId, ERole roleUser) {
		User user = null;
		Role userRole = roleRepository.findByName(roleUser)
				.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
		Optional<User> userOptional = userRepository.findById(userId);
		if(userOptional.isPresent() && userOptional.get().getRoles().stream().anyMatch(r -> r.getName().equals(userRole.getName()))) {
			user = userOptional.get();
		}
		return user;
	}

}
