package com.spring.securityjwt.service;

import com.spring.securityjwt.model.Users;
import org.springframework.stereotype.Service;

public interface UsersService {
    Users register(Users user);
}
