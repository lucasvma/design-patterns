package org.br.behavioral.state.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class BudgetDiscountMoreThanFiveItems extends Discount {

    public BudgetDiscountMoreThanFiveItems(Discount next) {
        super(next);
    }

    public BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean shouldApply(Budget budget) {
        return budget.getItensQuantity() > 5;
    }
}
