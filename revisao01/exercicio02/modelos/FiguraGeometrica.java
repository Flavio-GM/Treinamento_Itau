package revisao01.exercicio02.modelos;

import aula08.exemplos.exemplo03.Tela;
import revisao01.exercicio02.midias.Midia;

// classe abstrata não instancia objeto
public abstract class FiguraGeometrica {
    private int x, y;

    public FiguraGeometrica(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int setY(int y) {
        this.y = y;
    }

    public void mostrarDados(Midia midia) {
        midia.exibir(this.toString());
    }

    // Inversão de controle
    public void mostrarDados(Midia midia) {
        midia.exibir(this.toString());
    }


    // Método abstrato DEVE obrigatoriametne ser implementado nas classes filho    
    public abstract double area();
}
