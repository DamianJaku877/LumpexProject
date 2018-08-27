package pl.sdaacademy.core.repository;

import pl.sdaacademy.core.model.FeedModel;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFeedRepository<T extends FeedModel> implements FeedRepository<T> {

    private final List<T> repository = new ArrayList<>();

    @Override
    public void insert(T feed) {
        repository.add(feed);
    }

    @Override
    public void delete(T feed) {
        repository.remove(feed);
    }

    @Override
    public List<T> getAll() {
        return repository;
    }
}
