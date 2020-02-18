package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.app.service.MyService_I;
import com.app.service.RatingService_I;


@Configuration		
@PropertySource("classpath:application.properties")
public class SpringContext  {
	private String local = "http://localhost:8080/service";
	private String localRating = "http://localhost:8081/ratingservice";
	private String remote = "http://localhost:8080/MovieServer/service";
	private String remoteRating = "http://localhost:8080/MovieRatingServer/ratingservice";
//	s
	
	
	@Bean(name = "service")
	public HttpInvokerProxyFactoryBean invoker() {
		
		HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
		invoker.setServiceUrl(remote);
		invoker.setServiceInterface(MyService_I.class);
		return invoker;
	}
	@Bean(name = "ratingservice")
	public HttpInvokerProxyFactoryBean invokerRating() {
		
		HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
		invoker.setServiceUrl(remoteRating);
		invoker.setServiceInterface(RatingService_I.class);
		return invoker;
	}
	
	


	@Bean
	public static PropertySourcesPlaceholderConfigurer setUp() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
