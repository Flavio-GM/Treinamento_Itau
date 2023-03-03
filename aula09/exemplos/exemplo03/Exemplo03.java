package aula09.exemplos.exemplo03;

import java.util.HashMap;

public class Exemplo03 {
    public static void main(String[] args) {
        // Integer neste exemplo é o o tipo da chave (Key)
        // String neste exemplo éo tipo da informação.
        HashMap<Integer, String> mapa = new HashMap<>();

        // Insere alguns pares (chave, valor) dentro do HashMap (Mapa de Hash)
        mapa.put(1, "Um");
        mapa.put(2, "Dois");
        mapa.put(3, "Três");
        mapa.put(4, "Quatro");

        // Exibir alguns conteúdos a partir da chave fornecida
        System.out.println("Key 3 = " + mapa.get(3));
        System.out.println("Key 4 = " + mapa.get(4));

        System.out.println("Key 5 = " + mapa.get(5)); // Usando uma chave que não existe.

        // Lista todas as chaves do conjunto de chaves do Hash
        // 
        for (Integer key : mapa.keySet()) {
            System.out.println(key);            
        }
    }
}
