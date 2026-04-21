package com.namiq.libraryproject.service;

import com.namiq.libraryproject.dao.entity.User;
import com.namiq.libraryproject.dao.repository.UserRepository;
import com.namiq.libraryproject.exception.UserAlreadyExistsException;
import com.namiq.libraryproject.exception.UserNotFoundException;
import com.namiq.libraryproject.mapper.UserMapper;
import com.namiq.libraryproject.model.request.UserRequest;
import com.namiq.libraryproject.model.response.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;


    @Override
    public UserResponse createUser(UserRequest userRequest) {
      if(userRepository.existsByEmail(userRequest.getEmail())){
          throw new UserAlreadyExistsException("Email artiq movcuddur");
      }
        var userEntity = UserMapper.toEntity(userRequest);

        var savedUser = userRepository.save(userEntity);
        return UserMapper.toResponse(savedUser);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toResponse)
                .toList();
    }

    @Override
    public UserResponse getUserById(Long id) {
        var user= userRepository.findById(id)
                .orElseThrow(()->new UserNotFoundException("istifadeci tapilmadi"));
        return UserMapper.toResponse(user);
    }

    @Override
    public UserResponse updateUser(Long id, UserRequest userRequest) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("İstifadəçi tapılmadı"));

        if (!user.getEmail().equals(userRequest.getEmail())
                && userRepository.existsByEmail(userRequest.getEmail())) {
            throw new UserAlreadyExistsException("Bu email artıq mövcuddur");
        }
        UserMapper.updateEntity(userRequest,user);
        User updatedUser = userRepository.save(user);
        return UserMapper.toResponse(updatedUser);
    }

    @Override
    public void deleteById(Long id) {
        if(!userRepository.existsById(id)){
        throw new UserNotFoundException("İstifadəçi tapılmadı");}

        userRepository.deleteById(id);
    }


}
