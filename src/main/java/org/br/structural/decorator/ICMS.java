package org.br.structural.decorator;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class ICMS extends Tax {

    public ICMS(Tax otherTax) {
        super(otherTax);
    }

    @Override protected BigDecimal performCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

}
