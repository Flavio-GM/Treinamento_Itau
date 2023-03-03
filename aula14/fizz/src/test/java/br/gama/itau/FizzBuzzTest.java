package br.gama.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    private static FizzBuzz fizzBuzz;

    @BeforeAll
    static  void setup() {
        fizzBuzz = new FizzBuzz();
    }
    
    static NumeroInteiro_NumeroValido_retornaTextoNumero() {
        // preparação
        int entrada = 1;
        String esperado = "1";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    static NumeroMultiploDe3_NumeroValido_retornaFizz() {
        // preparação
        int entrada = 3;
        String esperado = "Fizz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    static NumeroMultiploDe3_NumeroValido_retornaFizz() {
        // preparação
        int entrada = 3;
        String esperado = "Buzz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }

    @Test
    static NumeroMultiploDe3E5_NumeroValido_retornaFizzBuzz() {
        // preparação
        int entrada = 3;
        String esperado = "FizzBuzz";

        // execução
        String resposta = fizzBuzz.converte(entrada);

        // verificação
        assertEquals(esperado, resposta);
    }
}

