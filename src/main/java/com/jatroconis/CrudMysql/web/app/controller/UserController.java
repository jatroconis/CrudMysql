package com.jatroconis.CrudMysql.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jatroconis.CrudMysql.web.app.model.User;
import com.jatroconis.CrudMysql.web.app.services.UserService;

@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	UserService us;
	
	@PostMapping
	public User createUser(@RequestBody User user) {		
		return us.createUser(user);
	}
	
	@GetMapping("/{idUser}")
	public User readUser(@PathVariable Long idUser) {
		return us.readUser(idUser);
	}
	
	@DeleteMapping("/{idUser}")
	public void deleteUser(@PathVariable Long idUser) {
		us.deleteUser(idUser);
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) {		
		return us.uptaUser(user);
	}
	
	@GetMapping
	public List<User> listUser(){
		return us.getList();
	}
	
	
}
