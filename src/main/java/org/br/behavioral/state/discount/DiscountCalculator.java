package org.br.behavioral.state.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget) {
        Discount chainOfDiscounts = new BudgetDiscountMoreThanFiveItems(
                new BudgetDiscountBiggerThanFiveHundred(
                        new NoDiscount()));

        return chainOfDiscounts.calculate(budget);
    }
}

