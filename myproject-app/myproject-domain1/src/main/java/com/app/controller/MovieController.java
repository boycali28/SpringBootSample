package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.MovieRating;
import com.app.service.RatingService;

@RestController
public class MovieController {
	@Autowired
	RatingService service;
	
	@RequestMapping("/ratings")
	public List<MovieRating> getMovies(){
		
		return service.moviesLoadAll();
	}
}
