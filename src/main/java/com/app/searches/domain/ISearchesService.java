package com.app.searches.domain;

import java.util.List;

public interface ISearchesService {
    
    List<Searches> findAll();

    Searches findById(Long id);

    Searches save(Searches user);

    Searches update(Searches user, Long id);

    void deleteById(Long id);
}
