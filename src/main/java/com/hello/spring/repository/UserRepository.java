package com.hello.spring.repository;

import com.hello.spring.model.Hero;
import com.hello.spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String name);
}
