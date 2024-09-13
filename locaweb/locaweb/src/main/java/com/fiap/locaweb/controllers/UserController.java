package com.fiap.locaweb.controllers;

import com.fiap.locaweb.models.UserModel;
import com.fiap.locaweb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{username}")
    public UserModel getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {

        return userService.saveUser(user);
    }
}
