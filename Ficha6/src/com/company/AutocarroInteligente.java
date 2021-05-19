package com.company;

import java.util.ArrayList;

public class AutocarroInteligente extends Veiculo implements BonificaKms{
    private static final int capMax = 50;
    private int cap;
    private int pontos;
    private int pontosPorKm;


    public AutocarroInteligente(){
        super();
        cap = 0;
        this.pontos = 0;
        this.pontosPorKm = 0;
    }

    public AutocarroInteligente(String marca, String modelo, String matricula, int ano, double velociademedia, double precokm,
                                ArrayList<Integer> classificacao, int kms, int kmsUltim , int cap , int pontos, int pontosPorKm){
        super(marca,modelo,matricula,ano,velociademedia,precokm,new ArrayList<>(),kms,kmsUltim);
        this.cap = cap;
        this.pontos = pontos;
        this.pontosPorKm = pontosPorKm;

    }

    public AutocarroInteligente(AutocarroInteligente smartBus){
        super(smartBus);
        this.cap = smartBus.getCap();
    }

    public int getCap(){
        return this.cap;
    }

    public AutocarroInteligente clone(){
        return new AutocarroInteligente(this);
    }

    public double custoRealKM(){
        double custo = 0.0;
        if( (double)cap/capMax <= 0.6 && (double) cap/capMax >= 0) custo = this.getPrecokm() * 0.5;
        else if ((double) cap/capMax >= 0.61 && (double)cap/capMax <= 1) custo = this.getPrecokm() * 0.75;
        return custo;
    }

    public void definePontosPorKm(int pts){
        this.pontosPorKm = pts;
    }

    public int getPontosTotal(){
        return this.pontos;
    }

    public int getPontosPorKm(){
        return this.pontosPorKm;
    }



}
