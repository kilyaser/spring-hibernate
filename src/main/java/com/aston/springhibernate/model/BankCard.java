package com.aston.springhibernate.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bank_cards")
public class BankCard {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "card_number")
    private String cardNumber;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public BankCard() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankCard bankCard = (BankCard) o;
        return Objects.equals(id, bankCard.id) && Objects.equals(cardNumber, bankCard.cardNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, cardNumber);
    }
    @Override
    public String toString() {
        return "BankCard{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", user=" + user.getName() +
                '}';
    }
}
