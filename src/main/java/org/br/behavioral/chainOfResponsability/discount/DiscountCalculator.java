package org.br.behavioral.chainOfResponsability.discount;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class DiscountCalculator {

    public BigDecimal calculate(Budget budget) {
        Discount discount = new BudgetDiscountMoreThanFiveItems(
                new BudgetDiscountBiggerThanFiveHundred(
                        new NoDiscount()));

        return discount.calculate(budget);
    }
}

