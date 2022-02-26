package com.kollect.kollectapp.service;

import com.kollect.kollectapp.exception.DataNotFoundException;
import com.kollect.kollectapp.model.Likes;
import com.kollect.kollectapp.model.Photocard;
import com.kollect.kollectapp.repo.LikesRepo;
import org.springframework.stereotype.Service;

@Service
public class LikesService {
    private final LikesRepo likesRepo;

    public LikesService(LikesRepo likesRepo) {
        this.likesRepo = likesRepo;
    }

    public Likes addLike(Likes likes) {
        return likesRepo.save(likes);
    }

    public void deleteLike(Long id) {
        likesRepo.deleteLikesById(id);
    }

    public Photocard findByPhotocardId(Long id) {
        return likesRepo.findLikesByPhotocardId(id)
                .orElseThrow(() -> new DataNotFoundException("Photocard likes by id " + id + " not found"));
    }

}
