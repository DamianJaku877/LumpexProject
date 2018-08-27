package pl.sdaacademy.module;

import pl.sdaacademy.core.service.TripAPI;
import pl.sdaacademy.core.service.TripService;

public class ServiceModule {

    private static TripAPI tripService;

    public static TripAPI provideTripService() {
        if (tripService == null) {
            return new TripService(RepositoryModule.provideTripRepository(),
                    FeedReaderModule.provideTripFileReader(
                            ParserModule.provideTripParser(),
                            RepositoryModule.provideTripRepository()));
        }
        return tripService;
    }
}
