package Exercicios;
import java.util.Scanner;

public class exercicio04 {
    
    public static void main(String[] args) {

        // Variáveis
        Scanner teclado = new Scanner(System.in);
        double salBruto, valorPrestacao;
        double valorMaximo;
        boolean podeEmprestar;

        // Entrada de Dados
        System.out.print("\nDigite o valor do salário bruto: \n");
        salBruto = teclado.nextDouble();

        System.out.print("\nDigite o valor da prestação: \n");
        valorPrestacao = teclado.nextDouble();
             
        // Processamento
        valorMaximo = salBruto * 0.3;
        podeEmprestar = valorPrestacao <= valorMaximo;

        // Saída de Dados
        System.out.println();
        
        if (podeEmprestar) {
            System.out.println("Pode fazer o emprestimo" );

        } else {
            System.out.println("Não pode fazer o emprestimo");
        }
        
        System.out.println("Fim de Execução!");
        System.out.println();
                
        teclado.close();
        

    }
  
}
