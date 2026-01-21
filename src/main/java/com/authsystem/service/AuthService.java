package com.authsystem.service;

import com.authsystem.dto.SignUpRequest;
import com.authsystem.dto.UserDto;

public interface AuthService {
    UserDto registerUser(SignUpRequest signUpRequest);
}
