package com.recipes.app.services;

import java.util.List;
import java.util.Optional;

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
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()) {
            return user.get();
        }
        return null;
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

    public User update(Long id, User user) {

        Optional<User> searchResult = userRepository.findById(id);

        User userToUpdate = null;
        if (searchResult.isPresent()) {
            userToUpdate = searchResult.get();
            userToUpdate.setName(user.getName());
            userRepository.save(userToUpdate);
        }

        return userToUpdate;
    }

}
