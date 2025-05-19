package br.edu.ifpb.ads.padroes.atv2;

import br.edu.ifpb.ads.padroes.atv2.Item.Item;

public class CalculadoraImpostoItem {

    private VisitanteRelatorio visitanteRelatorio;

    public CalculadoraImpostoItem(VisitanteRelatorio visitanteRelatorio){
        this.visitanteRelatorio = visitanteRelatorio;
    }


    public void setVisitante(VisitanteRelatorio visitanteRelatorio) {
        this.visitanteRelatorio = visitanteRelatorio;
    }

    public double calcularImpostoItem(Item item){
        return item.calcular(visitanteRelatorio);
    }
}
