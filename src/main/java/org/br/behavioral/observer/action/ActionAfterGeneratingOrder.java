package org.br.behavioral.observer.action;

import org.br.behavioral.command.order.Order;

public interface ActionAfterGeneratingOrder {

    public void executeAction(Order order);
}
