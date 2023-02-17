package aula07.exercicios.exercicio02;



public class Funcionario {
    private String nome;
    private double valorPorHora;
    private double horasTrabalhadas;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double salario) {
        this.valorPorHora = salario;
    }

    public void aumentarSalrio(float perc) {
        // salario = salario * salario * perc;
        // salario = (1 + perc) * salario;
        valorPorHora *= (1 + perc);
    }

    public String imprimir () {
        return nome + " - R$ " + valorPorHora;
    }
    
}
