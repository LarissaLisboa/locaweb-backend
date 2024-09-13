package com.fiap.locaweb.services;

import com.fiap.locaweb.models.UserModel;
import com.fiap.locaweb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserModel getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public UserModel saveUser(UserModel user) {
        return userRepository.save(user);
    }
}
