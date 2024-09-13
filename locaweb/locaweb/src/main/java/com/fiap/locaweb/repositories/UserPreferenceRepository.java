package com.fiap.locaweb.repositories;

import com.fiap.locaweb.models.UserPreferenceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserPreferenceRepository extends JpaRepository<UserPreferenceModel, Long> {
    Optional<UserPreferenceModel> findById(Long id);

    UserPreferenceModel save(UserPreferenceModel userPreference);
}
