package Teste;

import java.util.Arrays;

public class Exercicio2 {
    public int [][] adicionanotas(int[][] pauta, int[]notas,int aluno)
    {
        pauta[aluno] = notas;
        return (pauta);
    }

    public int media (int [][] mat, int aluno)
    {
        int soma = 0;
        int size = mat[aluno].length;
        for (int j = 0; j < size; j++)
        {
            soma += mat[aluno][j];
        }
        return (soma/size);
    }

    public int mediaColunas (int [][] mat, int UC)
    {
        int soma = 0;
        int size = mat[UC].length;
        for (int j = 0; j < size; j++)
        {
            soma += mat[j][UC];
        }
        return (soma/size);
    }

    public int soma (int [][] mat, int disciplina)
    {
        int soma = 0;
        int size = mat.length;
        for (int j = 0; j < size; j++)
        {
            soma += mat[j][disciplina];
        }
        return soma;
    }

    public int max (int [][] pauta)
    {
        int max = pauta[0][0];
        int[] arr = pauta[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 1; i< arr.length;i++){
            int [] teste = pauta[i];
            for (int k : teste) {
                if (k > max) max = k;
            }
        }
        return max;
    }

    public int min (int [][] pauta)
    {
        int min = pauta[0][0];
        int[] arr = pauta[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }
        for (int i = 1; i< arr.length;i++){
            int [] teste = pauta[i];
            for (int k : teste) {
                if (k < min) min = k;
            }
        }
        return min;
    }

    public int [] acima (int [][] pauta, int valor)
    {
        int count = 0;
        for (int[] ints : pauta) {
            for (int j = 0; j < pauta.length; j++) {
                if (ints[j] > valor) count++;
            }
        }
        int [] result = new int [count];
        int index = 0;
        for (int[] ints : pauta) {
            for (int j = 0; j < pauta.length; j++) {
                if (ints[j] > valor) {
                    result[index] = ints[j];
                    index++;
                }
            }
        }
        return result;
    }

    public int mediaAlta (int [][] pauta)
    {
        int index = 0;
        int baseline = mediaColunas(pauta,0);
        for (int i = 1; i<pauta.length; i++){
            if ( baseline < mediaColunas(pauta,i)){
                baseline = mediaColunas(pauta,i);
                index = i;
            }
        }
        return index;
    }

    public String matToString(int [][] pauta){
        String result = "";
        for ( int i = 0 ; i< pauta.length; i++){
            result = result + Arrays.toString(pauta[i]) + "\n";
        }
        return result;
    }

}
