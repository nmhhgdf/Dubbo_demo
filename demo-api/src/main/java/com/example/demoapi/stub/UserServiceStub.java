package com.example.demoapi.stub;

import com.example.demoapi.api.UserService;

import java.util.Objects;

public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getUserName(Long userId) {
        if (Objects.isNull(userId) || userId <= 0) {
            throw new IllegalArgumentException("Invalid userId");
        }

        try {
            return userService.getUserName(userId);
        } catch (Exception e) {
            return "Default";
        }
    }
}
