package com.fiap.locaweb.services;

import com.fiap.locaweb.models.UserPreferenceModel;
import com.fiap.locaweb.repositories.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserPreferenceService {
    @Autowired
    private UserPreferenceRepository userPreferenceRepository;

    public Optional<UserPreferenceModel> getUserPreference(Long id) {
        return userPreferenceRepository.findById(id);
    }

    public UserPreferenceModel saveUserPreference(UserPreferenceModel userPreference) {
        return userPreferenceRepository.save(userPreference);
    }

    public UserPreferenceModel updateUserPreference(@RequestBody Long id, UserPreferenceModel userPreference) {
        UserPreferenceModel existingPreference = userPreferenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        if (userPreference.getTheme() != null) {
            existingPreference.setTheme(userPreference.getTheme());
        }

        return userPreferenceRepository.save(existingPreference);
    }
}
