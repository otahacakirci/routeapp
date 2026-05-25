package com.osmano.routeapp.config;

import com.osmano.routeapp.route.RouteCard;
import com.osmano.routeapp.route.RouteCardService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AppStartupRunner implements CommandLineRunner {

    @Value("${app.startup.demo-enabled}")
    private boolean demoEnabled;

    private final RouteCardService routeCardService;

    public AppStartupRunner(RouteCardService routeCardService) {
        this.routeCardService = routeCardService;
    }


    @Override
    public void run(String ... args) throws Exception  {

        if(!demoEnabled) {
            System.out.println("Startup demo is disabled.");
        }

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
    }



}
