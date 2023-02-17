package aula07.exemplos.Exemplo01;

public class Estudante extends Pessoa {
    public Estudante(String nome) {
        super(nome); // super = superclasse Pessoa(nome)
    }

    public String toString() {
        return "Estudante: " + getNome();
    }

}
