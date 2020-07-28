package com.jatroconis.CrudMysql.web.app.services;

import java.util.List;

import com.jatroconis.CrudMysql.web.app.model.Movie;

public interface MovieServices {

	Movie createMovie(Movie us);
	Movie readMovie(Long id);
	Movie uptaMovie(Movie us);
	void deleteMovie(Long id);
	List<Movie> getList();
	
}
