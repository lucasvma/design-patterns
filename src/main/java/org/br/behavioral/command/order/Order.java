package org.br.behavioral.command.order;

import org.br.behavioral.strategy.budget.Budget;

import java.time.LocalDate;

public class Order {

    private String client;
    private LocalDate date;
    private Budget budget;

    public Order(String client, LocalDate date, Budget budget) {
        this.client = client;
        this.date = date;
        this.budget = budget;
    }

    public String getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public Budget getBudget() {
        return budget;
    }
}
