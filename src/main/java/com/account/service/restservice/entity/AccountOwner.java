package com.account.service.restservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ACCOUNT_OWNER")
public class AccountOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;

    @Column(name = "first_name")
    private String first_name ;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email ;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountOwner")
    private List<Account> accountList;

    public AccountOwner() {
    }

    public AccountOwner(String first_name, String last_name, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public void addAccountToOwner(Account account){
        if( accountList == null){
            accountList = new ArrayList<>();
        }
        accountList.add(account);
        account.setAccountOwner(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }
}
