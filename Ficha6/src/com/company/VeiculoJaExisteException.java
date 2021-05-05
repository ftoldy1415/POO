package com.company;

public class VeiculoJaExisteException extends Exception{

    public VeiculoJaExisteException(){
        super();
    }
    //error -> mensagem de erro
    public VeiculoJaExisteException(String error){
        super(error);
    }

}
