package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.inter.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Override
    public User createUser(UserDto userDto) {

        User user = User.builder()
                .name(userDto.getName())
                .phoneNumber(userDto.getPhoneNumber())
                .password(userDto.getPassword())
                .email(userDto.getEmail())
                .build();

       return userRepo.save(user);
    }

    @Override
    public User updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public User getUserById(UUID id) throws Exception {
        return userRepo.findById(id).orElseThrow(Exception::new);
    }

    @Override
    public String deleteUser(String phoneNumber) {
        User user = userRepo.findByPhoneNumber(phoneNumber);
        userRepo.delete(user);
        return "Success";
    }

}
