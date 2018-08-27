package pl.sdaacademy.module;

import pl.sdaacademy.core.model.Agency;
import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.repository.AgencyRepository;
import pl.sdaacademy.core.repository.FeedRepository;
import pl.sdaacademy.core.repository.TripRepository;

public class RepositoryModule {
    private static AgencyRepository agencyRepository;
    private static TripRepository tripRepository;

    public static FeedRepository<Agency> provideAgencyRepository() {
        if (agencyRepository == null) {
            agencyRepository = new AgencyRepository();
        }
        return agencyRepository;
    }

    public static FeedRepository<Trip> provideTripRepository() {
        if (tripRepository == null) {
            tripRepository = new TripRepository();
        }
        return tripRepository;
    }
}
