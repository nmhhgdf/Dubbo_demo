package com.example.demoprovider.service;

import com.example.demoapi.api.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(Long userId) {
        return "User-" + userId;
    }

}
