package com.company;

import java.util.ArrayList;

public class VeiculoPremium extends Veiculo{

    private int taxa;
    private int pontos;


    public VeiculoPremium(){
        super();
        this.taxa= 0;
    }


    public VeiculoPremium(String marca, String modelo, String matricula,
                         int ano, double velociademedia, double precokm,
                         ArrayList<Integer> classificacao,
                         int kms, int kmsUltimo){
        super(marca, matricula, modelo,ano,velociademedia,precokm,classificacao,kms,kmsUltimo);
        this.taxa= 0;

    }


    public VeiculoPremium(VeiculoPremium vp)
    {
        super(vp);
        this.taxa = vp.getTaxa();
    }

    public int getTaxa() {
        return taxa;
    }

    public VeiculoPremium clone(){
        return new VeiculoPremium(this);
    }

    public double custoRealKM(){
        return getPrecokm()*1.1*(this.taxa/100+1);
    }

    public void definePontosPorKm(int pts){
        this.pontos = pts;
    }


    public int getPontosPorKm(){
        return this.pontos;
    }

}
