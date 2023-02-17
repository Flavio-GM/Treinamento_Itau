

public class Pessoa {
    private static String nome;

    //Exemplo de constante de classe.
    public static final double PI = 3.1415;

    // Um método da classe, e não de um objeto.
    // Serve para chamar o método, sem precisar criar o objeto.
    public static void nomeDaClasse() {
        System.out.println("Classe pessoa");
        System.out.println(PI);
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }

}
