package org.br.behavioral.chainOfResponsability.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountMoreThanFiveItems extends Discount {

    public BudgetDiscountMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal calculate(Budget budget) {
        if (budget.getItensQuantity() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(budget);
    }
}
