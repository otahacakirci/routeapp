package com.osmano.routeapp.route;

import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class RouteCardValidator {

    public void validateRouteCard(RouteCard routeCard) {

        if (routeCard == null) {
            throw new IllegalArgumentException("RouteCard cannot be null");
        }


        if (routeCard.getTitle() == null || routeCard.getTitle().isBlank()) {
            throw new IllegalArgumentException("Route Card Title cannot be blank.");
        }


        List<String> places = routeCard.getPlaces();

        if (places == null || places.isEmpty()) {
            throw new IllegalArgumentException("Route card should have at least two place.");
        }

        if (places.size() < 2) {
            throw new IllegalArgumentException("Route card should have at least two place.");
        }

        if (places.size() > 3) {
            throw new IllegalArgumentException("Route card should have maximum three place.");
        }

    }
}
