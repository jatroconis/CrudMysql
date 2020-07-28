package com.jatroconis.CrudMysql.web.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jatroconis.CrudMysql.web.app.model.Movie;
import com.jatroconis.CrudMysql.web.app.repository.MovieRepository;
import com.jatroconis.CrudMysql.web.app.services.MovieServices;

@Service
public class MovieServicesImpl implements MovieServices {

	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public Movie createMovie(Movie mov) {
		// TODO Auto-generated method stub
		return movieRepository.save(mov);
	}

	@Override
	public Movie readMovie(Long id) {
		// TODO Auto-generated method stub
		return movieRepository.findById(id).get();
	}

	@Override
	public Movie uptaMovie(Movie mov) {
		// TODO Auto-generated method stub
		if (readMovie(mov.getId()) == null) {
			throw new RuntimeException("No existe esta pelicula");
		}
		return movieRepository.save(mov);
	}

	@Override
	public void deleteMovie(Long id) {
		// TODO Auto-generated method stub
		movieRepository.deleteById(id);
	}

	@Override
	public List<Movie> getList() {
		// TODO Auto-generated method stub
		return movieRepository.findAll();
	}
}
