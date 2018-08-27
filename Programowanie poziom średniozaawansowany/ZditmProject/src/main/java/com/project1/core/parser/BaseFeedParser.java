package com.project1.core.parser;

import com.project1.core.model.Agency;
import com.project1.core.model.FeedModel;

public abstract class BaseFeedParser <T extends FeedModel> implements FeedParser<T>{

    protected String[] splitFeedInfo;

    public BaseFeedParser(){
        super();
    }
    @Override
    public T parseTo(String line){
        line = line.replaceAll("\"", "");
        splitFeedInfo = line.split(FeedParser.DATA_DELIMITER, -1) ;
        return null;
    }

    public String parseFrom(Agency feed) {
        return null;
    }

}
