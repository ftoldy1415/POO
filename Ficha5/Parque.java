package Teste;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Parque {

    private String nomeParque;
    private Map<String,Lugar> lugares;


    //alinea 2
    /*
    Método que regista uma nova ocupação de lugar;
     */
    public void addLugar (Lugar p){
        this.lugares.put(p.getMatricula(),p.clone());
    }

    //alinea 3
    /*
    Método que remove o lugar de dada matricula;
     */
    public void removeLugar(String matricula){
        this.lugares.remove(matricula);
    }


    //alinea 4
    /*
    Método que altera o tempo disponível de um lugar, para uma dada matricula
     */
    public void alteraTempo(String matricula, int minutos){
        Lugar l = this.lugares.get(matricula);
        l.setMinutos(minutos);
        this.lugares.replace(matricula,l);
    }


    //alinea 5
    /*
    Método que devolve a quantidade total de minutos atribuídos
    */
    public int minutosTotais(){
        return this.lugares.values().stream().mapToInt(Lugar::getMinutos).sum();
    }


    //alinea 6
    /*
    Método que verifica existe lugar atribuído a uma dada matrícula
     */
    public boolean exists(String mat){
        return this.lugares.containsKey(mat);
    }

    //alinea 7
    /*
    Método que cria uma lista com as matriculas com tempo atribuído > x, em que o lugar seja permanente;
     */
    public Map<String,Lugar> filterTempo (int x){
        Map<String,Lugar> filtrado =  this.lugares.values().stream().filter(l-> l.getMinutos() > x).collect(Collectors.toMap(l->l.getMatricula(),l-> l.clone()));
        return filtrado;
    }


    //Alinea 8
    /*
    Método que devolve uma cópia dos lugares
    */
    public Map<String,Lugar> getLugares(){
        return this.lugares.values().stream().collect(Collectors.toMap(l->l.getMatricula(),l->l.clone()));
    }


    //Alinea 9
    /*
    Método que devolve a informação de um lugar para uma dada matricula
     */
    public Lugar devolveLugar (String mat){
        return this.lugares.get(mat);
    }


    //CONSTRUTORES
    public Parque (Map<String,Lugar> lugares, String nome){
        this.nomeParque = nome;
        this.lugares = lugares.values().stream().collect(Collectors.toMap(l->l.getMatricula(), l->l.clone()));
    }

    public Parque (Parque p){
        this.nomeParque = p.nomeParque;
        this.lugares = p.lugares.values().stream().collect(Collectors.toMap(l->l.getMatricula(), l->l.clone()));
    }


    public Parque clone (Parque p){
        return new Parque(p);
    }

}
