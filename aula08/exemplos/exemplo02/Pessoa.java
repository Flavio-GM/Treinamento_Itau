package aula08.exemplos.exemplo02;

// abstract = classe que não pode ferar objetos
// ele é apenas um modelo.
public abstract class Pessoa {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
