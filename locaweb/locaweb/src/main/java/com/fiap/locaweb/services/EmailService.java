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

    public EmailModel updateEmail(Long id, EmailModel updatedEmail) {
        return emailRepository.findById(id)
                .map(email -> {
                    if (updatedEmail.isRead() != email.isRead()) {
                        email.setRead(updatedEmail.isRead());
                    }
                    if (updatedEmail.isStarred() != email.isStarred()) {
                        email.setStarred(updatedEmail.isStarred());
                    }
                    if (updatedEmail.isTrashed() != email.isTrashed()) {
                        email.setTrashed(updatedEmail.isTrashed());
                    }

                    if (updatedEmail.isHasEvent() != email.isHasEvent()) {
                        email.setHasEvent(updatedEmail.isHasEvent());
                    }
                    if (updatedEmail.getEventTitle() != null) {
                        email.setEventTitle(updatedEmail.getEventTitle());
                    }
                    if (updatedEmail.getEventDate() != null) {
                        email.setEventDate(updatedEmail.getEventDate());
                    }
                    if (updatedEmail.getEventStartHour() != null) {
                        email.setEventStartHour(updatedEmail.getEventStartHour());
                    }
                    if (updatedEmail.getEventEndHour() != null) {
                        email.setEventEndHour(updatedEmail.getEventEndHour());
                    }
                    if (updatedEmail.getDescription() != null) {
                        email.setDescription(updatedEmail.getDescription());
                    }
                    return emailRepository.save(email);
                })
                .orElseThrow(() -> new RuntimeException("Email not found"));
    }
}
