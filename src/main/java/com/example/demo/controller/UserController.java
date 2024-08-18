package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.service.inter.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @GetMapping("{id}")
    public User findUserById(@PathVariable UUID id) throws Exception {
        try {
            return userService.getUserById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @DeleteMapping("{phoneNumber}")
    public ResponseEntity<String> deleteUser(@PathVariable String phoneNumber) {
        String mes  = userService.deleteUser(phoneNumber);
        return ResponseEntity.ok(mes);

    }
}
