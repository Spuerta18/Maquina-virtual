package com.app.restaurants.domain;

import java.util.List;

public interface IRestaurantsService {
    
    List<Restaurants> findAll();

    Restaurants findById(Long id);

    Restaurants save(Restaurants user);

    Restaurants update(Restaurants user, Long id);

    void deleteById(Long id);
}
