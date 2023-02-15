package aula04.exemplos;

/**
 * Exemplo1
 */
public class Exemplo01 {
    
    public static void main(String[] args) {
        linha(5);
        System.out.println("Bom Dia!");
        linha(15);
        linha2(10, '*');
        linha3("Contando os caracteres", '=');
        
    }

    static void linha(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linha2(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

    static void linha3(String mensagem, char simbolo) {
        System.out.println(mensagem);
        for (int i = 0; i < mensagem.length(); i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }


}