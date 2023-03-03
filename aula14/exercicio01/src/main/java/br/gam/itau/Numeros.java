package br.gam.itau;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numeros {
    
    public int getMinimo(ArrayList<Integer> lista) {
        // int minimo = lista.get(0);

        // for (Integer numero : lista) {
        //     if(numero < minimo){
        //         minimo = numero;
        //     }
        // }
        // return minimo;

        return Collections.min(lista);
    }

    public int getMaximo(ArrayList<Integer> lista) {
        return Collections.max(lista);
    }

    public int getSize(ArrayList<Integer> lista) {
        return lista.size();
    }

    public double getMedia(ArrayList<Integer> lista) {
        double media = 0;

        for (Integer numero : lista) {
            media += numero;
        }
        media /= lista.size();
        return media;
    }
}
