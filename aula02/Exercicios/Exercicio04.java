package Exercicios;
import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {

        // Variáveis
        Scanner entrada = new Scanner(System.in);
        String nome;
        double salMin, valorKw;
        double valorPagar, valorComDesconto;
        int qtdeKw;

        // Entrada de Dados
        System.out.println("\nDigite o seu nome: \n");
        nome = entrada.nextLine();
        System.out.println("\nOlá " + nome + ", vamos ver sua média?\n");
        
        System.out.println("\nDigite a primeira nota: \n");
        nota01 = entrada.nextDouble();

        // Processamento
        media = ((nota01 + nota02)) / 2;
        System.out.println();

        System.out.println("\nDigite a segunda nota: \n");
        nota02 = entrada.nextDouble();

        System.out.println("\nDigite a segunda nota: \n");
        nota02 = entrada.nextDouble();


        // Saída de Dados
        System.out.println("Sua Média = " + media);
        System.out.println();
        
        entrada.close();
        

    }
  
}
