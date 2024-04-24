package com.example.Personal.Account.model;



import java.math.BigDecimal;
public class Money {

    private long Id;
    private long to_Id;
    private BigDecimal amount;

    public Money() {
    }
    public Money(long id, BigDecimal amount) {
        Id = id;
        this.amount = amount;
    }

    public Money(long id, long to_Id, BigDecimal amount) {
        Id = id;
        this.to_Id = to_Id;
        this.amount = amount;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public long getTo_Id() {
        return to_Id;
    }

    public void setTo_Id(long to_Id) {
        this.to_Id = to_Id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    //public long getFrom() {
      //  return amount;
    //}

   // public long getTo() {
    //}
}
