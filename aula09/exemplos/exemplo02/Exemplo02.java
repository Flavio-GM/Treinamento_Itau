package aula09.exemplos.exemplo02;

import java.util.TreeSet;

public class Exemplo02 {
    public static void main(String[] args) {
        int ListaDeNumeros[] = {2, 4, 1, 6, 2, 3, 7, 4, 5, 8};
        TreeSet<Integer> arvore = new TreeSet<>();

        // Para cada "número" do vetor de "Números"
        // Adicione este "número" na "àrvore"
        for (int numero : ListaDeNumeros) {
            // Adicione o número na árvore
            arvore.add(numero);
        }

        // Exibir todos os valores da árvore
        for (Integer numero : arvore) {
            System.out.println(numero + " ");
        }
    }
}
