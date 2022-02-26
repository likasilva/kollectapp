package com.kollect.kollectapp.service;

import com.kollect.kollectapp.exception.DataNotFoundException;
import com.kollect.kollectapp.model.Users;
import com.kollect.kollectapp.repo.UsersRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class UsersService {
    private final UsersRepo usersRepo;

    public UsersService(UsersRepo usersRepo){
        this.usersRepo = usersRepo;
    }

    public Users addUser(Users users) {
        users.setUserCode(UUID.randomUUID().toString());
        return usersRepo.save(users);
    }

    public List<Users> findAllUsers() {
        return usersRepo.findAll();
    }

    public Users updateUser(Users users) {
        return usersRepo.save(users);
    }

    public Users findUserById(Long id) {
        return usersRepo.findUserById(id).orElseThrow(() -> new DataNotFoundException("User by id " + id + " was not found"));
    }

    @Transactional
    public void deleteUser(Long id) {
        usersRepo.deleteUserById(id);
    }
}
