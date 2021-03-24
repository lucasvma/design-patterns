package org.br.structural;

import org.br.behavioral.strategy.budget.Budget;
import org.br.structural.decorator.ICMS;
import org.br.structural.decorator.ISS;
import org.br.structural.decorator.TaxCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {

    @Test
    public void test() {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();

        BigDecimal actual = calculator.calculate(budget, new ICMS(new ISS(null)));

        assertEquals(new BigDecimal("16.00"), actual);
    }
}
