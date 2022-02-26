package com.kollect.kollectapp.repo;

import com.kollect.kollectapp.model.Photocard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PhotocardRepo extends JpaRepository<Photocard, Long> {
    void deletePhotocardById(Long id);

    Optional<Photocard> findPhotocardById(Long id);
}
