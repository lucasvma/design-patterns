package org.br.behavioral.chainOfResponsability.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountBiggerThanFiveHundred extends Discount {

    public BudgetDiscountBiggerThanFiveHundred(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return next.calculate(budget);
    }
}
