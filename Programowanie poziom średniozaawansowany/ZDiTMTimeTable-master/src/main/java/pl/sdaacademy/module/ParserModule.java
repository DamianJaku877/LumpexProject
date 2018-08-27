package pl.sdaacademy.module;

import pl.sdaacademy.core.model.Agency;
import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.parser.AgencyParser;
import pl.sdaacademy.core.parser.FeedParser;
import pl.sdaacademy.core.parser.TripParser;

public class ParserModule {

    private static AgencyParser agencyParser;
    private static TripParser tripParser;

    public static FeedParser<Agency> provideAgencyParser() {
        if (agencyParser == null) {
            agencyParser = new AgencyParser();
        }
        return agencyParser;
    }

    public static FeedParser<Trip> provideTripParser() {
        if (tripParser == null) {
            tripParser = new TripParser();
        }
        return tripParser;
    }
}
