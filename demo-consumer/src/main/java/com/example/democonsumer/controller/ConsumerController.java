package com.example.democonsumer.controller;

import com.example.demoapi.api.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @DubboReference
    private UserService userService;

    @GetMapping("/user")
    public String getUser() {
        return userService.getUserName(1001L);
    }

}
