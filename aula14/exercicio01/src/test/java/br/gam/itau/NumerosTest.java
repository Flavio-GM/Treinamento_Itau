package br.gam.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NumerosTest {

    private static Numeros pn;
    private static ArrayList<Integer> lista;

    @BeforeAll
    static void setup() {
        pn = new Numeros();
        lista = new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(7);
        lista.add(6);
    }

    @Test
    void listaNumeros_listaconTemValores_retornaoMinimo() {
        int menorEsperado = 3;

        int resposta = pn.getMinimo(lista);

        assertEquals(menorEsperado, resposta);

    }

    @Test
    void listaNumeros_listaconTemValores_retornaoMaximo() {
        int maiorEsperado = 7;

        int resposta = pn.getMaximo(lista);

        assertEquals(maiorEsperado, resposta);

    }

    @Test
    void listaNumeros_listaconTemValores_retornaoQuantidadeNumeros() {
        int quantidadeEsperada = 4;

        int resposta = pn.getSize(lista);

        assertEquals(quantidadeEsperada, resposta);

    }

    @Test
    void listaNumeros_listaconTemValores_retornaoMediaValores() {
        double mediaEsperada = 5.25;

        double resposta = pn.getMedia(lista);

        assertEquals(mediaEsperada, resposta);

    }
}

