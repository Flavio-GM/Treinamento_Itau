package aula07.exercicios.exercicio01;

public class Exercicio01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gisele", 1000);
        Gerente gerente = new Gerente("Marcelo", 1000, 30);

        funcionario.aumentarSalrio(0.2f);
        gerente.aumentarSalrio(0.2f);

        System.out.println(funcionario.imprimir());
        System.out.println(gerente.imprimir());
    }
    
}
