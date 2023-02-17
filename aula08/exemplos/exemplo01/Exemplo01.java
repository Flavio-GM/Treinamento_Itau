public class Exemplo01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        // Método estáticvo é chamado a partir da classe.
        // Classe é Pessoa.
        Pessoa.nomeDaClasse();

        // Exemplo de constante estática.
        System.out.println(Pessoa.PI);

        //Exemplo prático de uso de método estático
        //Classe matemática do Java.
        Math.sqrt(25);

        p1.setNome("Emerson");
        p2.setNome("Davi");
        System.out.println(p1.getNome());
        System.out.println(p2.getNome());

    }
}
