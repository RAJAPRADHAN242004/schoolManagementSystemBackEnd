package com.sms.controller;


import com.sms.model.User;
import com.sms.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class SmsController {

    @Autowired
    RegisterService registerService;

    @GetMapping(value = "/allUsers")
    public List<User> getAllUser() {
        System.out.println("inside controller");
       return registerService.getUsers();
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return (User) registerService.saveUser();
    }
}

