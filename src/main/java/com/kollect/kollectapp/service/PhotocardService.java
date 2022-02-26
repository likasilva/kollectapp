package com.kollect.kollectapp.service;

import com.kollect.kollectapp.exception.DataNotFoundException;
import com.kollect.kollectapp.model.Photocard;
import com.kollect.kollectapp.repo.PhotocardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class PhotocardService {
    private final PhotocardRepo photocardRepo;

    public PhotocardService(PhotocardRepo photocardRepo) {
        this.photocardRepo = photocardRepo;
    }

    public Photocard addPhotocard(Photocard photocard) {
        photocard.setPhotocardCode(UUID.randomUUID().toString());
        return photocardRepo.save(photocard);
    }

    public List<Photocard> findAllPhotocard() {
        return photocardRepo.findAll();
    }

    public Photocard updatePhotocard(Photocard photocard) {
        return photocardRepo.save(photocard);
    }

    public Photocard findPhotocardById(Long id) {
        return photocardRepo.findPhotocardById(id)
                .orElseThrow(() -> new DataNotFoundException("Photocard by id " + id + "not found"));
    }

    @Transactional
    public void deletePhotocard(Long id) {
        photocardRepo.deletePhotocardById(id);
    }
}
