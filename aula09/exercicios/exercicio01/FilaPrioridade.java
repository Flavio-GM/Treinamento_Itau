package exercicios.exercicio01;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPrioridade {
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;

    // construtor é um método especial, usado para inicializar o objeto
    public FilaPrioridade() {
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();
    }

    public void inserir(String nome, int senha, boolean prioridade) {
        Pessoa pessoa = new Pessoa(nome, senha);

    }

    // remover 1 normal a cada 2 prioridade
    public Pessoa remover() {
        if(atendimento < 2) { // Atentimento de prioridade
        atendimento++;
    } else { // atendimento Normal
        atendimento = 0;
    }
    System.out.println("Atendimento: ");
    }
}