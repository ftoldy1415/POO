package Teste;

public class LinhaEncomenda {
    private String referencia;
    private String descricao;
    private double preco;
    private int quantidade;
    private int impostos;
    private int desconto;

    public LinhaEncomenda(){
        this.referencia = "0123124";
        this.descricao  = "Produto base aleatório";
        this.preco = 124.56;
        this.quantidade = 10;
        this.desconto = 10;
        this.impostos = 23;
    }

    public LinhaEncomenda(String referencia, String descricao, double preco, int quantidade, int impostos, int desconto) {
        this.referencia = referencia;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.impostos = impostos;
        this.desconto = desconto;
    }

    public LinhaEncomenda(LinhaEncomenda le){
        this.referencia = le.referencia;
        this.descricao = le.descricao;
        this.preco = le.preco;
        this.quantidade = le.quantidade;
        this.impostos = le.impostos;
        this.desconto = le.desconto;

    }

    public double calculaValorLinhaEnc(){
        double precoDescontado= (getQuantidade() * getPreco()) * (1-(getDesconto() / 100.0));
        double resultado = precoDescontado * (1 + getImpostos()/100.0);
        return resultado;

    }

    public double calculaValorDesconto(){
        return ((getQuantidade() * getPreco()) * (getDesconto() / 100.0)) ;
    }


    //TO STRING
    public String toString(){
        String result = "Referencia do produto: " + getReferencia() + "\n" +
                "Descriçao do produto: " + getDescricao() + "\n" +
                "Preço do produto individual: " + getPreco() +"\n" +
                "Quantidade encomendada: " + getQuantidade() +"\n" +
                "Taxa de impostos: " + getImpostos() + "\n" +
                "Desconto: " + getDesconto() +"\n" ;
        return result;
    }

    //CLONE
    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);
    }

    //GETTERS

    public String getReferencia() {
        return referencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getImpostos() {
        return impostos;
    }

    public int getDesconto() {
        return desconto;
    }

    //SETTERS
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setImpostos(int impostos) {
        this.impostos = impostos;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }


}
