package com.osmano.routeapp.route;

import java.util.List;

public class RouteCard {

    private String title;

    private List<String> places;

    public RouteCard() {
    }

    public RouteCard(String title, List<String> places) {
        this.title = title;
        this.places = places;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }


}
