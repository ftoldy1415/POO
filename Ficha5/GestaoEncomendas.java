package Teste;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class GestaoEncomendas {

    private Map<Integer,Encomenda> encomendas;




    //alinea i)

    public Set<Integer> todosCodigosEnc(){
        return new TreeSet<Integer>(this.encomendas.keySet());
    }


    //alinea ii)
    public void addEncomenda(Encomenda enc){
        //dont forget to always clone
        this.encomendas.put(enc.getNumeroEncomenda(),enc.clone());
    }


    //alinea iii)
    public Encomenda getEncomenda(Integer codEnc){
        return this.encomendas.get(codEnc).clone();
    }


    //alinea iv)
    public void removeEncomenda(Integer codEnc){
        this.encomendas.remove(codEnc);
    }

    //alinea v)
    /*
    public String encomendaComMaisProdutos(){
        
    }
     */


    public GestaoEncomendas(){
        //diferent possible implementations
        this.encomendas = new HashMap<>();
    }


    /*
    //metodo "imperativo"
    public GestaoEncomendas(Map<Integer, Encomenda> encs){
        this.encomendas = new HashMap<>();
        for(Encomenda e: encs) this.encomendas.put(e.getNumeroEncomenda(), e.clone());
    }
     */



    //metodo "funcional"
    public GestaoEncomendas(Map<Integer,Encomenda> encs){
        this.encomendas = encs.values().stream().collect(Collectors.toMap(e->e.getNumeroEncomenda(),e->e.clone()));
    }


    public GestaoEncomendas(GestaoEncomendas ge){
        this.encomendas = ge.getEncomendas();
    }


    public Map<Integer,Encomenda> getEncomendas(){
        return this.encomendas.values().stream().collect(Collectors.toMap(e->e.getNumeroEncomenda(),e->e.clone()));
    }

    //Alternativa

    /*
    public Map<Integer, Encomenda> getEncomendas() {
        Map<Integer, Encomenda> res = new HashMap<>();
        for(Map.Entry<Integer, Encomenda> e : encomendas.entrySet())
                res.put(e.getKey(), e.getValue().clone());

        return res;
    }
     */


    public void setEncomendas(Map<Integer, Encomenda> encomendas) {
        this.encomendas = encomendas;
    }
}
