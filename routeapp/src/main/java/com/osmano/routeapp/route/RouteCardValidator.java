package com.osmano.routeapp.route;

import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class RouteCardValidator {

    public void validate(RouteCard routeCard) {

        if (routeCard == null) {
            throw new IllegalArgumentException("Route card cannot be null.");
        }


        if (routeCard.getTitle() == null || routeCard.getTitle().isBlank()) {
            throw new IllegalArgumentException("Route card title cannot be blank.");
        }


        List<String> places = routeCard.getPlaces();

        if (places == null) {
            throw new IllegalArgumentException("Route card must contain at least two places.");
        }

        if (places.size() < 2) {
            throw new IllegalArgumentException("Route card must contain at least two places.");
        }

        if (places.size() > 3) {
            throw new IllegalArgumentException("Route card must contain at most three places.");
        }

    }
}
