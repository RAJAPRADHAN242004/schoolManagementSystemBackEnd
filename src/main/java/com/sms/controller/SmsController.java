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

    @PostMapping(value = "/saveUser")
    public String createUser(@RequestBody User user) {
    registerService.saveUser(user);
     return "User saved successfully!!";
    }
    @PutMapping(value="/updateUser")
    public String updateUser(@RequestBody User user){
        registerService.updateUser(user);
         return "User updated successfully";
    }
}

