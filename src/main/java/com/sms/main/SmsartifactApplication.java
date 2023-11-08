package com.sms.main;

import com.sms.repository.RegisterDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = RegisterDao.class)
@ComponentScan("com.sms.*")
@EntityScan("com.sms.model")
public class SmsartifactApplication {

    public static void main(String[] args) {

        SpringApplication.run(SmsartifactApplication.class, args);
    }

}
