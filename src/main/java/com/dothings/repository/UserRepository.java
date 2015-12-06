package com.dothings.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dothings.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public abstract User findByEmail(String email);
	
	public abstract List<User> findByDepartment(String department);
	
	public abstract List<User> findByTitle(String title);
	
	public abstract List<User> findByDisplayNameIgnoreCaseContaining(String displayName);
}
