package revisao01.exercicio01;

/**
 * CelularPrePago
 */
public class CelularPrePago {
    private String cliente;
    private String telefone;
    private double saldo;

    // Polimorfismo: Sobrecarga (Overload) ou sobrescrita (override)
    public CelularPrePago(String telefone) {
        setTelefone(telefone);
        this.cliente = "Não registrado"; // Poderia ser deixado em branco, de acordo com o enunciado.
    }

    public CelularPrePago(String cliente, String telefone, double saldo) {
        this.cliente = cliente;
        setTelefone(telefone);
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    // Colocar o método como privado faz com que ele nã possa ser usado fora da
    // classe.
    // O enuciado pede para não ter o método mas ciramos para evintar a repetição da
    // regra nos dos contrutores
    // e deixamos "oculto" como privado
    private void setTelefone(String telefone) {
        if (telefone != null && telefone.length() > 0) {
            this.telefone = telefone;
        }
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CelularPrePago [cliente= " + cliente + ", telefone= " + telefone + ", saldo= " + saldo + "]";
    }

    // public boolean fazerligacao() {
    //     if(saldo >= 0.75) {
    //         saldo -= 0.75;
    //         System.out.println("Ligação realizada");
    //     } else {
    //         System.out.println("Saldo insuficiente");

    //     }
    // }

    public boolean fazerligacao() {
        if(saldo >= 0.75) {
            saldo -= 0.75;
            return true;
        }
        return false;
    }

    public double recarregar(double valor) {
        if(valor > 0) {
            saldo += valor;
            return saldo;
        }
        // O valor paaado no parâmetro é incorreto e não é possível atualiar o saldo
        return -1; // -1 é uma escolha do programador para indi a erro, já que o retorno deve ser um número
    }
}