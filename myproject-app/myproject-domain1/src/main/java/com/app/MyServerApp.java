package com.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.app.model.MovieRating;
import com.app.service.RatingService;
import com.app.service.RatingService_I;

@SpringBootApplication
public class MyServerApp {
	@Autowired
	RatingService service;
	
	@Bean(name = "/ratingservice") HttpInvokerServiceExporter UserServer() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(RatingService_I.class);
		return exporter;
	}
//	@PostConstruct
//	public void addUser() throws Exception{
//		MovieRating m = new MovieRating();
//		m.setCommentName("Pangit");
//		m.setRateValue(3);
//		m = myService.movieSave(m);
//		
//		m = new MovieRating();
//		m.setCommentName("Ganda");
//		m.setRateValue(5);
//		m = myService.movieSave(m);
//		
//	}
	public static void main(String[] args){
		SpringApplication.run(MyServerApp.class, args);
	}
}
