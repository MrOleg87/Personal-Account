package com.example.Personal.Account.controller;
import com.example.Personal.Account.entity.PersonalAccount;
import com.example.Personal.Account.service.BalanceService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;


@RestController("/Personal Account")


public class BalanceController {
    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }


    @GetMapping("/Personal Account/{id}")
    public Optional<PersonalAccount>  getBalance(@PathVariable long id) {

        return balanceService.getBalance(id);

    }

    @PostMapping("/Personal Account/{putMoney}")
    public Optional<PersonalAccount> putMoney(@RequestBody Long id, BigDecimal amount,PersonalAccount personalAccount) {
        return balanceService.putMoney(id,amount,personalAccount);
    }
}

