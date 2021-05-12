package com.company;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class DriveIt implements Serializable { //se implementamos serializable aqui tambem temos que implementar em veiculo

    private String nome;
    private Map <String,Veiculo> veiculos;
    private boolean promoçao;



    //1

    //1a)
    public boolean existeVeiculo(String cod){
        return this.veiculos.containsKey(cod);
    }

    //1b)
    public int quantos(){
        return (int) this.veiculos.values()
                                .stream()
                                .count();

    }


    //1c)
    public int quantos(String cod){
        return (int) this.veiculos.values()
                .stream().filter(e -> e.getMarca().equals(cod)).count();
    }


    //1d
    public Veiculo getVeiculo(String cod){
        return this.veiculos.get(cod);
    }


    //1e)
    public void adiciona(Veiculo v){
        this.veiculos.put(v.getMatricula(),v.clone());
    }

    //f)
    public List<Veiculo> getVeiculos(){
        return this.veiculos.values().stream().collect(Collectors.toList());
    }



    //EXERCICIO 2 ORDENAÇOES
    /*
    public Set<Veiculo> ordenaVeiculos(){   //ao colocar num set fica ordenado automaticamente
        Set<Veiculo> aux = new TreeSet<>();
        for (Veiculo v : this.veiculos.values()) aux.add(v.clone());
        return aux;
    }
     */

    public List<Veiculo> ordenaVeiculos(){
        return this.veiculos.values()
                            .stream()
                            .sorted()
                            .map(v-> v.clone())
                            .collect(Collectors.toList());
    }

    public Set<Veiculo> ordenaVeiculos (Comparator<Veiculo> c){
        Set<Veiculo> aux = new TreeSet<>(new ComparadorNrKms());
        for( Veiculo v : this.veiculos.values()) aux.add(v.clone());
        return aux;
    }

    public Set<Veiculo> ordenaVeiculosIt(Comparator<Veiculo> c){
        Set<Veiculo> aux = new TreeSet<>(new ComparadorNrKms());
        Iterator<Veiculo> it = this.veiculos.values().iterator();
        while(it.hasNext()){
            aux.add(it.next().clone());
        }
        return aux;
    }

    private static Map<String,Comparator<Veiculo>> ord = new TreeMap<>();

    public void adicionaComparador(String n, Comparator<Veiculo> cv){
        ord.put(n,cv);
    }

    public Iterator<Veiculo> ordenarVeiculo(String criterio){
        Set<Veiculo> vs = new TreeSet<>(ord.get(criterio));
        for(Veiculo v : this.veiculos.values()) vs.add(v.clone());
        return vs.iterator();
    }

    public Map<String,List<Veiculo>> ordenadoPorMarca(){
        return this.veiculos.values().stream()
                                    .map(v->v.clone())
                                    .collect(Collectors.groupingBy(Veiculo::getMarca)); //o groupingBy é usado
    }


    //Exercicio 3

    public List<BonificaKms> daoPontos(){
        List<BonificaKms> l = new ArrayList<>();
        for (Veiculo v : this.veiculos.values()){
            if( v instanceof VeiculoPremium){
                BonificaKms bk = (BonificaKms) v;
                l.add(bk);
            }
        }
        return l;
    }



    //VERSAO DO ADICIONA COM EXCEPTIONS

    public void adicionaE(Veiculo v) throws VeiculoJaExisteException{
        if (this.veiculos.containsKey(v.getMatricula())){
            throw new VeiculoJaExisteException();
        }
        else this.veiculos.put(v.getMatricula(),v.clone());
    }



    //guardar em texto
    public void saveTextual (String filename) throws IOException {
        PrintWriter p = new PrintWriter(filename);
        p.print(this);
        p.flush();
        p.close();
    }

    //guardar em binário
    public void saveBinary (String f) throws IOException{
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
        o.writeObject(this);
        o.flush();
        o.close();
    }

    //CLassNotFoundException means in the binary code the class read is not driveIt
    //f é o filename
    public DriveIt readObject (String f) throws IOException, ClassNotFoundException{
        ObjectInputStream i = new ObjectInputStream(new FileInputStream(f));
        DriveIt d = (DriveIt) i.readObject();
        i.close();
        return d;
    }



    //passa o map veiculos para uma string
    public String veiculosString (Map <String,Veiculo> m){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String,Veiculo> a : m.entrySet()){
            sb.append("Nome : ");
            sb.append(a.getKey());
            sb.append("Veiculo : ");
            sb.append(a.getValue().toString());
            sb.append(",");
        }
        return sb.toString();
    }


    @Override
    public String toString() {
        return "DriveIt{" +
                "nome='" + nome +
                ", veiculos=" + veiculosString(veiculos)+
                ", promoçao=" + promoçao +
                '}';
    }


    //converte os veiculos para um array de strings
    public String[] getVeiculosString(){
        List<Veiculo> v = this.getVeiculos();
        String[] ss = new String[v.size()];
        for ( int i = 0; i<v.size() ;i++) ss[i] = v.get(i).toString();
        return ss;
    }

}
