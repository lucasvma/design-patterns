package org.br.structural.decorator;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public abstract class Tax {

    private Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    protected abstract BigDecimal performCalculation(Budget budget);

    public BigDecimal calculate(Budget budget) {
        BigDecimal taxValue = performCalculation(budget);
        BigDecimal otherTaxValue = BigDecimal.ZERO;
        if (otherTax != null) {
            otherTaxValue = otherTax.performCalculation(budget);
        }
        return taxValue.add(otherTaxValue);
    }
}
