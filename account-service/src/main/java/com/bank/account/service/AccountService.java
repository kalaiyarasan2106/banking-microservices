package com.bank.account.service;

import com.bank.account.entity.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    List<Account> getAllAccounts();

    Account getAccountById(Long id);

    void deleteAccount(Long id);

}
