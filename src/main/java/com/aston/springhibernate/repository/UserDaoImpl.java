package com.aston.springhibernate.repository;

import com.aston.springhibernate.converter.UserConverter;
import com.aston.springhibernate.dto.UserDto;
import com.aston.springhibernate.model.BankCard;
import com.aston.springhibernate.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;
    private UserConverter userConverter;

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory, UserConverter userConverter) {
        this.sessionFactory = sessionFactory;
        this.userConverter = userConverter;
    }
    @Override
    public List<UserDto> findAll(boolean fetchAll) {
        List<User> users;
        List<UserDto> userDtos;

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        users = session.createQuery("select u from User u", User.class).getResultList();
        userDtos = users.stream().map(u -> userConverter.entityToDto(u, fetchAll)).collect(Collectors.toList());
        session.getTransaction().commit();
        return userDtos;
    }
}
