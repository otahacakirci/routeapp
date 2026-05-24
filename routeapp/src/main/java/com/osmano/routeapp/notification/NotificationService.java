package com.osmano.routeapp.notification;

import com.osmano.routeapp.route.RouteCard;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void notifyRouteCardCreated(RouteCard routeCard) {
        System.out.println("A new itinerary has been created: " + routeCard.getTitle());
    }
}
