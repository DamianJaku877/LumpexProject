package pl.sdaacademy.core.parser;

import pl.sdaacademy.core.model.FeedModel;

public interface FeedParser<T extends FeedModel> {

    public static final String DATA_DELIMITER = ",";

    T parseTo(String feedInfo);

    String parseFrom(T feed);
}
