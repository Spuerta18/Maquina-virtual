package com.app.museums.domain;

import java.util.List;

public interface IMuseumsService {
    
    List<Museums> findAll();

    Museums findById(Long id);

    Museums save(Museums user);

    Museums update(Museums user, Long id);

    void deleteById(Long id);
}
