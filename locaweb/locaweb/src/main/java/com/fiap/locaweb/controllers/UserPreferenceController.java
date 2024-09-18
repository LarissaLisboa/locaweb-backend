package com.fiap.locaweb.controllers;

import com.fiap.locaweb.models.UserPreferenceModel;
import com.fiap.locaweb.repositories.UserPreferenceRepository;
import com.fiap.locaweb.services.UserPreferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/preferences")
public class UserPreferenceController {
    @Autowired
    private UserPreferenceService userPreferenceService;


    @GetMapping("/{id}")
    public Optional<UserPreferenceModel> getUserPreference(@PathVariable Long id) {
        return userPreferenceService.getUserPreference(id);
    }

   @PostMapping
    public UserPreferenceModel saveUserPreference(@RequestBody UserPreferenceModel userPreference) {
        return userPreferenceService.saveUserPreference(userPreference);
    }

    @PatchMapping("/{id}")
    public UserPreferenceModel updateUserPreference(@PathVariable Long id, @RequestBody UserPreferenceModel userPreference) {
        return userPreferenceService.updateUserPreference(id, userPreference);
    }
}
