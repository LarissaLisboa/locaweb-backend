package com.fiap.locaweb.repositories;


import com.fiap.locaweb.models.EmailModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Component
public interface EmailRepository {
    List<EmailModel> findAll();

    EmailModel findById(Long id);

    EmailModel save(EmailModel email);
}
