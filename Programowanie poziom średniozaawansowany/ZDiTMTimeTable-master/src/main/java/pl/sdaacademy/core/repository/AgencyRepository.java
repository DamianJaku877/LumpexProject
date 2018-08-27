package pl.sdaacademy.core.repository;

import pl.sdaacademy.core.model.Agency;

import java.util.ArrayList;
import java.util.List;

public class AgencyRepository implements FeedRepository<Agency> {

    private final List<Agency> agencyList = new ArrayList<>();

    @Override
    public void insert(Agency feed) {
        agencyList.add(feed);
    }

    @Override
    public void delete(Agency feed) {
        agencyList.remove(feed);
    }

    @Override
    public List<Agency> getAll() {
        return agencyList;
    }
}
