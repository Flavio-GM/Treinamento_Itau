package aula06;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int QTDE_ALUNOS = 5;
        double notas[] = new double[QTDE_ALUNOS];
        double media;
        int cont;

        media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i+1));
            notas[i] = scanner.nextDouble();
            media = media + notas[i];
        } 
        media = media / QTDE_ALUNOS;

        System.out.printf("Média = %.2f\n", media); // Usar o %.2f\n para colocar apenas 2 casas decimais e pular uma linha.
        System.out.println("Notas acima da média: ");

        cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println(notas[i]);
                cont++;
            }
            
        } 

            System.out.println("Qtde de notas acima da média: " + cont);

        scanner.close();
    }
}