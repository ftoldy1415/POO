package Teste;

public class Triangulo {
    private Ponto pontoA;
    private Ponto pontoB;
    private Ponto pontoC;

    public double calculaAreaTriangulo (){
        double a = this.pontoA.distancia(pontoB);
        double b = this.pontoB.distancia(pontoC);
        double c = this.pontoC.distancia(pontoA);
        double s = (a+b+c)/2 ;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public Triangulo clone(){
        return new Triangulo(this);
    }

    //CONSTRUTORES

    public Triangulo(){
        this.pontoA = new Ponto(1,1);
        this.pontoB = new Ponto(5,5);
        this.pontoC = new Ponto(1,5);
    }

    public Triangulo(Ponto pontoA, Ponto pontoB, Ponto pontoC) {
        this.pontoA = pontoA.clone();
        this.pontoB = pontoB.clone();
        this.pontoC = pontoC.clone();
    }

    public Triangulo(Triangulo t){
        this.pontoA = getPontoA();
        this.pontoB = getPontoB();
        this.pontoC = getPontoC();
    }


    //GETTERS
    public Ponto getPontoA() {
        return pontoA;
    }

    public Ponto getPontoB() {
        return pontoB;
    }

    public Ponto getPontoC() {
        return pontoC;
    }


    //SETTERS
    public void setPontoA(Ponto pontoA) {
        this.pontoA = pontoA;
    }

    public void setPontoB(Ponto pontoB) {
        this.pontoB = pontoB;
    }

    public void setPontoC(Ponto pontoC) {
        this.pontoC = pontoC;
    }

    public String toString(){
        return ("Ponto A: " + this.pontoA + "Ponto B: " +this.pontoB+ "Ponto C: " +this.pontoC);
    }
}
