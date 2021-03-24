package org.br.structural.composite.budget;

import org.br.structural.composite.situation.BudgetSituation;
import org.br.structural.composite.situation.Finished;
import org.br.structural.composite.situation.UnderAnalysis;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Budget implements Budgetable {

    private BigDecimal value;
    private BudgetSituation situation;
    private List<Budgetable> itens;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }

    public int getItensQuantity() {
        return itens.size();
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

    public void addItem(Budgetable item) {
        this.value = value.add(item.getValue());
        this.itens.add(item);
    }
}
