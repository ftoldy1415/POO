package com.company;

import java.util.Comparator;

public class ComparadorNrKms implements Comparator<Veiculo> {
    public int compare (Veiculo v1, Veiculo v2){
        if(v1.getKms() > v2.getKms()) return 1;
        if(v2.getKms() > v1.getKms()) return -1;
        return 0;
    }
}
