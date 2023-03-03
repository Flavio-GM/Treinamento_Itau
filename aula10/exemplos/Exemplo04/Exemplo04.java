package aula10.exemplos.Exemplo04;

public class Exemplo04 {
    public static void main(String[] args) {
        // String texto = "Bom dia";
        String texto = null;

        // Exibe a letra que está na segunda posição dentro do texto.
        System.out.println(letra(texto, 2));
    }

    // Retorna a letra de uma frase que está na posição indicada.
    static char letra(String frase, int posicao) {
        try {
            return frase.charAt(posicao);
        } catch (Exception e) {
            System.out.println("Erro dentro do método letra");
            System.out.println(e.getMessage());
            return '#';
        }
    }
}
