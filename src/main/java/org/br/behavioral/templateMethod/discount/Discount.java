package org.br.behavioral.templateMethod.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    protected BigDecimal calculate(Budget budget) {
        if (shouldApply(budget)) {
            return performCalculation(budget);
        }

        return next.calculate(budget);
    }

    protected abstract BigDecimal performCalculation(Budget budget);
    protected abstract boolean shouldApply(Budget budget);

}