package com.aston.springhibernate.controller;

import com.aston.springhibernate.dto.UserDto;
import com.aston.springhibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping(value = {"/users","/users/{fetchAll}"})
    public List<UserDto> getAllUsers(@PathVariable(required = false) Boolean fetchAll) {
        if (fetchAll == null) {
            fetchAll = false;
        }
        return userService.getAllUsers(fetchAll);
    }
}
