package aula07.exemplos.Exemplo01;

public class Pessoa {
    private String nome;

    public Pessoa() {
        nome = "Sem nome";
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNome(String texto) {
        return texto + nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String exibir() {
        return "Pessoa: " + nome;
    }

    public String ToString() {
        return "Pessoa: " + nome;
    }

}
