package org.br.behavioral.command.order;

import org.br.behavioral.strategy.budget.Budget;

import java.time.LocalDate;

public class GenerateOrderHandler {

    // Constructor with Dependecy Injection: repository, service...
    public GenerateOrderHandler() {
    }

    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getBudgetValue(), data.getItensQuantity());

        Order order = new Order(data.getClient(), LocalDate.now(), budget);
    }
}
