package com.mycompany.aula1;
import java.util.ArrayList;

public class Armazenar {
    public void armazenar() {

        // Criando o ArrayList listaProdutos
        ArrayList<Registro> listaProdutos = new ArrayList<>();

        // Armazenando novos produtos à ArrayList
        listaProdutos.add(new Registro("BRK","Eduardo DuUu", "Brasil"));
        listaProdutos.add(new Registro("JJL", "Nciolas","Kiribati"));
        listaProdutos.add(new Registro("NAPX", "Idrian","Italia"));

        // Acessando os itens da lista de produtos
       for (Registro cliente: listaProdutos) {
                    System.out.println("Codigo do Cliente: " + cliente.getCod());
                    System.out.println("Cliente: " + cliente.getCliente());
                    System.out.println("País: " + cliente.getNacao());
            }
    }
}
