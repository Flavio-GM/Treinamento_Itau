package aula08.exemplos.exemplo05;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;        
    }

    // ToString é da classe Object
    // A classe Object é SUPER de todas as classes do Java
    // Ela é usada para representar em forma de String um objeto

    // Vamos criar um método para dizer como devem ser comparados
    // dois objetos dessa classe.
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (nome == null) {
            if (other.nome != null);
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }


}
