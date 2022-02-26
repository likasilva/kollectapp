package com.kollect.kollectapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Likes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private Long photocardId;
    @Column(nullable = false, updatable = false)
    private Long userId;
    @Column(nullable = false, updatable = false)
    private String createdAt;

    public Likes() {}

    public Likes(Long photocardId, Long userId, String createdAt) {
        this.photocardId = photocardId;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPhotocardId() {
        return photocardId;
    }

    public void setPhotocardId(Long photocardId) {
        this.photocardId = photocardId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Likes{" +
                "photocardId=" + photocardId +
                ", userId=" + userId +
                ", createdAt='" + createdAt + '\'' +
                "}";
    }

}
