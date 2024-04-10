package com.example.Personal.Account.repository;
import com.example.Personal.Account.entity.PersonalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface BalanceRepository extends JpaRepository<PersonalAccount, Long>{


    @Override
    Optional<PersonalAccount> findById(Long id);
}

