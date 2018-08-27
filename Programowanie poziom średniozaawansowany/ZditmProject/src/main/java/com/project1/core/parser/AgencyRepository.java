package com.project1.core.parser;

import com.project1.core.model.Agency;
import java.util.ArrayList;
import java.util.List;

public class AgencyRepository implements FeedRepository<Agency> {

    private final List<Agency> agencyList = new ArrayList<Agency>();

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
