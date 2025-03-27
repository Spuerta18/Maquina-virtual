package com.app.users.domain;

import java.util.List;

public interface IUserService {
    
    List<Users> findAll();

    Users findById(Long id);

    Users save(Users user);

    Users update(Users user, Long id);

    void deleteById(Long id);
}
