package com.example.democonsumer.controller;

import com.example.demoapi.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @DubboReference(version = "1.0.2", group = "user-service", stub = "com.example.demoapi.stub.UserServiceStub")
    private UserService userService;

    @GetMapping("/user/{userId}")
    public String getUser(@PathVariable("userId") Long userId) {
        return userService.getUserName(userId);
    }

}
