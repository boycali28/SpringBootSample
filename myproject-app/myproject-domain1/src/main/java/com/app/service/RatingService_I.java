package com.app.service;

import java.util.List;

import com.app.model.MovieRating;

public interface RatingService_I {
	public List<MovieRating> moviesLoadAll();
	public MovieRating movieSave(MovieRating item);
}
