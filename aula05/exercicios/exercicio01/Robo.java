package aula05.exercicios.exercicio01;

public class Robo {
    private final int MAX_DEFAULT = 10;
    private int posX, posY;
    private int max;

    public Robo(int max) {
        if (max > 0) {
            this.max = max;
        } else {
            this.max = MAX_DEFAULT;
        }
    }

    public void moverNorte() {
        if(posY < max) {
            posY++;
        }
        
    }

    public void moverSul() {
        if(posY < max) {
            posY++;
        }
        
    }

    public void moverLest() {
        if(posY < max) {
            posY++;
        }
        
    }

    public void moverOeste() {
        if(posY < max) {
            posY++;
        }
        
    }

    public String posicaoAtual() {
        return "X: " + posX + "Y: " + posY;
    }
    
}
