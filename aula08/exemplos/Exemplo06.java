package aula08.exemplos;

import java.util.Stack;

/**
 * Exemplo06
 */
public class Exemplo06 {

    public static void main(String[] args) {
        // Stack = Pilha
        Stack<String> pilha = new Stack<>();

        // Insere na pilha os endereços da web, simulando que a cada site navegado
        // guardando o endereço para poder voltar.
        pilha.push("wwwsiteA.com");
        pilha.push("wwwsiteB.com");
        pilha.push("wwwsiteC.com");
        pilha.push("wwwsiteD.com");

        // 
        // 
        pilha.pop(); // Tira o elemento que está no TOPO da Pilha.

        // 
        // 
        pilha.pop(); // 
        System.out.println("Voltei para: ");

        // enquanto a pilha não (!) estiver vazia.
        // mostra todos os sites que restaram
        System.out.println("Todos os outros:");
        while (!pilha.isEmpty()) {
            String site = pilha.pop(); // remove da pilha
            System.out.println(site);
        }
    }
}