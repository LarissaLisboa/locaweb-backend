package com.fiap.locaweb.controllers;

import com.fiap.locaweb.models.EmailModel;
import com.fiap.locaweb.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public EmailModel getEmailById(@PathVariable Long id) {
        return emailService.getEmailById(id);
    }

    @PostMapping
    public EmailModel sendEmail(@RequestBody EmailModel email) {
        return emailService.saveEmail(email);
    }
}
