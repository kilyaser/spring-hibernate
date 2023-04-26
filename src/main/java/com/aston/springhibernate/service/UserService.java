package com.aston.springhibernate.service;

import com.aston.springhibernate.dto.UserDto;
import com.aston.springhibernate.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserDao userDao;
    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    public List<UserDto> getAllUsers(boolean fetchAll) {
       return userDao.findAll(fetchAll);
    }
}
