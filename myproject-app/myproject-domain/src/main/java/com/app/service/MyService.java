package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Movie;
import com.app.repository.MovieRepository;

@Service
public class MyService implements MyService_I{
	@Autowired
	MovieRepository movieRepository;
	
	
	public List<Movie> moviesLoadAll(){
		return movieRepository.findAll();
	}
	
	public Movie movieSave(Movie item){
		return movieRepository.save(item);
	}
}
