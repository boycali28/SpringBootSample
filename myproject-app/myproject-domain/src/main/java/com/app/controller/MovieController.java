package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Movie;
import com.app.service.MyService;

@RestController
public class MovieController {
	@Autowired
	MyService service;
	
	@RequestMapping("/movies")
	public List<Movie> getMovies(){
		
		return service.moviesLoadAll();
	}
}
