package com.osmano.routeapp.route;

import com.osmano.routeapp.notification.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class RouteCardService {

    private final RouteCardValidator routeCardValidator;
    private final NotificationService notificationService;
    private final RouteCardRepository routeCardRepository;

    public RouteCardService(RouteCardValidator routeCardValidator, NotificationService notificationService, RouteCardRepository routeCardRepository) {
        this.routeCardValidator = routeCardValidator;
        this.notificationService = notificationService;
        this.routeCardRepository = routeCardRepository;
    }

    public RouteCard createRouteCard(RouteCard routeCard) {
        routeCardValidator.validate(routeCard);
        RouteCard savedRouteCard = routeCardRepository.save(routeCard);
        notificationService.notifyRouteCardCreated(savedRouteCard);
        return savedRouteCard;

    }

}
