package com.recipes.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.recipes.app.repositories.UserRepository;

import com.recipes.app.model.User;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    public List<User> list() {
        return (List<User>) userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User update(Long id,User user) {
        User userToUpdate = userRepository.findById(id).get();
        userToUpdate.setName(user.getName());
        return userRepository.save(userToUpdate);
    }

}
