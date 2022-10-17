package com.user.service.impl;


import com.user.entity.ERole;
import com.user.entity.User;


public interface UserService {

	User getUser(int userId, ERole roleUser);
	
}


