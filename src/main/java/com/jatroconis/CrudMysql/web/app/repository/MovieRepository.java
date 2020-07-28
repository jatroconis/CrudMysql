package com.jatroconis.CrudMysql.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jatroconis.CrudMysql.web.app.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
