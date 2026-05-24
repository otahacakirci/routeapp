package com.osmano.routeapp.route;

import org.springframework.stereotype.Component;
import org.springframework.util.RouteMatcher;

import java.util.List;

@Component
public class RouteCardValidator {

    public static RouteCard validateRouteCard(RouteCard routeCard) {

        if (routeCard == null) {
            throw new IllegalArgumentException("RouteCard cannot be null");
        }


        if (routeCard.getTitle() == null || routeCard.getTitle().isBlank()) {
            throw new IllegalArgumentException("Title required");
        }


        List<String> places = routeCard.getPlaces();
        if (places == null || places.size() < 2 || places.size() > 3) {
            throw new IllegalArgumentException("Places should meet the necessary conditions.");
        }

        return routeCard;
    }
}
