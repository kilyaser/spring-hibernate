package com.aston.springhibernate.converter;

import com.aston.springhibernate.dto.BankCardDto;
import com.aston.springhibernate.model.BankCard;
import org.springframework.stereotype.Component;

@Component
public class BankCardConverter {
    public BankCardDto entityToDto(BankCard bankCard) {
        BankCardDto dto = new BankCardDto();
        dto.setNumber(bankCard.getCardNumber());
        return dto;
    }
}
