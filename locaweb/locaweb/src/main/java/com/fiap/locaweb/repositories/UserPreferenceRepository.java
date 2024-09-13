package com.fiap.locaweb.repositories;

import com.fiap.locaweb.models.UserPreferenceModel;
import org.springframework.stereotype.Repository;


@Repository
public interface UserPreferenceRepository {
    UserPreferenceModel findById(Long id);

    UserPreferenceModel save(UserPreferenceModel userPreference);
}
