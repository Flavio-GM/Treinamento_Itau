package aula07.exercicios.exercicio01;



public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalrio(float perc) {
        // salario = salario * salario * perc;
        // salario = (1 + perc) * salario;
        salario *= (1 + perc);
    }

    public String imprimir () {
        return nome + " - R$ " + salario;
    }
    
}
