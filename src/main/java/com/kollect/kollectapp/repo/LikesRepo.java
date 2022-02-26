package com.kollect.kollectapp.repo;

import com.kollect.kollectapp.model.Likes;
import com.kollect.kollectapp.model.Photocard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikesRepo extends JpaRepository<Likes, Long> {
    void deleteLikesById(Long id);

    Optional<Photocard> findLikesByPhotocardId(Long id);
}
