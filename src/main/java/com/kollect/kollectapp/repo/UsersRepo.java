package com.kollect.kollectapp.repo;

import com.kollect.kollectapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepo extends JpaRepository<Users, Long> {
    void deleteUserById(Long id);

    Optional<Users> findUserById(Long id);
}
