package aula10.exemplos.Exemplo09;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo09 {
    public static void main(String[] args) throws IOException{
        File file = new File("aula10/exemplos/exemplo09/arquivo.txt");

        // Direciona o Scanner para ler o File (arquivo)
        Scanner scanner = new Scanner(file);

        // Enquanto existe mais conteúdo para ler... 
        while (scanner.hasNext()) { // hasNext = tem Próximo
            String linha = scanner.nextLine();
            System.out.println(linha);            
        }

        scanner.close();
    }
}
