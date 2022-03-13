package com.dts.delicate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dts.delicate.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
