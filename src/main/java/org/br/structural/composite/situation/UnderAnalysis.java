package org.br.structural.composite.situation;

import org.br.structural.composite.budget.Budget;

import java.math.BigDecimal;

public class UnderAnalysis extends BudgetSituation {

    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void approve(Budget budget) {
        budget.setSituation(new Approved());
    }

    public void disapprove(Budget budget) {
        budget.setSituation(new Dissaproved());
    }
}
