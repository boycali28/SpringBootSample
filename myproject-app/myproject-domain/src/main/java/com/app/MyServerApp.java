package com.app;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.app.model.Movie;
import com.app.service.MyService;
import com.app.service.MyService_I;

@SpringBootApplication
public class MyServerApp {
	@Autowired
	MyService myService;
	
	@Bean(name = "/service") HttpInvokerServiceExporter UserServer() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(myService);
		exporter.setServiceInterface(MyService_I.class);
		return exporter;
	}
//	@PostConstruct
//	public void addUser() throws Exception{
//		Movie m = new Movie();
//		m.setName("Spiderman");
//		m.setDescription("Action");
//		m = myService.movieSave(m);
//		
//		m = new Movie();
//		m.setName("Titanic");
//		m.setDescription("Romance");
//		m = myService.movieSave(m);
//		
//	}
	public static void main(String[] args){
		SpringApplication.run(MyServerApp.class, args);
	}
}
