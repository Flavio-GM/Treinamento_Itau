package Exercicios;
import java.util.Scanner;

public class exercicio02 {
    
    public static void main(String[] args) {

        // Variáveis
        Scanner teclado = new Scanner(System.in);
        double nota01, nota02, media;

        // Entrada de Dados
        System.out.println("\nDigite a primeira nota: \n");
        nota01 = teclado.nextDouble();

        System.out.println("\nDigite a segunda nota: \n");
        nota02 = teclado.nextDouble();
             
        // Processamento
        media = nota01 * 0.4 + nota02 * 0.6;

        // Saída de Dados
        System.out.println();
        
        if (media >= 6) {
            System.out.println("Aprovado" );

        } else {
            System.out.println("Reprovado");
        }
           
        System.out.println();
                
        teclado.close();
        

    }
  
}
