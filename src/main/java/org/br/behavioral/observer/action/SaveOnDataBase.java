package org.br.behavioral.observer.action;

import org.br.behavioral.command.order.Order;

public class SaveOnDataBase implements ActionAfterGeneratingOrder {

    @Override public void executeAction(Order order) {
        System.out.println("Salving order on database!");
    }
}
