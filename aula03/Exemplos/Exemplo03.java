package Exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 5; // Constante não permite alterar o valor.
        Scanner teclado = new Scanner(System.in);
        double nota, media;
        int cont;
    
        cont = 1;
        media = 0;
        
        while (cont <= QTDE_ALUNOS) {
        System.out.println("Digite a próxima nota: (" + cont + "/" + QTDE_ALUNOS + ")");
        nota = teclado.nextDouble();
        media = media + nota;
        cont++;

        }

        System.out.println();
        System.out.println("Fim!");
        System.out.println();

        teclado.close();

    }
    
}
