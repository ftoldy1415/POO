package com.company;

import java.util.ArrayList;

public class VeiculoNormal extends Veiculo{
    public VeiculoNormal(){
        super();
    }

    public VeiculoNormal(String marca, String modelo, String matricula,
                   int ano, double velociademedia, double precokm,
                   ArrayList<Integer> classificacao,
                   int kms, int kmsUltimo){
        super(marca, matricula, modelo,ano,velociademedia,precokm,classificacao,kms,kmsUltimo);
    }

    public VeiculoNormal(VeiculoNormal vn){
        super(vn);
    }


    public VeiculoNormal clone (VeiculoNormal vn){
        return new VeiculoNormal(this);
    }


    public VeiculoNormal clone(){
        return new VeiculoNormal(this);
    }

    public double custoRealKM(){
        return getPrecokm()*1.1;
    }
}
