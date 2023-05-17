package model;

import java.util.Objects;

public class Produto {
    private int idProduto;
    private String descricao;
    private double preco;
    private int quantidadeAtual;

    public Produto(){

    }
    public Produto(int idProduto, String descricao, double preco) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return idProduto == produto.idProduto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduto);
    }

    public void registrarEntrada(int qtd){
        this.quantidadeAtual+= qtd;
    }
    public void registrarSaida(int qtd){
        if(qtd > this.quantidadeAtual){
            throw new IllegalArgumentException(
                    "Sem quantidade disponível"
            );
        }
        this.quantidadeAtual -= qtd;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto=" + idProduto +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidadeAtual=" + quantidadeAtual +
                '}';
    }
}
