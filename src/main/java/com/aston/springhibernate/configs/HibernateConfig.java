package com.aston.springhibernate.configs;

import com.aston.springhibernate.model.BankCard;
import com.aston.springhibernate.model.User;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {
    @Bean
    public SessionFactory sessionFactory() {
        return new org.hibernate.cfg.Configuration()
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(BankCard.class)
                .buildSessionFactory();
    }
}
