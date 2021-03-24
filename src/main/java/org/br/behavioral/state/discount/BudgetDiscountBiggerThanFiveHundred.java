package org.br.behavioral.state.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountBiggerThanFiveHundred extends Discount {

    public BudgetDiscountBiggerThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
}
