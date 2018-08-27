package pl.sdaacademy.core.repository;

import pl.sdaacademy.core.model.FeedModel;

import java.util.List;

public interface FeedRepository<T extends FeedModel> {
    void insert(T feed);

    void delete(T feed);

    List<T> getAll();
}
