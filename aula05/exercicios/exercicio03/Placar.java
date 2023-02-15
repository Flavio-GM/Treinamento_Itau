package aula05.exercicios.exercicio03;

public class Placar {
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {
        nomeTime1 = "Time da casa";
        nomeTime2 = "Visitante";

    }

    public String exibir () {
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;

    }

}
