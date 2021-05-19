package com.company;

public interface BonificaKms {
    //sendo BonificaKms uma interface, todas as classes que a implementarem terao
    // de implementar OBRIGATORIAMENTE este metodos
    void definePontosPorKm(int pts);
    int getPontosPorKm();
    int getPontosTotal();
}
