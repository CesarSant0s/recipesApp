package com.recipes.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recipes.app.model.User;
import com.recipes.app.services.UserService;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public User getUserById(@RequestParam(value = "id", defaultValue = "1") Long id){
        return userService.getUserById(null);
    }
    
}
