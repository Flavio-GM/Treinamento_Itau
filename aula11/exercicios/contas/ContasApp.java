package aula11.exercicios.contas;

import java.util.Scanner;

import aula11.exercicios.contas.dados.GerenciaContas;
import aula11.exercicios.contas.excecao.ContaInexistenteException;
import aula11.exercicios.contas.excecao.valorInvalidoException;
import aula11.exercicios.contas.modelo.Conta;
import aula11.exercicios.contas.modelo.ContaPoupanca;

public class ContasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        int numeroConta;
        double limite, valor;

        GerenciaContas contas = new GerenciaContas();

        // demostração da ocorrência de uma exceção personalizada
        try {
            ContaPoupanca.setTaxaSaque(-0.1);
        } catch (valorInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());      
        }

        while (opcao != 7) {
            System.out.println("1 - Nova Conta Corrente");
            System.out.println("2 - Nova Conta Poupança");
            System.out.println("3 - Nova Conta Especial");
            System.out.println("4 - Consultar Saldo");
            System.out.println("5 - Depositar");
            System.out.println("6 - Sacar");
            System.out.println("7 - Sair");
            System.out.println("-->");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Informe o número da Conta");
                    numeroConta = entrada.nextInt();
                    contas.novaContaCorrente(numeroConta);                    
                    break;

                case 2:
                    System.out.println("Informe o número da Conta");
                    numeroConta = entrada.nextInt();
                    contas.novaContaPoupanca(numeroConta);
                    break;
                case 3:
                    System.out.println("Informe o número da Conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Informe o valor do Limite: ");
                    limite = entrada.nextDouble();
                    contas.novaContaEspecial(numeroConta, limite);
                    break;

                case 4:
                    System.out.println("Informe o número da Conta");
                    numeroConta = entrada.nextInt();
                    try {
                        System.out.println(contas.consultarSaldo(numeroConta));
                    } catch (ContaInexistenteException e) {
                        System.out.println("Erro: " + e.getMessage());                        
                    }
                    
                    break;

                case 5:
                    System.out.println("Informe o número da Conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Qual o valor do depósito: ");
                    valor = entrada.nextDouble();
                    try {
                        contas.depositar(numeroConta, valor);
                        System.out.println("Sucesso: ");                        
                    } catch (ContaInexistenteException e) {
                        System.out.println("Erro: " + e.getMessage());                        
                    }
                    break;

                case 6:
                    System.out.println("Informe o número da Conta");
                    numeroConta = entrada.nextInt();
                    System.out.println("Qual o valor do saque: ");
                    valor = entrada.nextDouble();
                    try {
                        contas.sacar(numeroConta, valor);
                        System.out.println("Sucesso: ");                        
                    } catch (ContaInexistenteException e) {
                        System.out.println("Erro: " + e.getMessage());                        
                    }
                    break;

                case 7:
                    break;

                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        }
        entrada.close();
    }
}
