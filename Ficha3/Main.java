package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o exercicio que pretende testar");
        int exerc = in.nextInt();
        switch(exerc){
            case 1 : {
                Circulo c1 = new Circulo();
                Circulo c2 = new Circulo(1, 1,5);
                Circulo c3 = new Circulo(c2);

                System.out.println("C2 x:" + c2.getX() + " perimetro: " + c2.calculaPerimetro());
                System.out.println("C3:" +c3.toString());
                System.out.println(c1.toString());
                break;

            }
            case 2 : {
                String[] texts = new String[15];
                String[] names = new String[10];
                Telemovel t1 = new Telemovel();
                Telemovel t2 = new Telemovel("Sony", "Xperia", 1280.0, 720.0,15,texts,250,200,50,4,10,20,names);
                t2.recebeMsg("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                t2.instalaApp("Discord",2);
                t2.instalaApp("instagram",2);
                t2.instalaApp("Zoom",3);
                t2.instalaApp("Messenger",2);
                Telemovel t3 = new Telemovel(t2);
                t3.recebeMsg("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
                t2.recebeMsg("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                t3.instalaApp("Skype",2);
                t2.removeApp("Discord",2);
                System.out.println(t1.toString());
                System.out.println(t2.toString());
                System.out.println(t3.toString());
                System.out.println(t2.tamMedioApps());
                System.out.println(t2.existeEspaco(10));
                System.out.println(t2.maiorMsg());
            }
            case 3 : {
                YoutubeVideo y1 = new YoutubeVideo();
                YoutubeVideo y2 = new YoutubeVideo(y1);
                System.out.println(y1.toString());
                System.out.println(y2.toString());
                y1.insereComentario("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                System.out.println("Quantos dias depois? : " + y2.daysLater());
                y1.thumbsUp();
                y2.insereComentario("bbbbbbbbbbbbbbbbbbbbbbbbbbb");
                System.out.println(y1.toString());
                System.out.println(y2.toString());
                break;
            }
            case 4 : {
                Lampada l3eco = new Lampada(0,10,3,0,false,true,false);
                System.out.println("O consumo desde o ultimo reset foi: " + l3eco.periodoConsumo() + "\n");
                l3eco.lampECO();
                TimeUnit.SECONDS.sleep(2);          //para dar tempo para aumentar o consumo
                System.out.println("o consumo comulativo foi: " + l3eco.totalConsumo());
                l3eco.toString();
                break;
            }
            case 5 : {
                JogoDeFutebol j1 = new JogoDeFutebol();
                JogoDeFutebol j2 = new JogoDeFutebol(j1);
                j1.startGame();
                j1.goloVisitado();
                j1.goloVisitante();
                j1.goloVisitado();
                JogoDeFutebol j3 = new JogoDeFutebol(1,2,2,"1-2");
                j3.goloVisitado();
                j3.endGame();
                System.out.println(j1.toString());
                System.out.println(j2.toString());
                System.out.println(j3.toString());
                break;
            }
            case 7 : {
                LinhaEncomenda le = new LinhaEncomenda();
                LinhaEncomenda le2 = new LinhaEncomenda (le);
                LinhaEncomenda le3 = new LinhaEncomenda("1231234444","Meias",5.0,5,13,5);
                System.out.println("O valor descontado é : " + le.calculaValorDesconto() + "\n");
                System.out.println("O valor da encomenda é : " + le.calculaValorLinhaEnc() + "\n");
                System.out.println(le.toString());
                System.out.println(le2.toString());
                System.out.println(le3.toString());
                break;
            }
            case 8 : {
                LinhaEncomenda le3 = new LinhaEncomenda("1231234444","Meias",5.0,5,13,5);
                Encomenda e1 = new Encomenda();
                Encomenda e2 = new Encomenda(e1);
                System.out.println(e1.toString() + "\n" + "\n");
                System.out.println(e2.toString() + "\n" + "\n");
                System.out.println("o Valor total é: " + e1.calculaValorTotal());
                System.out.println("o valore descontado é: " + e2.calculaValorDesconto());
                e2.adicionaLinha(le3);
                e1.removeProduto("0123124");
                System.out.println(e1.toString());
                System.out.println(e2.toString());
                break;
            }
            case 9 : {
                Triangulo a = new Triangulo();
                System.out.println(a.toString());
                System.out.println(a.calculaAreaTriangulo());
            }
        }




    }
}
