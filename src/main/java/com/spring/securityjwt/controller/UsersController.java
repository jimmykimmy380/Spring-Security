package com.spring.securityjwt.controller;

import com.spring.securityjwt.model.Users;
import com.spring.securityjwt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    UsersService usersService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return usersService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return usersService.verify(user);
    }

    @GetMapping("/getUsers")
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }
}
