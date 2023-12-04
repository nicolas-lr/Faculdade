package com.mycompany.aula1;
import java.util.ArrayList;

public class Armazenar {
    public void armazenar() {

        // Criando o ArrayList listaProdutos
        ArrayList<Registro> listaProdutos = new ArrayList<>();

        // Armazenando novos produtos à ArrayList
        listaProdutos.add(new Registro(1,"Suco de Uva", 25.00, 50, 1));
        listaProdutos.add(new Registro(2, "Bolo de Chocolate", 15.00, 15, 4));
        listaProdutos.add(new Registro(2, "Queijo Minas", 20.00, 78, 8));

        // Acessando os itens da lista de produtos
        for (Registro produto: listaProdutos) {
            System.out.println("Id Produto: " + produto.getId());
            System.out.println("Produto: " + produto.getProduto());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getCategoria() + "\n");
        }
    }
}
