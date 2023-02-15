import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        double nota01, nota02, media;
        
        // Entrada de Dados
        System.out.println("\nDigite o seu nome: \n");
        nome = entrada.nextLine();
        System.out.println("\nOlá " + nome + ", vamos ver sua média?\n");
        
        System.out.println("\nDigite a primeira nota: \n");
        nota01 = entrada.nextDouble();

        System.out.println("\nDigite a segunda nota: \n");
        nota02 = entrada.nextDouble();

        // Processamento
        media = ((nota01 + nota02)) / 2;
        System.out.println();

        // Saída de Dados
        System.out.println("Sua Média = " + media);
        System.out.println();
        
        entrada.close();
        

    }
  
}
