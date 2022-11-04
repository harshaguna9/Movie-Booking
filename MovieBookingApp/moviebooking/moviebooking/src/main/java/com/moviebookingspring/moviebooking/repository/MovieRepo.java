package com.moviebookingspring.moviebooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviebookingspring.moviebooking.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie, Long> {

}
