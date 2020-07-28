package com.jatroconis.CrudMysql.web.app.services;

import java.util.List;

import com.jatroconis.CrudMysql.web.app.model.User;


public interface UserService {
	
	User createUser(User us);
	User readUser(Long id);
	User uptaUser(User us);
	void deleteUser(Long id);
	List<User> getList();
}
