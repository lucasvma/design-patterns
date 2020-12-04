package com.chainOfResponsability;

import com.strategy.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
