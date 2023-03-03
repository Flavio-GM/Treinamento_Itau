package aula10.exemplos.Exemplo05;

public class Exemplo05 {
    public static void main(String[] args) {
        String texto = null;
        
        // Como 'letra' dispara uma exception, precisa usar um try/catch.
        try {
            System.out.println(letra(texto, 2));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } 
    }
    // throws indica (declara) que esse métodos lnaça uma esception e isso deve ser tratado pleo metodo (main) que chama o método letra.
    static char letra(String frase, int posicao) throws Exception {
        if(frase == null) {
            // throw dspara uma Esception (pode ser de qulaquer tipo)
            // Neste caso, é uma Exception genérica.
            throw new Exception("O Texto é nulo.");
        }
        return frase.charAt(posicao);
    }
}
