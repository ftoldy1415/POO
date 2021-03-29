package Teste;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o exercicio que pretende testar");
        int exerc = in.nextInt();
        switch(exerc){
            case 1 : {
                LinhaEncomenda le1 = new LinhaEncomenda("1231234444","Meias",5.0,5,0.13,0.05);
                LinhaEncomenda le2 = new LinhaEncomenda("1231235555","Calças",40.0,10,0.13,0.10);
                LinhaEncomenda le3 = new LinhaEncomenda("1231236666","Camisolas",30.0,15,0.13,0.15);
                LinhaEncomenda le4 = new LinhaEncomenda("1231237777","Chapeus",15.0,3,0.13,0.05);
                LinhaEncomenda le5 = new LinhaEncomenda("1231238888","Sapatos",25.0,20,0.13,0.10);
                Encomenda e1 = new Encomenda();
                e1.adicionaLinha(le1);
                e1.adicionaLinha(le2);
                e1.adicionaLinha(le3);
                e1.adicionaLinha(le4);
                e1.adicionaLinha(le5);
                System.out.println(e1.toString() + "\n" + "\n");
                System.out.println("O numero total de produtos é: " + e1.numeroTotalProdutos());
                System.out.println("A referencia 1234 faz parte? "  + e1.existeProdutoEncomenda("1234"));
                System.out.println("A referencia 1231238888 faz parte? "  + e1.existeProdutoEncomenda("1231238888"));
                System.out.println("o Valor total é: " + e1.calculaValorTotal());
                System.out.println("o valore descontado é: " + e1.calculaValorDesconto());
                e1.removeProduto("1231237777");
                System.out.println(e1.toString() + "\n" + "\n");
                break;
         }
            case 2 : {
                Lampada l1 = new Lampada();
                Lampada l2 = new Lampada();
                Lampada l3 = new Lampada();
                Lampada l4 = new Lampada();
                CasaInteligente ci = new CasaInteligente();
                ci.addLampada(l1);
                ci.ligaLampadaEco(0);
                ci.addLampada(l2);
                ci.ligaLampadaNormal(1);
                ci.addLampada(l3);
                ci.addLampada(l4);
                ci.qtEmEco();
                System.out.println(ci.qtEmEcoAlternate());
                ci.ligaTodasMax();
                System.out.println(ci.toString()+"\n");
                ci.ligaTodasEco();
                ci.removeLampada(1);
                ci.reset();
                System.out.println(ci.toString()+"\n");
            }
        }
    }
}

