package Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tabuada, cont;
        
        System.out.println("Qual a tabuada? ");
        tabuada = teclado.nextInt();

        cont = 0;
        while (cont <= 10) {
            // System.out.println(tabuada + " X " + cont + " = " + (tabuada * cont)); // Outra forma de fazer.
            System.out.printf("%d X %2d = %2d\n", tabuada, cont, (tabuada * cont) ); // %d = Número.
            cont++;

            teclado.close();
        
        }


        }

    

    }
