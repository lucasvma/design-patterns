package com.chainOfResponsability;

import com.strategy.Orcamento;

public class TesteDeDescontos {

    public static void main(String[] args) {
        CalculadorDeDescontos descontos = new CalculadorDeDescontos();

        Orcamento orcamento = new Orcamento(600.0);
        orcamento.adicionarItem(new Item("CANETA", 250.0));
        orcamento.adicionarItem(new Item("LAPIS", 250.0));

        double descontoFinal = descontos.calcula(orcamento);

        System.out.println(descontoFinal);
    }
}
