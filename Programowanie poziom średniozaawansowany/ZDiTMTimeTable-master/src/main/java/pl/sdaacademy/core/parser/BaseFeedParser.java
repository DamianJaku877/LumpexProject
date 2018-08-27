package pl.sdaacademy.core.parser;

import pl.sdaacademy.core.model.FeedModel;

public abstract class BaseFeedParser<T extends FeedModel> implements FeedParser<T> {

    protected String[] splitFeedInfo;

    public BaseFeedParser() {
        super();
    }

    protected void splitData(String line) {
        line = line.replaceAll("\"", "");
        splitFeedInfo = line.split(FeedParser.DATA_DELIMITER, -1);
    }

    @Override
    public String parseFrom(T feed) {
        throw new UnsupportedOperationException("not implemented yet!");
    }
}
