package Teste;

import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private LocalDate construcao;
    private double consumo;
    private int kilometragem;
    private double mediaConsumo;
    private int kilometrosLast;
    private double mediaConsumoLast;
    private double regen;
    private boolean ligado;

    //METODOS

    //B)

    public void ligaCarro(){
        this.ligado = true;
        this.kilometragem += getKilometrosLast();
        this.kilometrosLast = 0;
        this.mediaConsumo =( getMediaConsumo() + getMediaConsumoLast() ) / 2;
        this.mediaConsumoLast = 0;
    }

    //C)
    public void desligaCarro(){
        this.ligado = false;
    }

    //D)
    public void resetUltimaViagem(){
        this.kilometragem += getKilometrosLast();
        this.kilometrosLast = 0;
        this.mediaConsumo =( getMediaConsumo() + getMediaConsumoLast() ) / 2;
        this.mediaConsumoLast = 0;
    }

    //E)


    //CONSTRUTORES

    public Carro() {
        this.marca = "Mercedes";
        this.modelo = "AMG";
        this.construcao = LocalDate.of(2005,6,8);
        this.consumo = 4.5;
        this.kilometragem = 20000;
        this.mediaConsumo = 4.5;
        this.kilometragem =0;
        this.mediaConsumoLast = 0;
        this.regen = 0.005;
        this.ligado= false;
    }

    public Carro(String marca, String modelo, LocalDate construcao, double consumo, int kilometragem, double mediaConsumo, int kilometrosLast, double consumoLast, double regen,boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.construcao = construcao;
        this.consumo = consumo;
        this.kilometragem = kilometragem;
        this.mediaConsumo = mediaConsumo;
        this.kilometrosLast = kilometrosLast;
        this.mediaConsumoLast = consumoLast;
        this.regen = regen;
        this.ligado = ligado;
    }

    public Carro ( Carro c){
        this.marca = c.getMarca();
        this.modelo = c.getModelo();
        this.construcao= c.getConstrucao();
        this.consumo = c.getConsumo();
        this.kilometragem = c.getKilometragem();
        this.mediaConsumo = c.getMediaConsumo();
        this.kilometrosLast = c.getKilometrosLast();
        this.mediaConsumoLast = c.getMediaConsumoLast();
        this.regen = c.getRegen();
        this.ligado = c.isLigado();
    }



    //GETTERS


    public LocalDate getConstrucao() {
        return construcao;
    }

    public double getMediaConsumoLast() {
        return mediaConsumoLast;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public double getMediaConsumo() {
        return mediaConsumo;
    }

    public int getKilometrosLast() {
        return kilometrosLast;
    }

    public double getRegen() {
        return regen;
    }

    public boolean isLigado() {
        return ligado;
    }

    //SETTERS

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setConstrucao(LocalDate construcao) {
        this.construcao = construcao;
    }

    public void setMediaConsumoLast(double mediaConsumoLast) {
        this.mediaConsumoLast = mediaConsumoLast;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public void setMediaConsumo(double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }

    public void setKilometrosLast(int kilometrosLast) {
        this.kilometrosLast = kilometrosLast;
    }

    public void setConsumoLast(int consumoLast) {
        this.mediaConsumoLast = consumoLast;
    }

    public void setRegen(double regen) {
        this.regen = regen;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
