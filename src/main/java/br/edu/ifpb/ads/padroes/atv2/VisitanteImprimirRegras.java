package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Item.ItemProduto;
import br.edu.ifpb.ads.padroes.atv2.Item.ItemServico;

public class VisitanteImprimirRegras implements VisitanteImprimir{
    @Override
    public void imprimir(ItemProduto itemProduto, double valor) {
        System.out.println("O valor do Produto é: " + valor);
    }

    @Override
    public void imprimir(ItemServico itemServico, double valor) {
        System.out.println("O valor do Serviço é: " + valor);
    }
}
