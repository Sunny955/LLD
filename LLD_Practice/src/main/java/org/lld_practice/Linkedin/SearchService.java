package org.lld_practice.Linkedin;

import java.util.List;

@SuppressWarnings("unused")
public class SearchService {
    private SerachStrategy serachStrategy;
    private String query;

    public SearchService(SerachStrategy serachStrategy, String query) {
        this.serachStrategy = serachStrategy;
        this.query = query;
    }

    public List<User> search(SerachStrategy strategy, String qString) {
        return strategy.search(qString);
    }

}
