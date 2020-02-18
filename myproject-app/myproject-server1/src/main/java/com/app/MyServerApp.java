package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.app.service.RatingService;
import com.app.service.RatingService_I;

@SpringBootApplication
public class MyServerApp extends SpringBootServletInitializer{
	@Autowired
	RatingService service;
	
	@Bean(name = "/ratingservice") HttpInvokerServiceExporter UserServer() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(RatingService_I.class);
		return exporter;
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
	return builder.sources(MyServerApp.class);
	}

	
	public static void main(String[] args) {
		SpringApplication.run(MyServerApp.class, args);
	}
}
