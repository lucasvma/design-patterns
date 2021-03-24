package org.br.structural;

import org.br.structural.composite.budget.Budget;
import org.br.structural.composite.budget.BudgetItem;
import org.br.structural.proxy.BudgetProxy;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProxyTest {

    @Test
    public void test() {
        Budget old = new Budget();
        old.addItem(new BudgetItem(new BigDecimal("200")));
        old.dissapprove();

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));
        newBudget.addItem(old);

        BudgetProxy proxy = new BudgetProxy(newBudget);

        assertEquals(new BigDecimal("700"), proxy.getValue());
        assertEquals(new BigDecimal("700"), proxy.getValue());
        assertEquals(new BigDecimal("700"), proxy.getValue());
        assertEquals(new BigDecimal("700"), proxy.getValue());
        assertEquals(new BigDecimal("700"), proxy.getValue());
        assertEquals(new BigDecimal("700"), proxy.getValue());
        assertEquals(new BigDecimal("700"), proxy.getValue());
    }
}
