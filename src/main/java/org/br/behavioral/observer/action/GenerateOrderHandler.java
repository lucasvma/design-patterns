package org.br.behavioral.observer.action;

import org.br.behavioral.command.order.GenerateOrder;
import org.br.behavioral.command.order.Order;
import org.br.behavioral.strategy.budget.Budget;

import java.time.LocalDate;
import java.util.List;

public class GenerateOrderHandler {

    private final List<ActionAfterGeneratingOrder> actions;

    public GenerateOrderHandler(List<ActionAfterGeneratingOrder> actions) {
        this.actions = actions;
    }

    public void execute(GenerateOrder data) {
        Budget budget = new Budget(data.getBudgetValue(), data.getItensQuantity());

        Order order = new Order(data.getClient(), LocalDate.now(), budget);

        actions.forEach(a -> a.executeAction(order));
    }
}
