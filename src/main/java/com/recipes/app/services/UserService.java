package com.recipes.app.services;

import org.springframework.stereotype.Service;

import com.recipes.app.repositories.UserRepository;

import com.recipes.app.model.User;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(Long id) {
        return  userRepository.findById(id).get();
    }

}
