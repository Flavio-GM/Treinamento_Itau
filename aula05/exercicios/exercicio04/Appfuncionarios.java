package aula05.exercicios.exercicio04;

public class Appfuncionarios {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Carlos Alberto", 40);

        System.out.println(func1.exibir());
        System.out.println("Salário : R$ " + func1.calcularSalario(10));

    }
}
