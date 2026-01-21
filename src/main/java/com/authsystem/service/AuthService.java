package com.authsystem.service;

import com.authsystem.dto.UserDto;

public interface AuthService {
    UserDto registerUser(UserDto userDto);
}
