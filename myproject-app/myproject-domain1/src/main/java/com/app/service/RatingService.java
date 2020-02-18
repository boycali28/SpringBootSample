package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.MovieRating;
import com.app.repository.MovieRatingRepository;

@Service
public class RatingService implements RatingService_I{
	@Autowired
	MovieRatingRepository ratingRepository;
	
	
	public List<MovieRating> moviesLoadAll(){
		return ratingRepository.findAll();
	}
	
	public MovieRating movieSave(MovieRating item){
		return ratingRepository.save(item);
	}
}
