package org.br.structural;

import org.br.behavioral.strategy.budget.Budget;
import org.br.structural.adapter.BudgetRecord;
import org.br.structural.adapter.http.JavaHttpClient;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class AdapterTest {

    @Test
    public void test() throws Exception {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.finish();

        BudgetRecord record = new BudgetRecord(new JavaHttpClient());
        record.record(budget);
    }
}
