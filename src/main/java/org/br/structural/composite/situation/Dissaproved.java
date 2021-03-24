package org.br.structural.composite.situation;

import org.br.structural.composite.budget.Budget;

public class Dissaproved extends BudgetSituation {

    public void finish(Budget budget) {
        budget.setSituation(new Finished());
    }
}
