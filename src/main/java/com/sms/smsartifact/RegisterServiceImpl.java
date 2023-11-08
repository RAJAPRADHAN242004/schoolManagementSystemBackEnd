package com.sms.smsartifact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterDao registerDao;


    @Override
    public List<User> getUsers() {
        return registerDao.findAll();
    }
}
