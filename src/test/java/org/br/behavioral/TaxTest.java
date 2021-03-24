package org.br.behavioral;

import org.br.behavioral.strategy.budget.Budget;
import org.br.behavioral.strategy.tax.ICMS;
import org.br.behavioral.strategy.tax.ISS;
import org.br.behavioral.strategy.tax.TaxCalculator;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxTest {

    @Test
    public void test() {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();

        BigDecimal actualICMS = calculator.calculate(budget, new ICMS());
        BigDecimal actualISS = calculator.calculate(budget, new ISS());

        assertEquals(new BigDecimal("10.0"), actualICMS);
        assertEquals(new BigDecimal("6.00"), actualISS);
    }
}
