package Teste;

import java.util.Arrays;
import java.util.Scanner;

public class Ficha2 {
    public static Scanner sc = new Scanner(System.in);

    private static int[][] pauta = {            // matriz definida para auxiliar nos testes das funçoes
            {20,15,10,14,20},
            {12,12,14,8,19},
            {12,6,15,12,9},
            {14,12,14,15,16},
            {17,16,12,4,19}
    };

    private static int[][] pauta2 = {
            {20,15,10,14,20},
            {12,12,14,8,19},
            {12,6,15,12,9},
            {14,12,14,15,16},
            {17,16,12,40,19}
    };

    public static int[] criaArr(int size)
    {
        int[] a = new int[size];
        System.out.println("insira os numeros");
        for (int i=0; i < size ;i++)
        {
            // System.out.println("Number:" + i + ":");
            a[i] = sc.nextInt();
        }
        return a;
    }


    public static void print2D(int [][] mat)
    {
        for (int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

    public static void main (String[] args)
    {
        Ficha2_exerc f = new Ficha2_exerc();
        Exercicio1 e1 = new Exercicio1();
        Exercicio2 e2 = new Exercicio2();
        Exercicio5 e5 = new Exercicio5();
        exercicio6 e6 = new exercicio6();

        System.out.print("Escolha o exercicio (1 a 7)\n");
        int exercicio = sc.nextInt();

        switch(exercicio){
            case 1: {
                System.out.print("Escolha a alinea (1 a 3)");
                String alinea = sc.next();
                System.out.print("Diga o tamanho do array que vai criar");
                int size = sc.nextInt();
                int []a = criaArr(size);
                switch (alinea) {
                    case "A": {
                        System.out.println("The minimum is:" + e1.minimo(a));
                        break;
                    }
                    case "B": {
                        System.out.println("The minimum is:" + e1.minimo(a));
                        System.out.println("Escreva 2 indices:");
                        int indA = sc.nextInt();
                        int indB = sc.nextInt();
                        System.out.println(Arrays.toString(e1.truncada(a, indA, indB)));
                        break;
                    }
                    case "C": {
                        System.out.println("insira o tamanho do 2º array");
                        int sizeB = sc.nextInt();
                        int[] b = criaArr(sizeB);
                        System.out.println(Arrays.toString(e1.comuns(a, b)));
                    }
                }
                break;
            }
            case 2: {
                System.out.print("Escolha a alinea (A a )");
                String alineaMat = sc.next();
                switch (alineaMat) {
                    case "A" : {
                        System.out.println("escreva o numero do aluno (1 a 5");
                        int aluno = sc.nextInt();
                        System.out.println("escreva as 5 notas para adicionar a pauta");
                        int[]notas = criaArr(5);
                        e2.adicionanotas(pauta, notas,aluno);
                        print2D(pauta);
                        break;
                    }
                    case "B" : {
                        System.out.println("escreva o numero da disciplina (1 a 5");
                        int disciplina = sc.nextInt();
                        int nota = e2.soma(pauta,disciplina);
                        System.out.println(nota);
                        break;
                    }
                    case "C" : {
                        System.out.println("Insira o numero de aluno");
                        int aluno = sc.nextInt();
                        int media = e2.media(pauta,aluno);
                        System.out.println(media);
                        break;
                    }
                    case "D" : {
                        System.out.println("Insira o numero da UC (0 a 4)");
                        int UC = sc.nextInt();
                        int media = e2.mediaColunas(pauta,UC);
                        System.out.println(media);
                        break;
                    }
                    case "E" : {
                        int max = e2.max(pauta);
                        System.out.println(max);
                        break;
                    }
                    case "F" : {
                        int min = e2.min(pauta);
                        System.out.println(min);
                        break;
                    }
                    case "G" : {
                        System.out.println("insira um valor de 0 a 20");
                        int valor = sc.nextInt();
                        int [] result = e2.acima(pauta,valor);
                        System.out.println(Arrays.toString(result));
                    }
                    case "H" : {
                        String result = e2.matToString(pauta);
                        System.out.println(result);
                        break;
                    }
                    case "I" : {
                        int result = e2.mediaAlta(pauta);
                        System.out.println(result);
                    }
                }
                break;
            }
            case 4 : {
                System.out.println("insira o tamanho do array");
                int size = sc.nextInt();
                int [] arr = criaArr(size);
                System.out.println("insira a alinea A ou B");
                String alineaArr = sc.next();
                switch (alineaArr){
                    case "A" :{
                        System.out.println(Arrays.toString(f.sortB(arr)));
                    }
                    case "B" : {
                        System.out.println("indique o elemento a procurar");
                        int elem = sc.nextInt();
                        int index = f.binarySearch(arr,elem);
                        System.out.println("o indice em que esse elemento se encontra é: " + index);
                    }
                }
            }
            case 5:  {
                System.out.println("Defina o tamanho do array");
                int tamanho5 = sc.nextInt();
                String [] exerc5 = e5.criaArrString(tamanho5);
                System.out.println("o que pretende fazer? A a D");
                String alinea5 = sc.next();
                switch (alinea5){
                    case "A" : {
                        String [] result = e5.removeReps(exerc5);
                        System.out.println(Arrays.toString(result));
                        break;
                    }
                    case "B" : {
                        System.out.println(e5.maiorString(exerc5));
                        break;
                    }
                    case "C" : {

                    }
                    case "D" : {
                        System.out.println("Insira a palavra que quer procurar");
                        String palavra = sc.nextLine();
                        int result = e5.howMany(exerc5, palavra);
                        System.out.println("Aparece " + result + " vezes");
                        break;
                    }
                }
                break;
            }
            case 6 : {
                System.out.println("selecione a alinea: A a D");
                String alinea6 = sc.next();
                switch (alinea6) {
                    case "A" : {
                        System.out.println("insira as dimensoes da matriz");
                        int i = sc.nextInt();
                        int j = sc.nextInt();
                        int [][] mat6 = new int [i][j];
                        e6.criaMat(i,j,mat6);
                        print2D(mat6);
                    }
                    case "B" : {
                        int [][] result = e6.somaMat(pauta, pauta2);
                        print2D(result);
                        break;
                    }
                    case "C" : {
                        boolean result = e6.iguais(pauta,pauta2);
                        if (result == true) System.out.println("As matrizes são iguais");
                        else System.out.println("as matrizes sao diferentes");
                        break;
                    }
                    case "D" : {
                        int [][] result = e6.matOposta(pauta);
                        print2D(result);
                    }
                }
            }
            case 7 : {

            }
        }
    }
}
