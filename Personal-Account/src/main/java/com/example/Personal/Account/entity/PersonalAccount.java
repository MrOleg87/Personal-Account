package com.example.Personal.Account.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Personal Account")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonalAccount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "balance")
    private BigDecimal amount;

    public PersonalAccount(Long id, BigDecimal amount) {
        this.id = id;
        this.amount = amount;
    }

    public PersonalAccount() {
    }

    public Long getId(long id) {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getAmount(BigDecimal amount) {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }


}
