package com.kollect.kollectapp.resource;

import com.kollect.kollectapp.model.Users;
import com.kollect.kollectapp.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersResource {
    private final UsersService usersService;

    public UsersResource(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = usersService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable("id") Long id) {
        Users users = usersService.findUserById(id);
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Users> addUser(@RequestBody Users users) {
        Users newUser = usersService.addUser(users);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Users> updateUser(@RequestBody Users users) {
        Users updatedUser = usersService.updateUser(users);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        usersService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
