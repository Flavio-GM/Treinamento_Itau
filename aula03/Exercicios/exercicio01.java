package Exercicios;
import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {

        // Variáveis
        Scanner teclado = new Scanner(System.in);
        double numero;

        // Entrada de Dados
        System.out.println("\nDigite um número inteiro: \n");
        numero = teclado.nextDouble();

        if (numero > 20) {
            System.out.println(numero / 2 );
            
        }
                
        // Processamento
        

        // Saída de Dados
        System.out.println();
        System.out.println();
        
        teclado.close();
        

    }
  
}
