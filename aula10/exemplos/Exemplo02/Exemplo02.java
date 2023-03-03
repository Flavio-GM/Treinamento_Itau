package aula10.exemplos.Exemplo02;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        boolean entradaInvalida = true;

        // Enquanto a entrada for inválida, continue pedindo a digitação.
        while (entradaInvalida) {
            try {
                System.out.println("Digite um número inteiro: ");
                numero = entrada.nextInt();
                entradaInvalida = false;                
            } catch (Exception e) {
                System.out.println("Entrada inválida! Digite um valor inteiro.");
                entrada.nextLine(); // Limpar o buffer de teclado.
            }            
        }

        System.out.println("Você digitou: " + numero);

        entrada.close();
    }
}
