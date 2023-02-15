package aula04.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite 3 valores inteiros: ");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        System.out.println("Menor = " + menor(num1, num2, num3));
                
        teclado.close();

    }

    static int menor(int n1, int n2, int n3) {

        if(n1 <= n2 && n2 <= n3) {
            return n1;
        } else {

            if(n2 <= n1 && n2 <= n3) {
                return n2;

            } else {
                return n3;
            }
        }



    }


}
