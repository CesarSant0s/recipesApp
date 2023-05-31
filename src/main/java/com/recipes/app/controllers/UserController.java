package com.recipes.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.app.model.User;
import com.recipes.app.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "user")
    public List<User> getAllUsers() {
        return userService.list();
    }

    @GetMapping(value = "user/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getById(Long.parseLong(id));
    }

    @PostMapping(value = "user")
    public User registerUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping(value = "user/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.update(Long.parseLong(id), user);
    }

}
