package br.edu.ifpb.ads.padroes.atv2.Item;

import br.edu.ifpb.ads.padroes.atv2.VisitanteRelatorio;

public class ItemProduto implements Item{

    private double valor;

    public ItemProduto(double valor){
        this.valor=valor;
    }


    public double getValor() {
        return valor;
    }

    @Override
    public double calcular(VisitanteRelatorio visitanteRelatorio) {
        return visitanteRelatorio.visitar(this);
    }
}
