package Teste;

import java.util.Arrays;

public class Ficha2_exerc {





    /*
    public int[] sortA (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    */

    public int[] sortB (int [] arr)
    {
        Arrays.sort(arr);
        return arr;
    }

    public int binarySearch(int [] arr, int x)
    {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length -1 ;
        while (start <= end){
            int mediana = start + (end - start) /2;

            if (arr[mediana] == x) return mediana;
            if (arr[mediana] < x) start = mediana+1;
            if (arr[mediana] > x) end = mediana - 1;
        }
        return -1; // se chegarmos aqui significa que o elemento nao existe
    }

    /*
    public String [] arrStrings (){

    }
     */

}
