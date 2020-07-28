package com.jatroconis.CrudMysql.web.app.services;

import java.util.List;

import com.jatroconis.CrudMysql.web.app.model.Movie;
import com.jatroconis.CrudMysql.web.app.model.UserMovie;


public interface UserMovieServices {

	UserMovie createUserMovieService(UserMovie um);
	UserMovie readUserMovieService(Long id);
	UserMovie uptaUserMovieService(UserMovie um);
	void deleteUserMovieService(Long id);
	List<UserMovie> getList();
	
	
}
