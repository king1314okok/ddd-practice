package com.oudake.practice.account.model;

import java.math.BigDecimal;
import java.util.Date;

public class Account {

    private String accountId;

    private String level;

    private BigDecimal currMoney;

    private Date lastTransferTime;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public BigDecimal getCurrMoney() {
        return currMoney;
    }

    public void setCurrMoney(BigDecimal currMoney) {
        this.currMoney = currMoney;
    }

    public Date getLastTransferTime() {
        return lastTransferTime;
    }

    public void setLastTransferTime(Date lastTransferTime) {
        this.lastTransferTime = lastTransferTime;
    }

    public void transferMoney(BigDecimal amount) {
        this.currMoney = this.currMoney.subtract(amount);
        this.lastTransferTime = new Date();
    }

}
