package com.aston.springhibernate.repository;

import com.aston.springhibernate.dto.UserDto;
import java.util.List;

public interface UserDao {
    List<UserDto> findAll(boolean fetchAll);
}
