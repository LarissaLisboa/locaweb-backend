package com.fiap.locaweb.services;

import com.fiap.locaweb.models.EmailModel;
import com.fiap.locaweb.models.UserPreferenceModel;
import com.fiap.locaweb.repositories.EmailRepository;
import com.fiap.locaweb.repositories.UserPreferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmailService {
    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private UserPreferenceRepository userPreferenceRepository;

    public List<EmailModel> getAllEmails() {
        return emailRepository.findAll();
    }

    public Optional<EmailModel> getEmailById(Long id) {
        return emailRepository.findById(id);
    }

    public EmailModel saveEmail(EmailModel email) {
        return emailRepository.save(email);
    }

    public UserPreferenceModel saveUserPreference(UserPreferenceModel userPreference) {
        return userPreferenceRepository.save(userPreference);
    }

    public Optional<UserPreferenceModel> getUserPreference(Long userId) {
        return userPreferenceRepository.findById(userId);
    }
}
