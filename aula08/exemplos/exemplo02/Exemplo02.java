package aula08.exemplos.exemplo02;

public class Exemplo02 {
    public static void main(String[] args) {
        
        Aluno a = new Aluno();
        a.setNome("João");
        a.setNumero(123);
        System.out.println(a.getNome() + " - " + a.getNumero());

        // Isso pode, pois o objeto é Aluno, não objeto Pessoa
        Pessoa p = new Aluno();

        p.setNome("João");
        // p.setNumero(123)
        // fazemos um casting (transformação)
        Aluno temp = (Aluno) p;
        temp.setNumero(123);
        System.out.println(temp.getNome() + " - " + temp.getNumero());

    }
    
}
