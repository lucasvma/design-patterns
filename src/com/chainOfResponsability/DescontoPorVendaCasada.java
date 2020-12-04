package com.chainOfResponsability;

import com.strategy.Orcamento;

import java.util.List;

public class DescontoPorVendaCasada implements Desconto {

    private Desconto proximo;
    private List<Item> itens;

    public double desconta(Orcamento orcamento) {
        itens = orcamento.getItens();

        return possuiVendaCasada() ? orcamento.getValor() * 0.05 : proximo.desconta(orcamento);
    }

    private boolean possuiVendaCasada() {
        return contemItemDeNome("LAPIS") && contemItemDeNome("CANETA");
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    public boolean contemItemDeNome(String nomeDoItem) {
        for (Item item : itens) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
}
