package com.authsystem.service;

import com.authsystem.dto.SignUpRequest;
import com.authsystem.dto.UserDto;
import com.authsystem.entity.User;
import com.authsystem.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import com.authsystem.exception.BadRequestException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    @Override
    public UserDto registerUser(SignUpRequest signUpRequest) {
        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            throw new BadRequestException("Email already registered");
        }
        User createUser = modelMapper.map(signUpRequest, User.class);
        createUser.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
        User savedUser = userRepository.save(createUser);
        return modelMapper.map(savedUser, UserDto.class);
    }
}
