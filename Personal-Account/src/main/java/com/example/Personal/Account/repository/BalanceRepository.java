package com.example.Personal.Account.repository;
import com.example.Personal.Account.entity.PersonalAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BalanceRepository extends JpaRepository<PersonalAccount, Long>{


}
