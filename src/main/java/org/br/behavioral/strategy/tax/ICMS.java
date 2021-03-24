package org.br.behavioral.strategy.tax;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class ICMS implements Tax {

    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
