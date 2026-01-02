package com.spring.securityjwt.service;

import com.spring.securityjwt.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UsersService {
    Users register(Users user);
    Users login(Users user);
    String verify(Users user);
    List<Users> getAllUsers();
}
