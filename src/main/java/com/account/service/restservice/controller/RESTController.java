package com.account.service.restservice.controller;

import com.account.service.restservice.entity.Account;
import com.account.service.restservice.entity.AccountOwner;
import com.account.service.restservice.service.AccountOwnerService;
import com.account.service.restservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RESTController {
@Autowired
private AccountService accountService;
@Autowired
private AccountOwnerService accountOwnerService;

    @GetMapping("/accounts")
    public List<Account> showAllAccounts(){
       List<Account> acc = accountService.getAllAccounts();
       return acc;
    }

    @GetMapping("/account/{id}")
    public Account showAccountById(@PathVariable int id){
        return accountService.getAccountById(id);
    }

    @GetMapping("/accountsOwners")
    public List<AccountOwner> showAllAccountOwners(){
        List<AccountOwner> acc = accountOwnerService.getAllOwners();
        return acc;
    }

    @GetMapping("/owner/{id}")
    public AccountOwner showAccountOwnerById(@PathVariable int id){
        return accountOwnerService.getAccountOwnerById(id);
    }

    @GetMapping("/owner/accounts/{id}")
    public List<Account> showAllAccountsOfOwnerById(@PathVariable int id){
        return accountService.getAllOwnersAccounts(id);
    }

}
