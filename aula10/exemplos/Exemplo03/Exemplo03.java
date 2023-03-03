package aula10.exemplos.Exemplo03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
                
        try {
            System.out.println("Digite um número inteiro: ");
            // Ler como texto e transformar em um inteiro.
            numero = Integer.parseInt(entrada.nextLine());            
        } catch(InputMismatchException e) {
            System.out.println("Entrada Inválida.");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Classe: " + e.getClass().getName());
        } catch(NumberFormatException e) {
            System.out.println("Número Inválido.");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Classe: " + e.getClass().getName());
        } catch(Exception e) {
            System.out.println("Ocorreu um erro inesperado...");
            System.out.println("Mensagem: " + e.getMessage());
            System.out.println("Classe: " + e.getClass().getName());
        } finally { // Sempre é feito, independente de ocorrer erro (Exception) ou não.
            System.out.println("Fechar conexões...");
            try {
                entrada.close();
            } catch (Exception e) {
                
            }
            
        }
    }
}
