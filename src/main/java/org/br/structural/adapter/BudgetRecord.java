package org.br.structural.adapter;

import org.br.behavioral.DomainException;
import org.br.behavioral.strategy.budget.Budget;
import org.br.structural.adapter.http.HttpAdapter;

import java.net.MalformedURLException;
import java.util.Map;

public class BudgetRecord {

    private final HttpAdapter http;

    public BudgetRecord(HttpAdapter http) {
        this.http = http;
    }

    public void record(Budget budget) throws Exception {
        if (budget.isFinished()) {
            throw new DomainException("Budget isn't finished!");
        }
        String url = "http://api.external/budget";
        Map<String, Object> data = Map.of(
            "value", budget.getValue(),
            "itensQuantity", budget.getItensQuantity()
        );
        http.post(url, data);
    }
}
