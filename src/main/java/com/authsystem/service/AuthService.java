package com.authsystem.service;

import com.authsystem.dto.LoginRequest;
import com.authsystem.dto.LoginResponse;
import com.authsystem.dto.SignUpRequest;
import com.authsystem.dto.UserDto;

public interface AuthService {
    UserDto registerUser(SignUpRequest signUpRequest);
    LoginResponse login(LoginRequest loginRequest);
}
