package com.example.Personal.Account.controller;
import com.example.Personal.Account.entity.PersonalAccount;
import com.example.Personal.Account.service.BalanceService;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.Optional;


@RestController()
@RequestMapping("/personal_account")

public class BalanceController {
    private final BalanceService balanceService;

    public BalanceController(BalanceService balanceService) {
        this.balanceService = balanceService;
    }


    @GetMapping(path = "/{id}")
    public Optional<PersonalAccount> getBalance(@PathVariable long id,String status) {
        return balanceService.getBalance(id,status);
    }

    @PostMapping("/putMoney/{id}")
    public Optional<PersonalAccount> putMoney(@PathVariable long id, @RequestParam("amount") BigDecimal amount,String status) {
        return balanceService.putMoney(id, amount,status);
    }

    @PostMapping("/takeMoney/{id}")
    public Optional<PersonalAccount> takeMoney(@PathVariable long id,@RequestParam("amount") BigDecimal amount,String status){
        return balanceService.takeMoney(id,amount,status);

}
    @PostMapping("transferMoney/{id}")
    public Optional<PersonalAccount> transferMoney(@PathVariable long id,@RequestParam("toID") Long toID,BigDecimal amount,String status ){
        return balanceService.transferMoney(id,toID,amount,status);
    }
    }




