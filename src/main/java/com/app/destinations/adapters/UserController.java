package com.app.destinations.adapters;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.app.users.domain.IUserService;
import com.app.users.domain.Users;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    // all users
    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    // user by id
    @GetMapping("/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable Long id) {
        Users user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    // create user
    @PostMapping
    public ResponseEntity<Users> createUser(@RequestBody Users user) {
        Users newUser = userService.save(user);
        return ResponseEntity.ok(newUser);
    }

    // update user
    @PutMapping("/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable Long id, @RequestBody Users user) {
        Users updatedUser = userService.update(user, id);
        return ResponseEntity.ok(updatedUser);
    }

    // delete user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
