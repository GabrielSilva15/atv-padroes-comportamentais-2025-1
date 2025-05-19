package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Item.Item;
import br.edu.ifpb.ads.padroes.atv2.Item.ItemProduto;
import br.edu.ifpb.ads.padroes.atv2.Item.ItemServico;

public class Loader {

    public static void main(String[] args) {
        VisitanteRelatorio regraCalcular = new VisitanteRelatorioRegras();
        VisitanteImprimir visitanteImprimir = new VisitanteImprimirRegras();
        CalculadoraImpostoItem calculadoraImpostoItem = new CalculadoraImpostoItem(regraCalcular);

        ItemProduto itemProduto = new ItemProduto(50);
        ItemServico itemServico = new ItemServico(150);

        visitanteImprimir.imprimir(itemProduto,calculadoraImpostoItem.calcularImpostoItem(itemProduto));
        visitanteImprimir.imprimir(itemServico,calculadoraImpostoItem.calcularImpostoItem(itemServico));




    }
}
