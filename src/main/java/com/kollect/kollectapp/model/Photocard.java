package com.kollect.kollectapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Photocard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String rating;
    @Column(nullable = false)
    private Long owner;
    private String imageUrl;
    @Column(updatable = false)
    private String createdAt;
    @Column(nullable = false, updatable = false)
    private String photocardCode;

    public Photocard() {}

    public Photocard(String name, String rating, Long owner, String imageUrl, String createdAt, String photocardCode) {
        this.name = name;
        this.rating = rating;
        this.owner = owner;
        this.imageUrl = imageUrl;
        this.createdAt = createdAt;
        this.photocardCode = photocardCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getPhotocardCode() {
        return photocardCode = photocardCode;
    }

    public void setPhotocardCode(String photocardCode) {
        this.photocardCode = photocardCode;
    }

    @Override
    public String toString() {
        return "Photocard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", owner=" + owner  +
                ", imageUrl='" + imageUrl + '\'' +
                "}";
    }


}
