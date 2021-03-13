package Teste;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

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
                break;

            }

            case 2 : {
                String[] texts = new String[250];
                String[] names = new String[10];
                Telemovel t1 = new Telemovel();
                Telemovel t2 = new Telemovel("Sony", "Xperia", 1280.0, 720.0,250,texts,250,200,50,4,10,20,names);
                t2.recebeMsg("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                t2.instalaApp("Discord",2);
                t2.instalaApp("instagram",2);
                t2.instalaApp("Zoom",3);
                t2.instalaApp("Messenger",2);
                Telemovel t3 = new Telemovel(t2);
                t3.recebeMsg("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
                t3.instalaApp("Skype",2);
                t2.removeApp("Discord",2);
                System.out.println(t1.toString());
                System.out.println(t2.toString());
                System.out.println(t3.toString());
                System.out.println(t2.tamMedioApps());
                System.out.println(t2.existeEspaco(10));
                System.out.println(t2.maiorMsg());
            }
        }




    }
}
