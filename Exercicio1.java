package Teste;

public class Exercicio1 {

    public int minimo(int[] a)
    {
        int min = a[0];
        for (int j : a) {
            if (j < min) min = j;
        }
        return min;
    }

    public int[] truncada(int[] a, int indA, int indB)
    {
        int tamanho = indB - indA+1;
        int[] r = new int[tamanho];
        System.arraycopy(a,indA,r,0,tamanho);
        return r;
    }

    public int[] comuns(int[] a, int[] b)
    {
        int contaComuns = 0;
        int tamanho;
        int j;
        tamanho = Math.min(a.length, b.length);
        int[] result = new int[tamanho];
        for (int k : a) {
            for (j = 0; j < b.length && (k != b[j]); j++) ;
            if (j < b.length && k == b[j]) {
                result[contaComuns] = k;
                contaComuns++;
            }
        }
        if (contaComuns < tamanho) {
            return truncada(result, 0, contaComuns - 1);
        }
        else return result;

    }

}
