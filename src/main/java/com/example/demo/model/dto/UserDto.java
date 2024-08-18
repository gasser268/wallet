package com.example.demo.model.dto;

import lombok.Data;

import java.util.Optional;

@Data
public class UserDto {

    private String name;
    private String phoneNumber;
    private String password;
    private String email;

}
