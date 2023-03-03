package aula08.exemplos.exemplo05;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exemplo05 {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        // Pessoa p = new Pessoa ("Emerson");
        // listaPessoas.add(p);

        // Adiciona novas pessoas na lista.
        listaPessoas.add(new Pessoa("Emerson"));
        listaPessoas.add(new Pessoa("Paduan"));
        listaPessoas.add(new Pessoa("Emerson"));

        // Para exibir, vai chamar ToString da classe Pessoa
        System.out.println(listaPessoas);

        Pessoa p1 = new Pessoa ("Ana");
        Pessoa p2 = new Pessoa ("Ana");

        
        
        // Por meio do método "equals" conseguimos comparar dois objetos
        // e saber se são iguais.
        if (p1.equals(p2)) {
            System.out.println("São iguais");            
        } else {
            System.out.println("São diferentes");
        }

        // Removendp da çosta i, pbketp com o nome "Emerson"
        if (listaPessoas.remove(new Pessoa("Paduan"))) {
            System.out.println("Removido");
        } else {
            System.out.println("Não Encontrado");
        }

        // Lista com os nomes das pessoas que quero remover
        ArrayList<Pessoa> pessoasParaRemover = new ArrayList<>();
        pessoasParaRemover.add(new Pessoa("Emerson"));
        pessoasParaRemover.add(new Pessoa("Marcos"));

        // Remover da lista de Pessoas, todoas as pessoas que estão
        // na lista para remover
        listaPessoas.removeAll(pessoasParaRemover);

        System.out.println(listaPessoas);
    }
}
