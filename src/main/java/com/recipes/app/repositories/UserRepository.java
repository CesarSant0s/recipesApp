package com.recipes.app.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.recipes.app.model.User;

public interface UserRepository extends CrudRepository<User,Long> {

    List<User> findByName(String name);

    User findById(long id);
}
