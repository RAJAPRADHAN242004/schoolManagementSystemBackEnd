package com.sms.repository;

import com.sms.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterDao extends JpaRepository<User,String> {
    //User update(User user);
}