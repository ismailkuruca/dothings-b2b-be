package com.dothings.service;

import com.dothings.model.User;

public interface UserService {

	public abstract User getUserById(Long id);
	
	public abstract User findByEmail(String email);
	
	public abstract User save(User user);
}
