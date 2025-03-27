package com.app.destinations.domain;

import java.util.List;

public interface IDestinationsService {
    
    List<Destinations> findAll();

    Destinations findById(Long id);

    Destinations save(Destinations user);

    Destinations update(Destinations user, Long id);

    void deleteById(Long id);
}
