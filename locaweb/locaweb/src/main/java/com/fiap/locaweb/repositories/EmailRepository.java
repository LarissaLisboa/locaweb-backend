package com.fiap.locaweb.repositories;


import com.fiap.locaweb.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
@Component
public interface EmailRepository extends JpaRepository<EmailModel, Long> {
    List<EmailModel> findAll();

    Optional<EmailModel> findById(Long id);

    EmailModel save(EmailModel email);
}
