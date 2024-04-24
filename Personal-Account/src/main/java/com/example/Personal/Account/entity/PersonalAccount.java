package com.example.Personal.Account.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "personal_account")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class PersonalAccount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "balance")
    private BigDecimal balance;

    private String status;

    public PersonalAccount(long id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    public PersonalAccount() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public PersonalAccount(long id, BigDecimal balance, String status) {
        this.id = id;
        this.balance = balance;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
