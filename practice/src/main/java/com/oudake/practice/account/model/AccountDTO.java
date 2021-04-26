package com.oudake.practice.account.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "account")
public class AccountDTO {

    @Id
    private String accountId;

    private String accountLevel;

    private BigDecimal currMoney;

    private Date lastTime;

    public AccountDTO() {
    }

    public AccountDTO(String accountId, BigDecimal currMoney, Date lastTime) {
        this.accountId = accountId;
        this.currMoney = currMoney;
        this.lastTime = lastTime;
    }

    public AccountDTO(String accountId, String accountLevel, BigDecimal currMoney, Date lastTime) {
        this.accountId = accountId;
        this.accountLevel = accountLevel;
        this.currMoney = currMoney;
        this.lastTime = lastTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(String accountLevel) {
        this.accountLevel = accountLevel;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BigDecimal getCurrMoney() {
        return currMoney;
    }

    public void setCurrMoney(BigDecimal currMoney) {
        this.currMoney = currMoney;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}
