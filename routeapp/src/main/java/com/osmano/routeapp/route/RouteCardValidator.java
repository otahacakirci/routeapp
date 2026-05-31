package com.osmano.routeapp.route;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class RouteCardValidator {

    private final int minPlaces;
    private final int maxPlaces;

    public RouteCardValidator(
            @Value("${app.route-card.min-places}") int minPlaces,
            @Value("${app.route-card.max-places}") int maxPlaces
    ) {
        this.minPlaces = minPlaces;
        this.maxPlaces = maxPlaces;
    }

    public void validate(RouteCard routeCard) {

        if (routeCard == null) {
            throw new IllegalArgumentException("Route card cannot be null.");
        }


        if (routeCard.getTitle() == null || routeCard.getTitle().isBlank()) {
            throw new IllegalArgumentException("Route card title cannot be blank.");
        }


        List<String> places = routeCard.getPlaces();

        if (places == null) {
            throw new IllegalArgumentException("Route card places cannot be null.");
        }

        if (places.size() < minPlaces) {
            throw new IllegalArgumentException("Route card must contain at least "+ minPlaces +" places.");
        }

        if (places.size() > maxPlaces) {
            throw new IllegalArgumentException("Route card must contain at most "+ maxPlaces +" places.");
        }

    }
}
