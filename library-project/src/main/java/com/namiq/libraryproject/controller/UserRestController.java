package com.namiq.libraryproject.controller;

import com.namiq.libraryproject.model.request.UserRequest;
import com.namiq.libraryproject.model.response.UserResponse;
import com.namiq.libraryproject.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> createUser(@RequestBody @Valid UserRequest userRequest) {
        var response = userService.createUser(userRequest);
        return ResponseEntity
                .status(201)
                .body(response);
    }
    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers(){
        var response=userService.getAllUsers();
        return ResponseEntity.ok(response);
    }
    @GetMapping(path="/userId/{id}")
    public ResponseEntity<UserResponse> getUserById(@PathVariable Long id){
        var response =userService.getUserById(id);
        return ResponseEntity.ok(response);
    }
    @PutMapping(path ="/userId/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable Long id,
                            @RequestBody  @Valid UserRequest userRequest){
        var response=userService.updateUser(id,userRequest);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping(path = "/userId/{id}")
    public ResponseEntity<Void>deleteUserById(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}