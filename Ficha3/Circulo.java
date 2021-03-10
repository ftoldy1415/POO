package Teste;

public class Circulo {
    //variaveis de instancia
    private double x;
    private double y;
    private double raio;


    //construtores

    public Circulo()         // valores default
    {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    public Circulo(double x, double y, double raio)
    {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo (Circulo c)  //cria uma cópia do objeto parametro
    {
        this.x = c.getX();
        this.y = c.getY();
        this.raio = c.getRaio();
    }


    //GETTERS

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getRaio(){
        return this.raio;
    }

    //SETTERS       -> alteram um parametro do objeto

    public void setX(double nx)
    {
        this.x = nx;
    }

    public void setY(double ny)
    {
        this.y = ny;
    }

    public void setRaio(double nr)
    {
        this.raio = nr;
    }

    public void alteraCentro(double x, double y)
    {
        this.setX(x);
        this.y = y;             //duas formas de escrever
    }

    public double calulaArea()
    {
        return Math.PI * Math.pow(this.raio,2);
    }

    public double calculaPerimetro()
    {
        return 2*Math.PI * this.raio;
    }

    public String toString()
    {
        return "Circulo - X:" + this.x + " - Y:" + this.y + " RAIO: " + this.raio;
    }
}
