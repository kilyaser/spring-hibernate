package com.aston.springhibernate.dto;

import java.util.List;

public class UserDto {
    String name;
    List<BankCardDto> bankCardDtos;

    public UserDto() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<BankCardDto> getBankCardDtos() {
        return bankCardDtos;
    }
    public void setBankCardDtos(List<BankCardDto> bankCardDtos) {
        this.bankCardDtos = bankCardDtos;
    }
}
