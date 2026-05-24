package com.osmano.routeapp.route;

import com.osmano.routeapp.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class RouteCardService {

    private final RouteCardValidator routeCardValidator;
    private final NotificationService notificationService;

    public RouteCardService(RouteCardValidator routeCardValidator, NotificationService notificationService) {
        this.routeCardValidator = routeCardValidator;
        this.notificationService = notificationService;
    }

    public RouteCard createRouteCard(RouteCard routeCard) {
        routeCardValidator.validate(routeCard);
        notificationService.notifyRouteCardCreated(routeCard);
        return routeCard;
    }

}
