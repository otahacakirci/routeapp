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

	@Bean
	public CommandLineRunner run(RouteCardService routeCardService) {
		return args -> {
			RouteCard validRouteCard = new RouteCard(
					"Kampüs Sonrası Mini Rota",
					List.of("Kahveci", "Kütüphane", "Park")
			);

			RouteCard createdRouteCard = routeCardService.createRouteCard(validRouteCard);

			System.out.println("Created route card: " + createdRouteCard.getTitle());
			System.out.println("Places: " + createdRouteCard.getPlaces());

			RouteCard invalidRouteCard = new RouteCard(
					"Bozuk Rota",
					List.of("Kahveci")
			);

			try {
				routeCardService.createRouteCard(invalidRouteCard);
			} catch (IllegalArgumentException exception) {
				System.out.println("Validation error: " + exception.getMessage());
			}
		};
	}

}
