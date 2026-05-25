package com.osmano.routeapp;

import com.osmano.routeapp.route.RouteCard;
import com.osmano.routeapp.route.RouteCardService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RouteappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouteappApplication.class, args);
	}
}
