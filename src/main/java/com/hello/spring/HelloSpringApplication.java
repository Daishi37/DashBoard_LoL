package com.hello.spring;

import com.hello.spring.repository.UserRepository;
import com.hello.spring.service.Populatedb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {

    @Autowired
    Populatedb p;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloSpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        p.populate();
//        p.populate();
    }
}
