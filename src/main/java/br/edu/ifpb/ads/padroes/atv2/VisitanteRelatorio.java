package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Item.ItemProduto;
import br.edu.ifpb.ads.padroes.atv2.Item.ItemServico;

public interface VisitanteRelatorio {

    double visitar(ItemProduto itemProduto);
    double visitar(ItemServico itemServico);
}
