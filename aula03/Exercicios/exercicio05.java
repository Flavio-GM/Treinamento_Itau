package Exercicios;
import java.util.Scanner;

public class exercicio05 {
    
    public static void main(String[] args) {

        // Variáveis
        Scanner entrada = new Scanner(System.in);
        String senha;
        boolean senhaValida;
        

        // Entrada de Dados
        System.out.print("\nInforme a senha: \n");
        senha = entrada.nextLine();

        senhaValida = senha.equals("R10p5");

        // Processamento
        

        // Saída de Dados
        System.out.println();
        
        if (senhaValida) {
            System.out.println("Acesso Concedido!" );

        } else {
            System.out.println("Acesso Negado!");
        }
        
        System.out.println("Fim de Execução!");
        System.out.println();
                
        entrada.close();
        

    }
  

}
