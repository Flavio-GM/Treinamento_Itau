package aula04.exercicios.Exercicio03;

/**
 * Exercicio03
 */
public class Exercicio03 {


    public static void main(String[] args) {
        Veiculo meuCarro = new Veiculo("BMW", "X1", 7.5);

        meuCarro.exibir();

        // meuCarro.consumo = -7; Não é permitido porque o atriuto é privado.


        System.out.println("Consumo: " + meuCarro.obterConsumo());


    }
}