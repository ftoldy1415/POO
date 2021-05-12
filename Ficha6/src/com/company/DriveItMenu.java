package com.company;

import java.util.Arrays;

public class DriveItMenu {
    public static void main (String [] args){
        String[] s = {"Add Car", "How many Kms", "Cars per Km", "Car List"};
        String[] s2 = {"B.1", "B.2"};
        DriveIt newCity = new DriveIt();

        //adiconar os veiculos ao drive it com um try e no catch chamar a excepçao de veículo ja existente

        Menu m = new Menu(s);
        Menu m2 = new Menu(s2);
        m.executa();
        int op = m.getOpcao();

        System.out.println("Option read : " + op);

        switch (op) {
            case 1:
                System.out.println("I'm adding a car");
                break;
            case 2:
                System.out.println("How many kms ...");
                m2.executa();
                break;

            case 3:
                System.out.println("Cars per km ...");
                break;
            case 4:
                System.out.println("Showing Car List");
                break;
            default:
                System.out.println("Option??");
        }
    }
}
