package com.account.service.restservice.repos;

import com.account.service.restservice.entity.Account;
import com.account.service.restservice.entity.AccountOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account, Integer> {
  //  @Query("SELECT g FROM Account g where g.accountOwner = :id")
 //   List<Account > getTest(@Param("id")int id);
//  List<Account > getTest(@Param("id")int id);
   List<Account> findByAccountOwner(AccountOwner accountOwner);

}
