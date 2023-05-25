package com.example.SpringBootrestfulwebservices.repository;

import com.example.SpringBootrestfulwebservices.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
