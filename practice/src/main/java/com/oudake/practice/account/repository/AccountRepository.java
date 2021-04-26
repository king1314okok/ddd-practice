package com.oudake.practice.account.repository;

import com.oudake.practice.account.model.Account;
import com.oudake.practice.account.model.AccountDTO;
import com.oudake.practice.account.repository.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountRepository {

    @Autowired
    private AccountMapper accountMapper;

    public Account byAccountId(String accountId) {
        AccountDTO accountDTO = accountMapper.selectByPrimaryKey(accountId);
        Account account = new Account();
        account.setAccountId(accountDTO.getAccountId());
        account.setCurrMoney(accountDTO.getCurrMoney());
        return account;
    }

    public void save(Account account) {
        AccountDTO accountDTO = new AccountDTO(account.getAccountId(), account.getCurrMoney(), account.getLastTransferTime());
        accountMapper.updateByPrimaryKey(accountDTO);
    }
}
