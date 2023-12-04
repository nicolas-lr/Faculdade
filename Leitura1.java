package com.mycompany.aula1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Alunos e suas respectivas matrículas:
- Ádrian Gabriel Santos Lopes - 01648052
- Jackson Lucas Mendonça Tenório De Almeida - 01656148
- Nicolas Guilherme de Lima Gomes - 01618798
- Radrígyla Cinthia Silva Fonseca do Nascimento - 01617017
 */

public class Leitura1 {
    public void leitura1() {

        // Armazena o caminho para o arquivo em um atributo
        String caminhoArquivo = "C:\\Users\\rasch\\IdeaProjects\\ProjetoED\\src\\Produto.txt";

        // Criando o ArrayList
        ArrayList<Registro> listaProdutos = new ArrayList<>();

        try {
            // File para representar o arquivo
            File arquivo = new File(caminhoArquivo); // "arquivo" recebe o caminho do arquivo

            // Leitor do arquivo
            Scanner leitor = new Scanner(arquivo); // "leitor" recebe o arquivo como parâmetro de entrada

            // Loop para ler cada linha do arquivo
            while (leitor.hasNextLine()){ // Enquanto houver a próxima linha entra no bloco
                String linha = leitor.nextLine(); // // "linha" recebe o conteúdo da linha atual do arquivo
                int id = Integer.parseInt(linha.substring(0, 2));
                String produto = linha.substring(3, 34);
                String valor = linha.substring(36, 41);
                double preco = Double.parseDouble(valor); // Converte a String valor em Double
                preco = preco / 100; // Deixar o valor em real
                int quantidade = Integer.parseInt(linha.substring(43, 45));
                int categoria = Integer.parseInt(linha.substring(46, 47));

                listaProdutos.add(new Registro(id, produto, preco, quantidade, categoria));
            }

            // Mostra cada produto e sua respectiva descrição
            for (Registro produto: listaProdutos) {
                    System.out.println("Id Produto: " + produto.getId());
                    System.out.println("Produto: " + produto.getProduto());
                    System.out.println("Preço: " + produto.getPreco());
                    System.out.println("Quantidade: " + produto.getQuantidade());
                    System.out.println("Categoria: " + produto.getCategoria() + "\n");
            }

            // Fecha o Scanner leitor
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro na busca do arquivo " + caminhoArquivo);
        }
    }
}
