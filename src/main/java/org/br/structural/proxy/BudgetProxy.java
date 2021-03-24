package org.br.structural.proxy;

import org.br.structural.composite.budget.Budget;

import java.math.BigDecimal;

public class BudgetProxy extends Budget {

    private BigDecimal value;
    private Budget budget;

    public BudgetProxy(Budget budget) {
        this.budget = budget;
    }
    @Override
    public BigDecimal getValue() {
        if (value == null) {
            this.value = budget.getValue();
        }
        return this.value;
    }

}
