package com.jatroconis.CrudMysql.web.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jatroconis.CrudMysql.web.app.model.Movie;
import com.jatroconis.CrudMysql.web.app.model.UserMovie;
import com.jatroconis.CrudMysql.web.app.repository.UserMovieRepository;
import com.jatroconis.CrudMysql.web.app.services.UserMovieServices;

@Service
public class UserMovieServicesImpl implements UserMovieServices {

	@Autowired
	UserMovieRepository umr;
	
	@Override
	public UserMovie createUserMovieService(UserMovie um) {
		// TODO Auto-generated method stub
		return umr.save(um);
	}
	
	@Override
	public UserMovie readUserMovieService(Long id) {
		// TODO Auto-generated method stub
		return umr.findById(id).get();
	}
	
	@Override
	public UserMovie uptaUserMovieService(UserMovie um) {
		if (readUserMovieService(um.getId()) == null) {
			throw new RuntimeException("No existe esta pelicula");
		}
		return umr.save(um);
	}	
	
	@Override
	public void deleteUserMovieService(Long id) {
		// TODO Auto-generated method stub
		umr.deleteById(id);
	}
	
	@Override
	public List<UserMovie> getList() {
		// TODO Auto-generated method stub
		return umr.findAll();
	}
	
}
