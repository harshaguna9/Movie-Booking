package com.moviebookingspring.moviebooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviebookingspring.moviebooking.entity.Movie;
import com.moviebookingspring.moviebooking.service.MovieService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService movieservice;
	
	@PostMapping("/addmovie")
	public void saveMovie(@RequestBody Movie mve)
	{
		movieservice.saveMovie(mve);
	}
	
	@PostMapping("/addmovies")
	public void saveAllMovies(@RequestBody List<Movie> mve)
	{
		movieservice.saveAllMovies(mve);
	}
	
	@GetMapping("/{id}")
	public Optional<Movie> getMovie(@PathVariable long id)
	{
		return movieservice.getMovie(id);	
	}
	
	@GetMapping("/allmovies")
	public List<Movie> getAllMovies()
	{
		return movieservice.getAllMovies();	
	}
	
	@PutMapping("/updatescrn")
	public void updateMovie(@RequestBody Movie mve)
	{
		 movieservice.updateMovie(mve);
	}
	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable long id)
	{
		 movieservice.deleteMovie(id);
	}
}
