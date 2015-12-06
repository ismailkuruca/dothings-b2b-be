package com.dothings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dothings.client.UserMapper;
import com.dothings.model.User;
import com.dothings.model.UserExample;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

	@Override
	public User findByEmail(String email) {
		UserExample example = new UserExample();
		example.createCriteria().andEmailEqualTo(email);

		List<User> selectByExample = userMapper.selectByExample(example);
		if (selectByExample.size() > 0) {
			return selectByExample.get(0);
		}
		return null;
	}
	
	@Override
	public User save(User user){
		int insert = userMapper.insert(user);
		User findByEmail = findByEmail(user.getEmail());
		return findByEmail;
	}

}
