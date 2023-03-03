package aula11.exercicios.contas.modelo;

public class ContaCorrente extends Conta{
    // static pois é uma mesma constante para todos os objetos. É uma contante da classe.
    // final pois é uma constante, não ppode alterar o valor.
    private static final double TAXA_DEPOSITO = 0.10;

    public ContaCorrente(int numero) {
        super(numero);
    }

    // Sobrescrevemos o método de saque pois a regra para a classe
    // ContaCorrente é deferente da regra da classe Conta
    // Aqui só pode fazer o saque se houver saldo na conta
    @Override
    public boolean sacar(double valor) {
        // Verifica se valor do saque é menor ou igual ao saldo da conta.
        // Usamos o método GetSaldo pois não temos acesso direto ao saldo por ser privado.
        if (valor <= getSaldo()) {
            return super.sacar(valor);          
        }
        return false; // Quando não tem saldo suficiente.
    }

    @Override
    public boolean depositar(double valor) {
        return super.depositar(valor - TAXA_DEPOSITO);
    }

    @Override
    public String toString() {
        return "Conta Corrente: " + super.toString();
    }
    
}
