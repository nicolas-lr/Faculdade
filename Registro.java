package com.mycompany.aula1;

public class Registro {
    //Atributos
    private String cod;
    private String cliente;
    private String nacao;

    Registro(String cod, String cliente, String nacao) {
        this.cod = cod;
        this.cliente = cliente;
        this.nacao = nacao;
    }

    void setCod(String Cod) {
        this.cod = Cod;
    }
    String getCod() {
        return cod;
    }

    void setCliente(String cliente) {
        this.cliente = cliente;
    }
    String getCliente() {
        return cliente;
    }

    void setNacao(String nacao) {
        this.nacao = nacao;
    }
    String getNacao() {
        return nacao;
    }
}

