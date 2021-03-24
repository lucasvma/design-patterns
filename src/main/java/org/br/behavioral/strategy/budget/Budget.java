package org.br.behavioral.strategy.budget;

import org.br.behavioral.state.situation.BudgetSituation;
import org.br.behavioral.state.situation.Finished;
import org.br.behavioral.state.situation.UnderAnalysis;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private int itensQuantity;
    private BudgetSituation situation;

    public Budget(BigDecimal value, int itensQuantity) {
        this.value = value;
        this.itensQuantity = itensQuantity;
        this.situation = new UnderAnalysis();
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = this.situation.calculateExtraDiscoundValue(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve() {
        this.situation.approve(this);
    }

    public void dissapprove() {
        this.situation.disapprove(this);
    }

    public void finish() {
        this.situation.finish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public int getItensQuantity() {
        return itensQuantity;
    }

    public BudgetSituation getSituation() {
        return situation;
    }

    public void setSituation(BudgetSituation situation) {
        this.situation = situation;
    }

    public boolean isFinished() {
        return situation instanceof Finished;
    }
}
