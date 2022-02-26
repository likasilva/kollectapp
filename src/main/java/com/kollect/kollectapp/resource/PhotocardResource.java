package com.kollect.kollectapp.resource;

import com.kollect.kollectapp.model.Photocard;
import com.kollect.kollectapp.service.PhotocardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/photocard")
public class PhotocardResource {
    private final PhotocardService photocardService;

    @Autowired
    public PhotocardResource(PhotocardService photocardService) {
        this.photocardService = photocardService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Photocard>> getAllPhotocard() {
        List<Photocard> photocardList = photocardService.findAllPhotocard();
        return new ResponseEntity<>(photocardList, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Photocard> getPhotocardById(@PathVariable("id") Long id) {
        Photocard photocard = photocardService.findPhotocardById(id);
        return new ResponseEntity<>(photocard, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Photocard> addPhotocard(@RequestBody Photocard photocard) {
        Photocard newPhotocard = photocardService.addPhotocard(photocard);
        return new ResponseEntity<>(newPhotocard, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Photocard> updatePhotocard(@RequestBody Photocard photocard) {
        Photocard updatedPhotocard = photocardService.updatePhotocard(photocard);
        return new ResponseEntity<>(updatedPhotocard, HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<?> deletePhotocard(@PathVariable("id") Long id) {
        photocardService.deletePhotocard(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
