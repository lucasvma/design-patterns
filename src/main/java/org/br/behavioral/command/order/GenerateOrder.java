package org.br.behavioral.command.order;

import java.math.BigDecimal;

public class GenerateOrder {

    private String client;
    private BigDecimal budgetValue;
    private int itensQuantity;

    public GenerateOrder(String client, BigDecimal budgetValue, int itensQuantity) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.itensQuantity = itensQuantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }
}
