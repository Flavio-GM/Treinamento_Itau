package aula09.exemplos.exemplo01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
    //Queue é uma interface e por isso não pode instaciar (gerar) objetos
    // podemos usar uma Lista Ligada que é uma classe que implementa Queue
    Queue<Integer> fila = new LinkedList<>();

    // Inserindo alguns números na fila.
    fila.add(1);
    fila.add(2);
    fila.add(3);
    fila.add(4);

    // Exibindo a fila atraves do método toString.
    System.out.println(fila);

    // Removendo todos os alementos da fila
    // enquanto a fila não estivar vazia.
    while (!fila.isEmpty()) {
        System.out.println("Removendo: " + fila.remove());      
        System.out.println(fila);      
        }

    }
}