package Exercicios;
import java.util.Scanner;

public class exercicio06 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double salario;

        System.out.print("\nInforme o salário: \n");
        salario = entrada.nextDouble();
                
        if (salario <= 600) {
            System.out.println("Isento" );
            } else {
                if (salario <= 1200){
                System.out.println("20%" );
                    }else
                        if (salario <= 2000){
                        System.out.println("25%" );
                            } else {
                            System.out.println("30%");
            }

            }
        System.out.println("Fim de Execução!");
        System.out.println();
        entrada.close();

    }

}
