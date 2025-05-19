package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Item.ItemProduto;
import br.edu.ifpb.ads.padroes.atv2.Item.ItemServico;

public class VisitanteRelatorioRegras implements VisitanteRelatorio {

    @Override
    public double visitar(ItemProduto itemProduto) {
        return itemProduto.getValor() + (itemProduto.getValor() * 0.1);
    }

    @Override
    public double visitar(ItemServico itemServico) {
        return itemServico.getValor() + (itemServico.getValor() * 0.15);
    }


}
