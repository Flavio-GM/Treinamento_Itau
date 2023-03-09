package revisao01.exercicio01;

public class AppCelular {
    public static void main(String[] args) {
        CelularPrePago celular1 = new CelularPrePago("11111");
        CelularPrePago celular2 = new CelularPrePago("Marcelo", "22222", 10);

        System.out.println(celular1);
        System.out.println(celular2);

        if (celular1.fazerligacao()) {
            System.out.println("Ligação realizada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        if (celular2.fazerligacao()) {
            System.out.println("Ligação realizada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println("Saldo após a ligação: " + celular2.getSaldo());

        double novoSaldo = celular1.recarregar(0);
        if (novoSaldo > 0) {
            System.out.println("Novo Saldo: " + novoSaldo);
        } else {
            System.out.println("Erro ao fazer a recarga.");
        }

        novoSaldo = celular1.recarregar(10);
        if (novoSaldo > 0) {
            System.out.println("Novo Saldo: " + novoSaldo);
        } else {
            System.out.println("Erro ao fazer a recarga.");
        }
    }
}
