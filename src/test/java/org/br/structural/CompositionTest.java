package org.br.structural;

import org.br.structural.composite.budget.Budget;
import org.br.structural.composite.budget.BudgetItem;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositionTest {

    @Test
    public void test() {
        Budget old = new Budget();
        old.addItem(new BudgetItem(new BigDecimal("200")));
        old.dissapprove();

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));
        newBudget.addItem(old);

        assertEquals(new BigDecimal("700"), newBudget.getValue());
    }
}
