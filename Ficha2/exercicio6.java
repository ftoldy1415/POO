package Teste;

import java.util.Scanner;

public class exercicio6 {
    public static Scanner sc = new Scanner(System.in);

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

    void  criaMat(int i, int j, int [][]a){
        for ( int x = 0; x<=j ; x++){
            a[x] = criaArr(j);
        }
    }

    public int[][] somaMat (int [][] a, int [][] b){
        int [][] c = new int [a.length] [a[1].length];
        int i = 0;
        int j = 0;
        for (;i < a.length;i++){
            for (; j < a[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
            j = 0;
        }
        return c;
    }

    public boolean iguais (int [][]a , int [][] b){
        boolean x = true;
        int i = 0;
        for (;i < a.length;i++){
            for (int j = 0; j < a[i].length; j++){
                if ( a[i][j] != b[i][j]) x = false;
            }
        }
        return x;
    }

    public int [][] matOposta ( int [][]a){
        int [][] c = new int [a.length] [a[0].length];
        for (int i = 0; i< c.length ; i++){
            for (int j = 0; j< c[i].length;j++){
                c[i][j] = 0 - a[i][j];
            }
        }
        return c;
    }
}
