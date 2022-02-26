package com.kollect.kollectapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String imageUrl;
    private String password;
    private String headerUrl;
    @Column(updatable = false)
    private String createdAt;
    @Column(nullable = false, updatable = false)
    private String userCode;

    public Users() {}

    public Users(String name, String email, String imageUrl, String password, String headerUrl, String createdAt, String userCode) {
        this.name = name;
        this.email = email;
        this.imageUrl = imageUrl;
        this.password = password;
        this.headerUrl = headerUrl;
        this.createdAt = createdAt;
        this.userCode = userCode;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }


    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", headerUrl='" + headerUrl + '\'' +
                ", password='" + password + '\'' +
                ", createdAt='" + createdAt + '\'' +
                "}";
    }
}
