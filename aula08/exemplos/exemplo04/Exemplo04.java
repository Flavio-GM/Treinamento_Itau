package aula08.exemplos.exemplo04;

import java.util.ArrayList;

public class Exemplo04 {
    public static void main(String[] args) {
        // Só podemos usar nome de classe, não podemos usar nomes primitivos.
                
        // Para o tipo int, devemos usar Integer (Nome de classe)
        ArrayList<Integer> listaInteiros = new ArrayList<>();

        // Para o tipo double, devemos usa o nome de classe (Double)
        ArrayList<Double> listaDoubles = new ArrayList<>();

        // String é classe, então podemos usar.
        ArrayList<String> listaPalavras = new ArrayList<>();

        //Adiciona itens no final do array
        listaPalavras.add("Zero");
        listaPalavras.add("Um");
        listaPalavras.add("Dois");
        listaPalavras.add("Três");
        listaPalavras.add("Quatro");

        System.out.println("Qauntidade: " + listaPalavras.size());
        System.out.println(listaPalavras); // Chama o toString implicitamente.

        //Posso percorrer o ArrayList em qualquer direção. Neste exemplo, do final para o começo.
        for (int i = listaPalavras.size()-1; i >= 0; i--) {
            System.out.println(listaPalavras.get(i));            
        }

        System.out.println();
        // Para apagar precsa ser exatamente igual.
        if(listaPalavras.remove("Dois")) {
            System.out.println("Apagado com Sucesso!");
        } else {
            System.out.println("Não apagado");
        }
        
        System.out.println("\n Com o for i:");
        //Posso percorrer o ArrayList em qualquer direção. Neste exemplo, do ínicio até o final.
        for (int i = 0; i < listaPalavras.size(); i++) {
            System.out.print(listaPalavras.get(i) + " ");            
        }   

        System.out.println("\n Com o foreach:");
        // for - foreach - para cada elemento
        // Para cada "palavra" da "ListaPalavras"
        // cada vez que passar pelo "for", preenche a variável "palabra" com um elemento da lista
        for (String palavra : listaPalavras) {
            System.out.println(palavra + " ");
        }
    }
}
