package org.br.behavioral.observer.action;

import org.br.behavioral.command.order.Order;

public class SendEmailOrder implements ActionAfterGeneratingOrder {

    @Override public void executeAction(Order order) {
        System.out.println("Sending email with order data!");
    }
}
