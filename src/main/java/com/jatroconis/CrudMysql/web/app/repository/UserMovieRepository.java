package com.jatroconis.CrudMysql.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jatroconis.CrudMysql.web.app.model.UserMovie;

public interface UserMovieRepository extends JpaRepository<UserMovie, Long> {

}
