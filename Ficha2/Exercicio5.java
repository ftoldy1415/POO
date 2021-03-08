package Teste;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio5 {

    public static Scanner exerc = new Scanner(System.in);
    public static String [] criaArrString (int tamanho5){
        System.out.println("insira as Strings");
        String [] stringArr = new String[tamanho5];
        for (int i=0; i < tamanho5 ;i++)
        {
            // System.out.println("Number:" + i + ":");
            stringArr[i] = exerc.nextLine();
        }
        return stringArr;
    }

    public static String[] removeReps (String [] x){
        return Arrays.stream(x).distinct().toArray(String[]::new);
    }

    public static String maiorString (String [] x ){
        String maior = x[0];
        int baseline = x[0].length();
        for (int i = 1; i < x.length ; i++){
            if ( x[i].length() > baseline){
                baseline = x[i].length();
                maior = x[i];
            }
        }
        return maior;
    }

    public static int howMany (String [] x, String exemplo){
        int count = 0;
        for (int i = 0; i<x.length ; i++){
            if (x[i] == exemplo) count++;
        }
        return count;
    }
}
