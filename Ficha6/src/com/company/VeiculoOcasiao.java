package com.company;

import java.util.ArrayList;

public class VeiculoOcasiao extends Veiculo {

    public boolean promocao;

    public VeiculoOcasiao(){
        super();
        this.promocao = false;
    }

    public VeiculoOcasiao(String marca, String modelo, String matricula, int ano, double velocidademedia, double precoKm ,
                          ArrayList<Integer> calssificacao, int kms, int kmsUltimo , boolean promocao){

        super( marca,  modelo,  matricula,  ano,  velocidademedia,  precoKm , calssificacao,  kms,  kmsUltimo );
        this.promocao = promocao;
    }

    public VeiculoOcasiao(VeiculoOcasiao vo){
        super(vo);
        this.promocao = vo.getPromocao();
    }

    //getters
    public boolean getPromocao(){
        return this.promocao;
    }

    public void setPromocao(boolean promocao){
        this.promocao = promocao;
    }

    //metodos de instancia
    public double custoRealKM(){
        double custo;
        if(this.getPromocao()){
            custo = super.getPrecokm() * 0.75;
        }
        else custo = super.getPrecokm();
        return custo;
    }

    public VeiculoOcasiao clone(){
        return new VeiculoOcasiao(this);
    }


}
