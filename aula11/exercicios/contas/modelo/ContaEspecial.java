package aula11.exercicios.contas.modelo;

public class ContaEspecial extends Conta {

    private double limite;

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public void setLimite(double novoLimite) {
        if (novoLimite > 0) {
            this.limite = novoLimite;
        }
    }

    @Override
    public boolean sacar(double valor) {
        // Pode sacar se o saldo da conta mais o limite for suficiente.
        if (valor <= getSaldo() + limite) {
            return super.sacar(valor);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta Especial: " + super.toString() + " limite: " + limite;
    }
}
