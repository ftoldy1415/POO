package Teste;

import java.util.Date;

public class Lampada {
    private long consumoCumulativo;         // consumo total
    private int consumoLigada;              // consumo por milisegundo quando ligada
    private int consumoEco;                 // consumo por milisegundo quando eco
    private long reset;                     // data do ultimo reset
    private boolean Eco;
    private boolean ON;
    private boolean OFF;

    Date today = new Date();


    //METODOS

    public void resetLamp(){
        this.reset = today.getTime();
    }

    //a)
    public void lampON(){
        long x = today.getTime();
        long delta = x - this.reset;
        if (isOFF()){
            this.reset = today.getTime();
            this.ON = true;
            this.OFF = false;
        }
        if (isEco()){
            this.consumoCumulativo= delta * this.consumoEco;
            this.reset = today.getTime();
            this.Eco = false;
        }
    }

    //b)
    public void lampOFF(){
        long x = today.getTime();
        long delta = x - this.reset;
        if (isON()){
            this.consumoCumulativo= delta * this.consumoLigada;
            this.reset = today.getTime();
            this.ON = false;
        }
        else if(isEco()){
            this.consumoCumulativo= delta * this.consumoEco;
            this.reset = today.getTime();
            this.Eco = false;
        }


    }

    //c
    public void lampECO(){
        long x = today.getTime();
        long delta = x - this.reset;
        if (isOFF()){
            this.reset = today.getTime();
            this.Eco = true;
            this.OFF = false;
        }
        else if(isON()){
            this.consumoCumulativo= delta * this.consumoLigada;
            this.reset = today.getTime();
            this.ON = false;
            this.Eco = true;
        }
    }

    //d)
    public double totalConsumo(){
        double result = 0;
        if (isEco()){
            result = getConsumoCumulativo() + this.reset*getConsumoEco();
        }
        else if (isON()){
            result = getConsumoCumulativo() + this.reset*getConsumoLigada();
        }
        else if (isOFF()){
            result = getConsumoCumulativo();
        }
        return result;
    }


    //e)
    public double periodoConsumo(){
        long x = today.getTime();
        long delta = x - this.reset;
        if (isON()){
            return delta * getConsumoLigada();
        }
        else if (isEco()){
            return delta * getConsumoEco();
        }
        else return 0;
    }

    //CONSTRUTORES

    public Lampada (){
        this.consumoCumulativo = 0;
        this.consumoLigada = 5;
        this.consumoEco = 2;
        this.reset = today.getTime();
        this.Eco = false;
        this.ON = false;
        this.OFF = true;
    }

    public Lampada(long consumoCumulativo, int consumoLigada, int consumoEco, long reset, boolean eco, boolean ON, boolean OFF) {
        this.consumoCumulativo = consumoCumulativo;
        this.consumoLigada = consumoLigada;
        this.consumoEco = consumoEco;
        this.reset = reset;
        this.Eco = eco;
        this.ON = ON;
        this.OFF = OFF;
    }

    public Lampada (Lampada l){
        this.consumoCumulativo = l.consumoCumulativo;
        this.consumoLigada = l.getConsumoLigada();
        this.consumoEco = l.getConsumoEco();
        this.reset = l.getReset();
        this.Eco = l.isEco();
        this.ON = l.isON();
        this.OFF = l.isOFF();
    }


    public String toString() {
        return "Lampada{" +
                "consumoCumulativo=" + consumoCumulativo +
                ", consumoLigada=" + consumoLigada +
                ", consumoEco=" + consumoEco +
                ", reset=" + reset +
                ", Eco=" + Eco +
                ", ON=" + ON +
                ", OFF=" + OFF +
                '}' + "\n";
    }


    public Lampada clone() {
        return new Lampada(this);
    }


    //GETTERS

    public int getConsumoLigada() {
        return consumoLigada;
    }

    public int getConsumoEco() {
        return consumoEco;
    }

    public long getConsumoCumulativo() {
        return consumoCumulativo;
    }

    public long getReset() {
        return reset;
    }

    public boolean isEco() {
        return Eco;
    }

    public boolean isON() {
        return ON;
    }

    public boolean isOFF() {
        return OFF;
    }

    //SETTERS


    public void setConsumoCumulativo(int consumoCumulativo) {
        this.consumoCumulativo = consumoCumulativo;
    }

    public void setConsumoLigada(int consumoLigada) {
        this.consumoLigada = consumoLigada;
    }

    public void setConsumoEco(int consumoEco) {
        this.consumoEco = consumoEco;
    }

    public void setReset(long reset) {
        this.reset = reset;
    }

    public void setEco(boolean eco) {
        Eco = eco;
    }

    public void setON(boolean ON) {
        this.ON = ON;
    }

    public void setOFF(boolean OFF) {
        this.OFF = OFF;
    }
}
