package com.app.searches.application;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.shared.adapters.exception.ResourceNotFoundException;

import com.app.users.domain.IUserRepository;
import com.app.users.domain.IUserService;
import com.app.users.domain.Users;

@Service
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Users findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("user not found with ID: " + id));
    }

    @Override
    @Transactional
    public Users save(Users user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("email registred: " + user.getEmail());
        }
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public Users update(Users user, Long id) {
        Users existingUser = findById(id);
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return userRepository.save(existingUser);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Users user = findById(id);
        userRepository.delete(user);
    }
}
