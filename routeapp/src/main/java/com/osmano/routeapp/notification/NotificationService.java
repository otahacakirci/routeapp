package com.osmano.routeapp.notification;

import com.osmano.routeapp.route.RouteCard;
import com.osmano.routeapp.route.RouteCardValidator;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public static void notifyRouteCardCreated(RouteCard routeCard) {
        System.out.println("A new itinerary has been created: " + routeCard.getTitle());
    }
}
