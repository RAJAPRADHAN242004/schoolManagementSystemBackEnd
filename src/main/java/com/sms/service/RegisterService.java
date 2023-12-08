package com.sms.service;


import com.sms.model.User;

import java.util.List;

public interface RegisterService {
    List<User> getUsers();

    User saveUser(User user);
}