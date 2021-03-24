package org.br.behavioral.strategy.tax;

import org.br.behavioral.strategy.budget.Budget;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal calculate(Budget budget);
}
