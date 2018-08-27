package com.project1.core.parser;

import com.project1.core.model.FeedModel;

import java.util.List;

public interface FeedRepository <T extends FeedModel> {
    void insert(T feed);
    void delete(T feed);

    List<T> getAll();
}
