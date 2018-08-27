package pl.sdaacademy.core.reader;

import pl.sdaacademy.core.model.FeedModel;

public interface FeedReader<T extends FeedModel> {
    void read();

    String getFileDir();
}
