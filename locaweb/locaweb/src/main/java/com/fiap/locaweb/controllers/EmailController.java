package com.fiap.locaweb.controllers;

import com.fiap.locaweb.models.EmailModel;
import com.fiap.locaweb.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emails")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @GetMapping
    public List<EmailModel> getAllEmails() {
        return emailService.getAllEmails();
    }

    @GetMapping("/{id}")
    public Optional<EmailModel> getEmailById(@PathVariable Long id) {

        return emailService.getEmailById(id);
    }

    @PostMapping("/criar-email")
    public EmailModel sendEmail(@RequestBody EmailModel email) {

        return emailService.saveEmail(email);
    }

    @PatchMapping("/atualizar-email/{id}")
    public EmailModel updateEmail(@PathVariable Long id, @RequestBody EmailModel updatedEmail) {
        return emailService.updateEmail(id, updatedEmail);
    }

}
