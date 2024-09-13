package com.fiap.locaweb.services;

import com.fiap.locaweb.models.UserPreferenceModel;
import com.fiap.locaweb.repositories.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
