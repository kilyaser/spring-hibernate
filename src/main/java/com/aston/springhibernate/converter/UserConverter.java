package com.aston.springhibernate.converter;

import com.aston.springhibernate.dto.UserDto;
import com.aston.springhibernate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class UserConverter {
    private BankCardConverter bankCardConverter;
    @Autowired
    public UserConverter(BankCardConverter bankCardConverter) {
        this.bankCardConverter = bankCardConverter;
    }
    public UserDto entityToDto(User user, boolean fetchCards) {
        UserDto dto = new UserDto();
        dto.setName(user.getName());
        if (fetchCards) {
            dto.setBankCardDtos(user.getBankCards().stream().map(c -> bankCardConverter.entityToDto(c)).collect(Collectors.toList()));
        }
        return dto;
    }
}
