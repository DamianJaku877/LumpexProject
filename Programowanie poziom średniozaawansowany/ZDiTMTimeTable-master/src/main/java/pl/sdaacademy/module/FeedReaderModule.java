package pl.sdaacademy.module;

import pl.sdaacademy.core.model.Agency;
import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.parser.FeedParser;
import pl.sdaacademy.core.reader.AgencyFeedReader;
import pl.sdaacademy.core.reader.FeedReader;
import pl.sdaacademy.core.reader.TripFeedReader;
import pl.sdaacademy.core.repository.FeedRepository;

public class FeedReaderModule {

    private static FeedReader<Agency> agencyFileReader;
    private static FeedReader<Trip> tripFileReader;

    public static FeedReader<Agency> provideAgencyFileReader(FeedParser<Agency> parser,
                                                             FeedRepository<Agency> repository) {
        if (agencyFileReader == null) {
            agencyFileReader = new AgencyFeedReader(parser, repository);
        }
        return agencyFileReader;
    }

    public static FeedReader<Trip> provideTripFileReader(FeedParser<Trip> parser,
                                                         FeedRepository<Trip> repository) {
        if (tripFileReader == null) {
            tripFileReader = new TripFeedReader(parser, repository);
        }
        return tripFileReader;
    }

    //Optionally
//    public static FeedReader<Agency> provideAgencyFileReader() {
//        if (agencyFileReader == null) {
//            agencyFileReader = new AgencyFeedReader(ParserModule.provideAgencyParser()
//                    , RepositoryModule.provideAgencyRepository());
//        }
//        return agencyFileReader;
//    }
}
