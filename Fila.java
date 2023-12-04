package com.mycompany.aula1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
      public void Fila() {

          /*Adrian Gabriel Santos Lopes - 01648052
          Jackson Lucas Mendonça Tenório De Almeida - 01656148
          Nicolas Guilherme de Lima Gomes - 01618798
          Radrígyla Cinthia Silva Fonseca do Nascimento - 01617017
          */

        // Caminho para o arquivo
        String caminhoArquivo = "C:\\Users\\userbla\\Downloads\\Produto.txt";

        Queue<Registro>  filaRegpro = new LinkedList<>();
        
        try {
            // File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Leitor do arquivo
            Scanner leitor = new Scanner(arquivo);
            // Loop para ler cada linha do arquivo

            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                int id = Integer.parseInt(linha.substring(0, 2));
                String produto = linha.substring(3, 34);
                String valor = linha.substring(36, 41);
                double preco = Double.parseDouble(valor); // Converte a String valor em Double
                preco = preco / 100; // Deixar o valor em real
                int quantidade = Integer.parseInt(linha.substring(43, 45));
                int categoria = Integer.parseInt(linha.substring(46, 47));

                filaRegpro.add(new Registro(id, produto, preco, quantidade, categoria));
            }
              for (Registro prod : filaRegpro) {
                    System.out.println("Id Produto: " + prod.getId());
                    System.out.println("Produto: " + prod.getProduto());
                    System.out.println("Preço: " + prod.getPreco());
                    System.out.println("Quantidade: " + prod.getQuantidade());
                    System.out.println("Categoria: " + prod.getCategoria() + "\n");
                    
                }

                for (int i = 1; i < 6; i++) {
                    filaRegpro.remove();
                }
         System.out.println("---------------------------------------------------------------------------------\n");
         System.out.println("Depois de remover os elementos:\n");

        for (Registro prod : filaRegpro) {
                    System.out.println("Id Produto: " + prod.getId());
                    System.out.println("Produto: " + prod.getProduto());
                    System.out.println("Preço: " + prod.getPreco());
                    System.out.println("Quantidade: " + prod.getQuantidade());
                    System.out.println("Categoria: " + prod.getCategoria() + "\n"); 
                }

            // Fecha o Scanner leitor
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro na busca do arquivo" + caminhoArquivo);
        }
    }
    
}

