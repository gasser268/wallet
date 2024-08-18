package com.example.demo.service.inter;

import com.example.demo.model.User;
import com.example.demo.model.dto.UserDto;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User createUser(UserDto userDto);
    User updateUser(UserDto userDto);
    User getUserById (UUID id) throws Exception;
    String deleteUser(String phoneNumber);

}
