package com.example.demoprovider.service;

import com.example.demoapi.api.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0", group = "user-service")
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName(Long userId) {
        return "User-" + userId;
    }

}
