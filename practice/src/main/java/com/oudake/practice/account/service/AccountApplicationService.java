package com.oudake.practice.account.service;

import com.oudake.practice.account.model.Account;
import com.oudake.practice.account.repository.AccountRepository;
import com.oudake.practice.api.account.RiskMngr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountApplicationService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private RiskMngr riskMngr;

    public void transferMoney(String accountId, BigDecimal amount) {
        Account account = accountRepository.byAccountId(accountId);
        riskMngr.notify(account.getLevel(), amount);
        account.transferMoney(amount);
        accountRepository.save(account);
    }
}
