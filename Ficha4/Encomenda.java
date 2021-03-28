package Teste;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Encomenda {

    private String nomeClient;
    private String NIF;
    private String morada;
    private String numeroEncomenda;
    private LocalDate datadeEncomenda;
    private ArrayList<LinhaEncomenda> linhaEncomendas;



    //B)
    //Percorre o ArrayList linhaEncomendas e vai somando o valor de cada encomenda na linha
    public double calculaValorTotal(){
        double resultado = 0;
        Iterator<LinhaEncomenda> le = this.linhaEncomendas.iterator();
        LinhaEncomenda a;

        while(le.hasNext()){
            a=le.next();
            resultado += a.calculaValorLinhaEnc();
        }
        return resultado;
    }



    //C)
    public double calculaValorDesconto(){
        double resultado = 0;
        Iterator<LinhaEncomenda> le = this.linhaEncomendas.iterator();
        LinhaEncomenda a;

        while(le.hasNext()){
            a=le.next();
            double desconto = a.calculaValorDescontoEncomenda();
            resultado += desconto;
        }
        return resultado;
    }

    //D)

    //Calcula o numero total de produtos
    public int numeroTotalProdutos(){

        int resultado = 0;
        Iterator<LinhaEncomenda> le = this.linhaEncomendas.iterator();
        LinhaEncomenda a;

        while(le.hasNext()){
            a=le.next();
            resultado += a.getQuantidade();
        }
        return resultado;

    }

    //E)

    //Percorre o ArrayList linhaEncomendas
    public boolean existeProdutoEncomenda(String refProduto){
        /*
        boolean resultado = false;
        Iterator<LinhaEncomenda> le = this.linhaEncomendas.iterator();
        LinhaEncomenda a;

        while(le.hasNext() && !resultado){
            a=le.next();
            if(a.getReferencia().equals(refProduto)) resultado = true;
        }
        return resultado;

         */

        return this.linhaEncomendas.stream().anyMatch(le->le.getReferencia().equals(refProduto));
    }

    //F)

    //Adiciona uma encomenda ao arraylist linhaEncomendas
    public void adicionaLinha(LinhaEncomenda linha){
        this.linhaEncomendas.add(linha.clone());
    }




    //G)

    //Remove uma encomenda do arraylist
    public void removeProduto(String codProd){
        /*
        Iterator<LinhaEncomenda> le = this.linhaEncomendas.iterator();
        LinhaEncomenda a;

        while(le.hasNext()){
            a=le.next();
            if(a.getReferencia().equals(codProd)) le.remove();
        }

         */
        this.linhaEncomendas.removeIf(le -> le.getReferencia().equals(codProd));
    }





    //CONSTRUTORES

    //construtor default
    public Encomenda(){
        LinhaEncomenda l1 = new LinhaEncomenda();
        this.nomeClient = "José";
        this.NIF = "123456789";
        this.morada= "Braga";
        this.numeroEncomenda = "987654321";
        this.datadeEncomenda = LocalDate.of(2021, 3, 16);
        this.linhaEncomendas = new ArrayList<>();
        this.linhaEncomendas.add(l1.clone());
    }

    public Encomenda(String nomeClient, String NIF, String morada, String numeroEncomenda, LocalDate datadeEncomenda, ArrayList<LinhaEncomenda> linhaEncomendas) {
        this.nomeClient = nomeClient;
        this.NIF = NIF;
        this.morada = morada;
        this.numeroEncomenda = numeroEncomenda;
        this.datadeEncomenda = datadeEncomenda;
        this.linhaEncomendas = new ArrayList<>(linhaEncomendas.size() + 1);
        for (LinhaEncomenda encomenda : linhaEncomendas){
            this.linhaEncomendas.add(encomenda.clone());
        }
    }

    public Encomenda (Encomenda e){
        this.nomeClient = e.getNomeClient();
        this.NIF = e.getNIF();
        this.morada = e.getMorada();
        this.numeroEncomenda = e.getNumeroEncomenda();
        this.datadeEncomenda = e.getDatadeEncomenda();
        this.linhaEncomendas = new ArrayList<>(e.linhaEncomendas.size());
        for (LinhaEncomenda encomenda : e.linhaEncomendas) this.linhaEncomendas.add(encomenda.clone());
    }

    //TO STRING


    public String toString() {
        return "Encomenda{" +
                "nomeClient='" + nomeClient + '\'' +
                ", NIF='" + NIF + '\'' +
                ", morada='" + morada + '\'' +
                ", numeroEncomenda='" + numeroEncomenda + '\'' +
                ", datadeEncomenda=" + datadeEncomenda +
                ", linhaEncomendas=" + this.linhaEncomendas.toString() +
                '}';
    }


    //CLONE

    public Encomenda clone(){
        return new Encomenda(this);
    }

    //GETTERS
    public String getNomeClient() {
        return nomeClient;
    }

    public String getNIF() {
        return NIF;
    }

    public String getMorada() {
        return morada;
    }

    public String getNumeroEncomenda() {
        return numeroEncomenda;
    }

    public LocalDate getDatadeEncomenda() {
        return datadeEncomenda;
    }

    public ArrayList<LinhaEncomenda> getLinhaEncomendas() {
        return linhaEncomendas;
    }


    //SETTERS
    public void setNomeClient(String nomeClient) {
        this.nomeClient = nomeClient;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNumeroEncomenda(String numeroEncomenda) {
        this.numeroEncomenda = numeroEncomenda;
    }

    public void setDatadeEncomenda(LocalDate datadeEncomenda) {
        this.datadeEncomenda = datadeEncomenda;
    }

    public void setLinhaEncomendas(ArrayList<LinhaEncomenda> linhaEncomendas) {
        this.linhaEncomendas = linhaEncomendas;
    }
}
