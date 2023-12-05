package Atv4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args){


        String caminhoArquivo = "C:\\Users\\Adrian4536\\Downloads\\Clientes2.txt";

        Stack<Registro> pilha = new Stack<>();
        
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
                String Id = parte[0];
                String Cliente = parte[1];
                String Nacionalidade = parte[2];

            pilha.push(new Registro(Id, Cliente, Nacionalidade));
        }
           
        else {
                System.out.println("Linha do arquivo que não é uma informação sobre os clientes: " + linha);
        }
        }
        for (Registro prod : pilha) {
                    System.out.println("Codigo do Cliente: " + prod.getId());
                    System.out.println("Cliente: " + prod.getCliente());
                    System.out.println("País: " + prod.getNacionalidade());
                    
                }

t.println("---------------------------------------------------------------------------------\n");
         System.out.println("Depois de remover os elementos:\n");

        for (Registro prod : pilha) {
                    System.out.println("Codigo do Cliente: " + prod.getId());
                    System.out.println("Cliente: " + prod.getCliente());
                    System.out.println("País: " + prod.getNacionalidade()); 
                }

            // Fecha o Scanner leitor
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro na busca do arquivo" + caminhoArquivo);
        }
    }
    
}
