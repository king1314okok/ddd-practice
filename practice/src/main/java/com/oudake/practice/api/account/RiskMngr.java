package com.oudake.practice.api.account;

import java.math.BigDecimal;

public interface RiskMngr {

    void notify(String riskLevel, BigDecimal amount);
}
