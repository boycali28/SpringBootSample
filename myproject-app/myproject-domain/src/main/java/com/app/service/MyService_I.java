package com.app.service;

import java.util.List;

import com.app.model.Movie;

public interface MyService_I {
	public List<Movie> moviesLoadAll();
	
	public Movie movieSave(Movie item);
}
