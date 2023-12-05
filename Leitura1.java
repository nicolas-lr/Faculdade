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
    public static void main(String[] args) {

        // Armazena o caminho para o arquivo em um atributo
        String caminhoArquivo = "C:\\Users\\Nicolas\\Downloads\\Clientes2.txt";

        // Criando o ArrayList
        ArrayList<Registro> listaProdutos = new ArrayList<>();

        try {
            // File para representar o arquivo
            File arquivo = new File(caminhoArquivo); // "arquivo" recebe o caminho do arquivo

            // Leitor do arquivo
            Scanner leitor = new Scanner(arquivo); // "leitor" recebe o arquivo como parâmetro de entrada

            // Loop para ler cada linha do arquivo
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                String[] parte = linha.split(";");
                
        //if para identificar erros na separação por split
        if (parte.length >= 3) {
                String cod = parte[0];
                String cliente = parte[1];
                String nacao = parte[2];

            listaProdutos.add(new Registro(cod, cliente, nacao));
        }
            }

            // Mostra cada cliente e seus respectivos dados
            for (Registro cliente: listaProdutos) {
                    System.out.println("Codigo do Cliente: " + cliente.getCod());
                    System.out.println("Cliente: " + cliente.getCliente());
                    System.out.println("País: " + cliente.getNacao());
            }

            // Fecha o Scanner leitor
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro na busca do arquivo " + caminhoArquivo);
        }
    }
}
