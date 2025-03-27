package com.app.hotels.domain;

import java.util.List;

public interface IHotelsService {
    
    List<Hotels> findAll();

    Hotels findById(Long id);

    Hotels save(Hotels user);

    Hotels update(Hotels user, Long id);

    void deleteById(Long id);
}
