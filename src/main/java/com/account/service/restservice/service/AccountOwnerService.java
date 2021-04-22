package com.account.service.restservice.service;

import com.account.service.restservice.entity.Account;
import com.account.service.restservice.entity.AccountOwner;
import com.account.service.restservice.repos.AccountOwnerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AccountOwnerService {
    @Autowired
    AccountOwnerRepo accountOwnerRepo;

    public AccountOwner getAccountOwnerById(int id){
        AccountOwner owner = null;
        Optional<AccountOwner> temp = accountOwnerRepo.findById(id);
        if(temp.isPresent())
            owner = temp.get();
        return owner;
    }

    public List<AccountOwner> getAllOwners(){
        return accountOwnerRepo.findAll();
    }


}
