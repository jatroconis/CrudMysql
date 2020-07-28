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

import com.jatroconis.CrudMysql.web.app.model.Movie;
import com.jatroconis.CrudMysql.web.app.services.MovieServices;

@RestController("/peliculas")
public class MovieController {

	@Autowired
	MovieServices ms;
	
	@PostMapping("/create")
	public Movie createMovie(@RequestBody Movie mov) {		
		return ms.createMovie(mov);
	}
	
	@GetMapping("/{idMovie}")
	public Movie readUser(@PathVariable Long idMov) {
		return ms.readMovie(idMov);
	}
	
	@DeleteMapping("/{idMovie}")
	public void deleteUser(@PathVariable Long idMov) {
		ms.deleteMovie(idMov);
	}
	
	@PutMapping("/update")
	public Movie updateUser(@RequestBody Movie mov) {		
		return ms.uptaMovie(mov);
	}
	
	@GetMapping("/list")
	public List<Movie> listMovie(){
		return ms.getList();
	}
	
	
	
}
