package aula11.exercicios.contas.dados;

import java.util.HashMap;

import aula11.exercicios.contas.excecao.ContaInexistenteException;
import aula11.exercicios.contas.modelo.Conta;
import aula11.exercicios.contas.modelo.ContaCorrente;
import aula11.exercicios.contas.modelo.ContaEspecial;
import aula11.exercicios.contas.modelo.ContaPoupanca;

public class GerenciaContas {
    private HashMap<Integer, Conta> listaDeContas;

    public GerenciaContas() {
        listaDeContas = new HashMap<>();
    }
    public void novaContaCorrente(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaCorrente(numeroConta));
    }

    public void novaContaPoupanca(int numeroConta) {
        listaDeContas.put(numeroConta, new ContaPoupanca(numeroConta));
    }

    public void novaContaEspecial(int numeroConta, double limite) {
        listaDeContas.put(numeroConta, new ContaEspecial(numeroConta, limite));
    }

    public String consultarSaldo(int numeroConta) throws ContaInexistenteException{
        // busca a conta desejada
        Conta conta = listaDeContas.get(numeroConta);
        if(conta == null) {
            // return "Conta não encontrada";
            throw new ContaInexistenteException("Conta não encontrada!");
        }
        return conta.toString();
    }

    public boolean depositar(int numeroConta, double valor) throws ContaInexistenteException {
        Conta conta = listaDeContas.get(numeroConta);
        if(conta == null) {
            return false;
        }
        return conta.depositar(valor);
    }

    public boolean sacar(int numeroConta, double valor) throws ContaInexistenteException{
        Conta conta = listaDeContas.get(numeroConta);
        if(conta == null) {
            return false;
        }
        return conta.sacar(valor);
    }

}
