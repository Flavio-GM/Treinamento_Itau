package revisao01.exercicio02;

import java.util.ArrayList;

import revisao01.exercicio02.modelos.Circulo;
import revisao01.exercicio02.modelos.FiguraGeometrica;
import revisao01.exercicio02.modelos.Quadrado;
import revisao01.exercicio02.modelos.Retangulo;

public class AppFigura {
    public static void main(String[] args) {
        Quadrado q = new Quadrado(0, 0, 5);
        Retangulo r = new Retangulo(0, 0, 4, 5);
        Circulo c = new Circulo(0, 0, 3);

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(q);
        figuras.add(r);
        figuras.add(c);

        // System.out.println("Area do quadrado: " + q.area());
        // System.out.println("Area do retângulo: " + r.area());

        for (FiguraGeometrica fg : figuras) {
            System.out.println("Area: " + fg.area());
        }

        // for (int i = 0; i < figuras.size(); i++) {
        //     System.out.println("Area: " + figuras.get(i).area());
        // }
    }
    
}
