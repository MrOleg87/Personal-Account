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
    public Optional<PersonalAccount> getBalance(Long id, String status) {
            PersonalAccount idBalance = balanceRepository.findById(id).get();
            idBalance.setStatus("OK");
            return balanceRepository.findById(id);
    }



    public Optional<PersonalAccount> putMoney(long id, BigDecimal amount,String status) {
        PersonalAccount pMoney = balanceRepository.findById(id).get();
        pMoney.setBalance(pMoney.getBalance().add(amount));
        pMoney.setStatus("1");
        return Optional.of(balanceRepository.save(pMoney));


    }


    public Optional<PersonalAccount> takeMoney(long id, BigDecimal amount,String status) {
        PersonalAccount pMoney = balanceRepository.findById(id).get();
        if (pMoney.getBalance().compareTo(amount) >= 0){
            pMoney.setBalance(pMoney.getBalance().subtract(amount));
            pMoney.setStatus("1");
            return Optional.of(balanceRepository.save(pMoney));
        }else {
            pMoney.setStatus("0,NO MONEY");
            return balanceRepository.findById(id);
        }

    }

    public Optional<PersonalAccount> transferMoney(long id, Long toID, BigDecimal amount, String status) {
    PersonalAccount fromId = balanceRepository.findById(id).get();
    PersonalAccount toId = balanceRepository.findById(toID).get();
    if (fromId.getBalance().compareTo(amount) >= 0){
        fromId.setBalance(fromId.getBalance().subtract(amount));
        toId.setBalance(toId.getBalance().add(amount));
        balanceRepository.save(toId);
        fromId.setStatus("1");
        return Optional.of(balanceRepository.save(fromId));
    }else {
        fromId.setStatus("0,NO MONEY");
        return balanceRepository.findById(id);
    }
    }
}


