package Teste;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class CasaInteligente {
    private ArrayList<Lampada> lampadas;

    Date today = new Date();

    //Alinea b)

    //i

    public void addLampada(Lampada l) {
        this.lampadas.add(l);
    }

    //ii

    public void ligaLampadaNormal(int index) {
        this.lampadas.get(index).lampON();
    }

    //iii

    public void ligaLampadaEco(int index) {
        this.lampadas.get(index).lampECO();
    }

    //iv

    public int qtEmEco() {
        int resultado = 0;
        Iterator<Lampada> l = this.lampadas.iterator();
        Lampada a;

        while (l.hasNext()) {
            a = l.next();
            if (a.isEco()) resultado++;
        }
        return resultado;
    }

    public int qtEmEcoAlternate() {
        return (int) this.lampadas.stream().filter(Lampada::isEco).count();
    }

    //v

    public void removeLampada(int index) {
        this.lampadas.remove(index);
    }

    //vi

    public void ligaTodasEco() {
        this.lampadas.stream().forEach(Lampada::lampECO);
    }

    public void ligaTodasMax() {
        this.lampadas.stream().forEach(Lampada::lampON);
    }


    //vii

    public double consumoTotal() {
        double resultado = 0;
        Iterator<Lampada> l = this.lampadas.iterator();
        Lampada a;

        while (l.hasNext()) {
            a = l.next();
            resultado += a.getConsumoCumulativo();
        }
        return resultado;
    }

    //viii

    public void reset() {
        this.lampadas.stream().forEach(Lampada::resetLamp);
    }


    //CONSTRUTORES

    public CasaInteligente() {
        this.lampadas = new ArrayList<Lampada>();
    }

    public CasaInteligente(ArrayList<Lampada> lampadas) {
        this.lampadas = new ArrayList<Lampada>(lampadas.size());
        for (Lampada l : lampadas) {
            this.lampadas.add(l.clone());
        }
    }

    public CasaInteligente(CasaInteligente c) {
        this.lampadas = new ArrayList<Lampada>(c.lampadas.size());
        for (Lampada l : c.lampadas) this.lampadas.add(l.clone());
    }

    //GETTERS
    public ArrayList<Lampada> getLampadas() {
        return lampadas;
    }

    //SETTERS
    public void setLampadas(ArrayList<Lampada> lampadas) {
        this.lampadas = lampadas;
    }

    //EQUALS


    @Override
    public String toString() {
        return "CasaInteligente{" +
                "lampadas=" + lampadas +
                '}';
    }


}
