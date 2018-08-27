package pl.sdaacademy.core.reader;

import pl.sdaacademy.core.model.Trip;
import pl.sdaacademy.core.parser.FeedParser;
import pl.sdaacademy.core.repository.FeedRepository;

public class TripFeedReader extends BaseFeedReader<Trip> {

    public TripFeedReader(FeedParser<Trip> parser, FeedRepository<Trip> repository) {
        super(parser, repository);
    }

    @Override
    public String getFileDir() {
        return "./resources/trips.txt";
    }
}
