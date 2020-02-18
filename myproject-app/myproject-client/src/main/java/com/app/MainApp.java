package com.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.model.Movie;
import com.app.model.MovieRating;
import com.app.service.MyService_I;
import com.app.service.RatingService_I;

public class MainApp {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		MyService_I service = (MyService_I) context.getBean("service");
		RatingService_I rservice = (RatingService_I) context.getBean("ratingservice");
		
		List<Movie> list = service.moviesLoadAll();
		for(Movie o : list){
			System.out.println(o.getName());
		}
		
		List<MovieRating> ratings = rservice.moviesLoadAll();
		for(MovieRating o : ratings){
			System.out.println(o.getRateValue());
		}

	}
}
