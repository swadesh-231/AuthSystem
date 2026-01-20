package com.authsystem.service;

import com.authsystem.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByEmail(String email);
    UserDto updateUser(UserDto userDto, Long userId);
    void deleteUser(Long userId);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
}
