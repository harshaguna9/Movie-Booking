package com.moviebookingspring.moviebooking.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviebookingspring.moviebooking.entity.Movie;
import com.moviebookingspring.moviebooking.repository.MovieRepo;

@Transactional
@Service
public class MovieService {

		@Autowired
		private MovieRepo movierepo;

		public void saveMovie(Movie mve)
		{
			 movierepo.save(mve);
		}
		
		public void saveAllMovies(List<Movie> mve)
		{
			 movierepo.saveAll(mve);
		}
		
		public List<Movie> getAllMovies()
		{
			 return movierepo.findAll();
		}
		
		public Optional<Movie> getMovie(long id)
		{
			 return movierepo.findById(id);
		}
		
		public void deleteMovie(long id)
		{
			movierepo.deleteById(id);
		}
		
		public void updateMovie(Movie mve)
		{
			movierepo.save(mve);
		}
}
