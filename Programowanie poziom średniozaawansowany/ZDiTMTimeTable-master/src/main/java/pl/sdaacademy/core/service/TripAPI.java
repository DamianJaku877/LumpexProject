package pl.sdaacademy.core.service;

import pl.sdaacademy.core.model.Trip;

import java.util.List;

public interface TripAPI {

    void loadTrips();

    List<Trip> findTripByRouteId(String routeId);

    List<Trip> getAllTrips();

    List<Trip> findTripByTripHeadsign(String tripHeadSign);

    List<Trip> findTripByRouteIdAndHeadsign(String routeId, String tripHeadSign);
}
