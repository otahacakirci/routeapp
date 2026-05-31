package com.osmano.routeapp.route;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RouteCardRepository extends JpaRepository<RouteCard, Long> {
}
