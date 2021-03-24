package org.br.behavioral.strategy.tax;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }
}
