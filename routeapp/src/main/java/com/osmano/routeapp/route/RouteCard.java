package com.osmano.routeapp.route;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "route_cards")
public class RouteCard {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    private String title;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name = "route_card_places",
            joinColumns = @JoinColumn(name = "route_card_id")
    )
    @Column(name = "place_name")
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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
