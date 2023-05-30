package com.recipes.app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.app.model.User;
import com.recipes.app.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "user")
    public List<User> getAllUsers() {
        return userService.list();
    }

    @GetMapping(value = "user")
    public User getUserById(@RequestParam(value = "id", defaultValue = "1") Long id) {
        return userService.getById(id);
    }

    @PostMapping(value = "user")
    public User registerUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping(value = "user/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }

}
