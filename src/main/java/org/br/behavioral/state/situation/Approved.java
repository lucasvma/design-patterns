package org.br.behavioral.state.situation;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetSituation {

    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
