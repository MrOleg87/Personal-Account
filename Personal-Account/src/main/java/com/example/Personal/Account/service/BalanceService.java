package com.example.Personal.Account.service;
import com.example.Personal.Account.entity.PersonalAccount;
import com.example.Personal.Account.repository.BalanceRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class BalanceService {

    private final BalanceRepository balanceRepository;

    public BalanceService(BalanceRepository balanceRepository) {
        this.balanceRepository = balanceRepository;
    }

    public Optional<PersonalAccount> getBalance(Long id) {
            return balanceRepository.findById(id);
}


    public Optional<PersonalAccount> putMoney(long id, BigDecimal amount,PersonalAccount personalAccount) {
        Optional<PersonalAccount> Money = balanceRepository.findById(id);
        personalAccount.setAmount(amount);
        balanceRepository.save(personalAccount);
        return Optional.of(personalAccount);
    }
}


   /* public BigDecimal takeMoney(Money money) {
        BigDecimal fromBalance = balanceRepository.getBalanceForId(money.getFrom());
        BigDecimal toBalance = balanceRepository.getBalanceForId(money.getTo());
        if (fromBalance == null || toBalance == null) throw new IllegalArgumentException("no id");
        if (money.getAmount().compareTo(fromBalance)>0) throw new IllegalArgumentException("no money");
        BigDecimal updateFromBalance = fromBalance.subtract(money.getAmount());
        BigDecimal updateToBalance = fromBalance.add(money.getAmount());
        return fromBalance;

    }*/


