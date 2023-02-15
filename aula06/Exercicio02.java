package aula06;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int QTDE_SORTEIOS = 10;
        Random aleatorio = new Random();
        int cont[] = new int [7];
        int numeroSorteado;

        for (int i = 0; i < QTDE_SORTEIOS; i++) {
            numeroSorteado = aleatorio.nextInt(1, 7);
            System.out.println(numeroSorteado);
            cont[numeroSorteado]++;            
        }
        for (int i = 1; i < cont.length; i++) {
            System.out.println("Lado: " + i + " Foi sorteado " + cont[i]);
            
        }

        scanner.close();
    }
}
