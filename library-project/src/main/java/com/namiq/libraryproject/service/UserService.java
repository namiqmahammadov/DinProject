package com.namiq.libraryproject.service;

import com.namiq.libraryproject.model.request.UserRequest;
import com.namiq.libraryproject.model.response.UserResponse;
import jakarta.validation.Valid;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserRequest userRequest);

    List<UserResponse> getAllUsers();

    UserResponse getUserById(Long id);

    UserResponse updateUser(Long id, UserRequest userRequest);

    void deleteById(Long id);
}
