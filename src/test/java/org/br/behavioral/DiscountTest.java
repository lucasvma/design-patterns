package org.br.behavioral;

import org.br.behavioral.chainOfResponsability.discount.DiscountCalculator;
import org.br.behavioral.strategy.budget.Budget;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest {

    @Test
    public void testChainOfResponsibility() {
        Budget firstBudget = new Budget(new BigDecimal("200"), 6);
        Budget secondBudget = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator calculator = new DiscountCalculator();
        assertEquals(new BigDecimal("20.0"), calculator.calculate(firstBudget));
        assertEquals(new BigDecimal("50.00"), calculator.calculate(secondBudget));
    }

    @Test
    public void testTemplateMethod() {
        Budget firstBudget = new Budget(new BigDecimal("200"), 6);
        Budget secondBudget = new Budget(new BigDecimal("1000"), 1);

        org.br.behavioral.templateMethod.discount.DiscountCalculator calculator =
                new org.br.behavioral.templateMethod.discount.DiscountCalculator();
        assertEquals(new BigDecimal("20.0"), calculator.calculate(firstBudget));
        assertEquals(new BigDecimal("50.00"), calculator.calculate(secondBudget));
    }
}
