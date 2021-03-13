package Teste;

public class JogoDeFutebol {
    private int golosHome;
    private int golosAway;
    private int estadoJogo; // 1- por iniciar, 2- a decorrer, 3-terminado
    private String resultado = golosHome + " - " + golosAway;


    //METODOS

    //a)

    public void startGame(){
        this.estadoJogo = 2;
    }

    //b)
    public void endGame(){
        this.estadoJogo = 3;
    }

    //c)
    public void goloVisitado(){
        this.golosHome++;
    }

    //d)
    public void goloVisitante(){
        this.golosAway++;
    }

    //e)
    public String resultadoActual(){
        return getResultado();
    }

    //CONSTRUTORES

    public JogoDeFutebol(){
        this.golosAway= 0;
        this.golosHome = 0;
        this.resultado = golosHome + " - " + golosAway;
        this.estadoJogo = 1;
    }

    public JogoDeFutebol(int golosHome, int golosAway, int estadoJogo, String resultado) {
        this.golosHome = golosHome;
        this.golosAway = golosAway;
        this.estadoJogo = estadoJogo;
        this.resultado = resultado;
    }

    public JogoDeFutebol(JogoDeFutebol j){
        this.estadoJogo = j.getEstadoJogo();
        this.golosHome = j.getGolosHome();
        this.golosAway = j.getGolosAway();
        this.resultado = j.getResultado();
    }

    //GETTERS

    public int getGolosHome() {
        return golosHome;
    }

    public int getGolosAway() {
        return golosAway;
    }

    public int getEstadoJogo() {
        return estadoJogo;
    }

    public String getResultado() {
        return resultado;
    }

    //SETTERS


    public void setGolosHome(int golosHome) {
        this.golosHome = golosHome;
    }

    public void setGolosAway(int golosAway) {
        this.golosAway = golosAway;
    }

    public void setEstadoJogo(int estadoJogo) {
        this.estadoJogo = estadoJogo;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
