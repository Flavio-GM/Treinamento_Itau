package aula10.exemplos.Exemplo01;


import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        // Tente fazer isso.
        try {
            System.out.println("Digite um número inteiro: ");
            numero = entrada.nextInt();
                    } catch (Exception e) { // Caso aconteça um erro, faça aqui o tratamento
            System.out.println("Ocorreu um erro.");
            // e.getMessage pode trazer a mensagem de erro, caso o Exception tenha uma mensagem
            System.out.println("Mensagem: " + e.getMessage());        
            // Podemos capturar toda a Stack (pilha) de chamadas de métodos.
            e.printStackTrace();

            numero = 0; // Um possível tratamento para a falta de valor digitado.
        }

        System.out.println("Você digitou: " + numero);

        System.out.println("Final do Programa.\n");

        entrada.close();

    }
}
