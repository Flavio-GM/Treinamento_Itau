package aula04.exercicios.Exercicio04;

public class Relogio {
    private int hora, minuto, segundo;
    
    public Relogio(int hora, int minuto, int segunto) {
        set.hora = hora;
    }

    public int gethora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getminuto() {
        return minuto;
    }

    public void set(int segundo) {
        if (segundo >= 0 && segundo < 24) {
            this.segundo = segundo;
        }
    }

    public void exibir () {

    }


    
}
