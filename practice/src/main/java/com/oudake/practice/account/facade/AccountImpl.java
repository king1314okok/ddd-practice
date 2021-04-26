package com.oudake.practice.account.facade;

import com.alibaba.dubbo.config.annotation.Service;
import com.oudake.practice.account.service.AccountApplicationService;
import com.oudake.practice.api.account.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service(version = "1.0", timeout = 8000)
public class AccountImpl implements Account {

    @Autowired
    private AccountApplicationService accountApplicationService;

    public Map<String, Object> transferMoney(Map<String, Object> param) {
        String accountId = (String) param.get("accountId");
        BigDecimal amount = new BigDecimal((String) param.get("amount"));
        accountApplicationService.transferMoney(accountId, amount);
        Map<String, Object> response = new HashMap<>();
        response.put("msg", "转账成功");
        return response;
    }
}
