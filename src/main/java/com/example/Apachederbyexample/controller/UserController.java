package com.example.Apachederbyexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Apachederbyexample.model.UserRecord;
import com.example.Apachederbyexample.service.UserService;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public List<UserRecord> getAllUser(){
        return userService.getAllUsers();
    }

    @RequestMapping(value ="/add-user", method = RequestMethod.POST)
    public void addUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }
}
