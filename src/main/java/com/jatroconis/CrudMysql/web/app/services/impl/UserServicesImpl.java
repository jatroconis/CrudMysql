package com.jatroconis.CrudMysql.web.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jatroconis.CrudMysql.web.app.model.User;
import com.jatroconis.CrudMysql.web.app.repository.UserRepository;
import com.jatroconis.CrudMysql.web.app.services.UserService;

@Service
public class UserServicesImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	@Override
	public User createUser(User us) {
		// TODO Auto-generated method stub
		return userRepository.save(us);
	}

	@Override
	public User readUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public User uptaUser(User us) {
		// TODO Auto-generated method stub
		if (readUser(us.getId()) == null) {
			throw new RuntimeException("No existe este usuario");
		}
		return userRepository.save(us);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

	@Override
	public List<User> getList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
