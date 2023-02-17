package aula08.exemplos.exemplo03;

// A classe Tela, implementa a interface DispositovoSaida
// podemos gerar objetos do tipo Tela
// Podemos dizer que "Tela" <É UM> "DispositivoDeSaida"
public class Tela implements DispositivoSaida {
    public void imprimir() {
        System.out.println("Exibindo na Tela");

    }
    
}
