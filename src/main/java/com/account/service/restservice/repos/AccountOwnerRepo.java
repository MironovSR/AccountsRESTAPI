package com.account.service.restservice.repos;

import com.account.service.restservice.entity.Account;
import com.account.service.restservice.entity.AccountOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AccountOwnerRepo extends JpaRepository<AccountOwner, Integer> {

}
