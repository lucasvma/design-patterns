package org.br.behavioral.templateMethod.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount {

    public NoDiscount() {
        super(null);
    }

    public BigDecimal performCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    @Override public boolean shouldApply(Budget budget) {
        return true;
    }
}
