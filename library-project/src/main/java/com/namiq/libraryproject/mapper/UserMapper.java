package com.namiq.libraryproject.mapper;

import com.namiq.libraryproject.dao.entity.User;
import com.namiq.libraryproject.model.request.UserRequest;
import com.namiq.libraryproject.model.response.UserResponse;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static User toEntity(UserRequest request) {
        if (request == null) {
            return null;
        }

        return User.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .build();
    }

    public static UserResponse toResponse(User user) {
        if (user == null) {
            return null;
        }

        return UserResponse.builder()
                .id(user.getId())
                .fullName(user.getFullName())
                .email(user.getEmail())
                .phoneNumber(user.getPhoneNumber())
                .isActive(user.getIsActive())
                .build();
    }
    public static void updateEntity(UserRequest request, User user) {
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setIsActive(request.getIsActive());
    }
}