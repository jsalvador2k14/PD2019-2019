package com.distribuida.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecuGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecuGatewayApplication.class, args);
	}
	
	
	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
	    return builder.routes()
	    		.route( p->p
	    				.path("/posts")
	    				.uri( "https://jsonplaceholder.typicode.com/posts" )
	    			)
	    		.route( p->p
	    				.path("/comments")
	    				.uri( "https://jsonplaceholder.typicode.com/comments" )
	    			)
	    		.route( p->p
	    				.path("/usuarios")
	    				.uri( "https://127.0.0.1:7070" )
	    			)
	    		.build();
	}
}
