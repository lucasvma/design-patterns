package org.br.behavioral.state.situation;

import org.br.behavioral.strategy.budget.Budget;

public class Dissaproved extends BudgetSituation {

    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
