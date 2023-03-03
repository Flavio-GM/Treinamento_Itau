package aula10.exercicios.Exercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        
        try {
            System.out.println("Digite um número inteiro: ");
            n1 = scanner.nextInt();
            System.out.println("Digite outro número inteiro diferente de zero: ");
            n2 = scanner.nextInt();

            System.out.println(calcular(n1, n2, '+'));
            System.out.println(calcular(n1, n2, '-'));
            System.out.println(calcular(n1, n2, '*'));
            System.out.println(calcular(n1, n2, '/'));
    
        } catch (ArithmeticException e) {
            System.out.println("Erro.");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Digitação inválida.");
        }
        
        scanner.close();

        }

    private static double calcular(int n1, int n2, char operacao) throws ArithmeticException {
        switch (operacao) {
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                if(n2 == 0) {
                    throw new ArithmeticException("Divisão por zero");
                }
                return (double)n1 / n2;
            
        
            default:
                return -1;
        }
    }
}
