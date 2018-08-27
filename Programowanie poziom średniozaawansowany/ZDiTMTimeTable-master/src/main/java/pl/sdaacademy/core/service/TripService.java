package pl.sdaacademy.core.service;

import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.reader.FeedReader;
import pl.sdaacademy.core.repository.FeedRepository;

import java.util.ArrayList;
import java.util.List;

public class TripService implements TripAPI {

    private final FeedRepository<Trip> tripFeedRepository;
    private final FeedReader<Trip> feedReader;

    public TripService(FeedRepository<Trip> tripFeedRepository, FeedReader<Trip> feedReader) {
        this.tripFeedRepository = tripFeedRepository;
        this.feedReader = feedReader;
    }

    @Override
    public void loadTrips() {
        feedReader.read();
    }

    @Override
    public List<Trip> findTripByRouteId(String routeId) {
        List<Trip> routeTrips = new ArrayList<>();
        for (Trip trip : tripFeedRepository.getAll()) {
            if (trip.getRouteId().equals(routeId)) {
                routeTrips.add(trip);
            }
        }
        return routeTrips;
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripFeedRepository.getAll();
    }

    @Override
    public List<Trip> findTripByTripHeadsign(String tripHeadSign) {
        return null;
    }

    @Override
    public List<Trip> findTripByRouteIdAndHeadsign(String routeId, String tripHeadSign) {
        List<Trip> routeTrips = new ArrayList<>();
        for (Trip trip : tripFeedRepository.getAll()) {
            if (trip.getRouteId().equals(routeId) && trip.getTripHeadsign().equals(tripHeadSign)) {
                routeTrips.add(trip);
            }
        }
        return routeTrips;
    }
}
