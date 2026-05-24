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
        RouteCard validatedRouteCard = routeCardValidator.validateRouteCard(routeCard);
        notificationService.notifyRouteCardCreated(validatedRouteCard);
        return validatedRouteCard;
    }

}
