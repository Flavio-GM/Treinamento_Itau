package aula05.exercicios.exercicio02;

/**
 * Animal
 */
public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal(String nomeAnimal, String raca, int anoNascimento, String nomeProprietario, String telefone) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        proprietario = new Proprietario(nomeProprietario, telefone);

    }

    public Animal(String nomeAnimal, String raca, int anoNascimento, String nomeProprietario) {
        this.nome = nomeAnimal;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.nomeProprietario = proprietario;


    }

    
}