package org.br.behavioral.state.situation;

import org.br.behavioral.DomainException;
import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetSituation {

    public BigDecimal calculateExtraDiscoundValue(Budget budget) {
        return BigDecimal.ZERO;
    }

    public void approve(Budget budget) {
        throw new DomainException("Budget couldn't be approved!");
    }

    public void disapprove(Budget budget) {
        throw new DomainException("Budget couldn't be disapprove!");
    }

    public void finish(Budget budget) {
        throw new DomainException("Budget couldn't be finished!");
    }

}
