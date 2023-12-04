package com.mycompany.aula1;
import java.util.Scanner;
import java.util.Stack;
public class App {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    String opcao;
    Pilha pilha = new Pilha();
    Fila fila = new Fila();
        String caminhoArquivo = "C:\\Users\\userbla\\Downloads\\Produto.txt";

        Stack<Registro> pilhaRegpro = new Stack<>();

    do {
    System.out.println("### MENU ###");
    System.out.println("1. Chamar Pilha");
    System.out.println("2. Chamar Fila ");
    System.out.println("3. Chamar Lista 3");
    System.out.println("0. Sair do programa");
    System.out.print("Escolha uma opção: ");
            
    opcao = scanner.nextLine();
 // Limpar o buffer

        switch (opcao) {
        case "1":
        System.out.println("Chamando Pilha...");
        pilha.nana();
        
        break;
        case "2":
        System.out.println("Chamando Classe 2...");
        // Chame aqui a Classe 2
        // Exemplo: Classe2.main();
        break;
        case "3":
        System.out.println("Chamando Classe 3...");
        // Chame aqui a Classe 3
        // Exemplo: Classe3.main();
        break;
        case "0":
        System.out.println("Encerrando o programa...");
        break;
        default:
        System.out.println("Opção inválida! Escolha novamente.");
        break;
        }
        } while (!"0".equals(opcao));

        scanner.close();
    }
}    
