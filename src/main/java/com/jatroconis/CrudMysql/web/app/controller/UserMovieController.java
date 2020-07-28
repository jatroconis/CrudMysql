package com.jatroconis.CrudMysql.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.jatroconis.CrudMysql.web.app.model.UserMovie;
import com.jatroconis.CrudMysql.web.app.services.UserMovieServices;

@RestController("/Hola")
public class UserMovieController {
	@Autowired
	UserMovieServices umr;
	
	@PostMapping("/create")
	public UserMovie createUserMovie(@RequestBody UserMovie usermovie) {		
		return umr.createUserMovieService(usermovie);
	}
	
	@GetMapping("/{idUserMovie}")
	public UserMovie readUserMovie(@PathVariable Long idUsermovie) {
		return umr.readUserMovieService(idUsermovie);
	}
	
	@DeleteMapping("/{idUserMovie}")
	public void deleteUserMovie(@PathVariable Long idUsermovie) {
		umr.deleteUserMovieService(idUsermovie);
	}
	
	@PutMapping
	public UserMovie updateUserMovie(@RequestBody UserMovie usermovie) {		
		return umr.uptaUserMovieService(usermovie);
	}
	
	@GetMapping
	public List<UserMovie> listUserMovie(){
		return umr.getList();
	}
	
	
	
}
