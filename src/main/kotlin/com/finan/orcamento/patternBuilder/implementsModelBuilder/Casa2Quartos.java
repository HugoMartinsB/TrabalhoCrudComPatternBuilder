package com.finan.orcamento.patternBuilder.implementsModelBuilder;
import com.finan.orcamento.model.Casa;
import com.finan.orcamento.patternBuilder.InterfaceBuilderCasa;

public class Casa2Quartos implements InterfaceBuilderCasa {
    Casa casa = new Casa();

    public Casa2Quartos(){
        casa = new Casa(2,1,1);
    }

    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("Banheiro 2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Sem churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }

}
