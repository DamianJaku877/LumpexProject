package pl.sdaacademy.core.reader;

import pl.sdaacademy.core.model.Agency;
import pl.sdaacademy.core.parser.FeedParser;
import pl.sdaacademy.core.repository.FeedRepository;

public class AgencyFeedReader extends BaseFeedReader<Agency> {

    public AgencyFeedReader(FeedParser<Agency> parser, FeedRepository<Agency> repository) {
        super(parser, repository);
    }

    @Override
    public String getFileDir() {
        return "./resources/agency.txt";
    }
}
