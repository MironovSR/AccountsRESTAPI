package com.account.service.restservice.service;

import com.account.service.restservice.entity.Account;
import com.account.service.restservice.repos.AccountOwnerRepo;
import com.account.service.restservice.repos.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountService {
    @Autowired
    AccountRepo accountRepo;
    @Autowired
    AccountOwnerService accountOwnerService;

    public Account getAccountById(int id){
        Account account = null;
        Optional<Account> temp = accountRepo.findById(id);
        if(temp.isPresent())
            account = temp.get();
        return account;
    }

    public List<Account> getAllAccounts(){
        return accountRepo.findAll();
    }

    public List<Account> getAllOwnersAccounts(int id){

       return accountRepo.findByAccountOwner(accountOwnerService.getAccountOwnerById(id));
    }

}
