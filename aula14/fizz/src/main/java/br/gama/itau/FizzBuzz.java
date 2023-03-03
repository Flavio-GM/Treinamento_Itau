package br.gama.itau;

public class FizzBuzz {

    public String converte(int numero) {

        if(numero % 3 == 0 && numero % 5 == 0){
            return "FizzBuzz";
        }
        if(numero % 3 == 0){
            return "FizzBuzz";
        }
        if(numero % 3 == 0){
            return "Buzz";
        }
        return String.valueOf(numero);
    }

}
