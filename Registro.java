package com.mycompany.aula1;

public class Registro {
    //Atributos
    private int id;
    private String produto;
    private double preco;
    private int quantidade;
    private int categoria;

    Registro(int id, String produto, double preco, int quantidade, int categoria) {
        this.id = id;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    void setId(int id) {
        this.id = id;
    }
    int getId() {
        return id;
    }

    void setProduto(String produto) {
        this.produto = produto;
    }
    String getProduto() {
        return produto;
    }

    void setPreco(double preco) {
        this.preco = preco;
    }
    double getPreco() {
        return preco;
    }

    void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    int getQuantidade() {
        return quantidade;
    }

    void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    int getCategoria() {
        return categoria;
    }
}

