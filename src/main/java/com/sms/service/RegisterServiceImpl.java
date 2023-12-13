package com.sms.service;

import com.sms.repository.RegisterDao;
import com.sms.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterDao registerDao;
    private Object userid;
    private User user;


    @Override
    public List<User> getUsers() {
        return registerDao.findAll();
    }

    @Override
    public User saveUser(User user) {
        return registerDao.save(user);
    }

   // @Override
  //  public List<User> deleteUser() {
     //   return registerDao.deleteAll();
  //  }
    @Override
    public User updateUser(User user){
        Optional<User> retrivedUser=registerDao.findById(user.getUserid());
        retrivedUser.get().setLastName(user.getLastName());
        retrivedUser.get().setOccupation(user.getOccupation());

        return registerDao.save(retrivedUser.get());
    }
}
