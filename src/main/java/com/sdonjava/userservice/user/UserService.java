package com.sdonjava.userservice.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
            userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public User getUserById(long id) {
       return userRepository.findById(id);
    }

    public List<User> getUserBySurName(String surName) {
        List<User> users = new ArrayList<>();
        userRepository.findBySurName(surName).forEach(users::add);
        return users;
    }

    public void addUser(User user) {
        userRepository.save(user);
    }
}
