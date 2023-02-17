package aula08.exemplos.exemplo03;

public class Pessoa {

    // criamos independência do dispositivo
    // pois não importa o disositov o método imprimir sempre existe
    public void exibirDados(DispositivoSaida saida) {
        saida.imprimir();


    }
}
