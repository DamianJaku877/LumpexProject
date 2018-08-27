package pl.sdaacademy.controller;

import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.service.TripAPI;
import pl.sdaacademy.view.TripView;

import java.util.List;

public class TripController {
    private final TripAPI tripAPI;
    private final TripView tripView;

    public TripController(TripAPI tripAPI, TripView tripView) {
        this.tripAPI = tripAPI;
        this.tripView = tripView;
        this.tripView.setController(this);
    }

    public void load() {
        tripAPI.loadTrips();
    }

    public List<Trip> getAllTrips() {
        return tripAPI.getAllTrips();
    }

    public List<Trip> findTripByRouteId(String routeId) {
        return tripAPI.findTripByRouteId(routeId);
    }
}
