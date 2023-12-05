package com.mycompany.aula1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
      public static void main(String[] args) {

          /*Adrian Gabriel Santos Lopes - 01648052
          Jackson Lucas Mendonça Tenório De Almeida - 01656148
          Nicolas Guilherme de Lima Gomes - 01618798
          Radrígyla Cinthia Silva Fonseca do Nascimento - 01617017
          */

        // Caminho para o arquivo
        String caminhoArquivo = "C:\\Users\\Nicolas\\Downloads\\Clientes2.txt";

        Queue<Registro>  filaRegpro = new LinkedList<>();
        
        try {
            // File para representar o arquivo
            File arquivo = new File(caminhoArquivo);
            // Leitor do arquivo
            Scanner leitor = new Scanner(arquivo);
            
            // Loop para ler cada linha do arquivo
        while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] parte = linha.split(";");
                
        //if para identificar erros na separação por split
        if (parte.length >= 3) {
                String cod = parte[0];
                String cliente = parte[1];
                String nacao = parte[2];

            filaRegpro.add(new Registro(cod, cliente, nacao));
        }
           
        else {
                System.out.println("Linha do arquivo que não é uma informação sobre os clientes: " + linha);
        }
        }
        for (Registro prod : filaRegpro) {
                    System.out.println("Codigo do Cliente: " + prod.getCod());
                    System.out.println("Cliente: " + prod.getCliente());
                    System.out.println("País: " + prod.getNacao());
                    
                }

        for (int i = 1; i < 6; i++) {
                    filaRegpro.remove();
                }
         System.out.println("---------------------------------------------------------------------------------\n");
         System.out.println("Depois de remover os elementos:\n");

        for (Registro prod : filaRegpro) {
                    System.out.println("Codigo do Cliente: " + prod.getCod());
                    System.out.println("Cliente: " + prod.getCliente());
                    System.out.println("País: " + prod.getNacao()); 
                }

            // Fecha o Scanner leitor
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro na busca do arquivo" + caminhoArquivo);
        }
    }
    
}

