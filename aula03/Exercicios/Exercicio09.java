package Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;
        int numero;


        System.out.print("Qual o valor do limite? ");
        limite = teclado.nextInt();
        System.out.println();

        numero = 1;
        while(numero <= limite) {
            if(numero * 2 <= limite) {
                System.out.print(numero + ", ");
            } else {
                System.out.println(numero);
            }
            numero = numero * 2;
            
        }
        // for(numero = 1; numero <= limite; numero *= 2) {
        // System.out.print(numero + " ");
        // }

        System.out.println();
        System.out.println("Fim!");
        System.out.println();

        teclado.close();
    }
}
