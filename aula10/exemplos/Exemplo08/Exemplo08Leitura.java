package aula10.exemplos.Exemplo08;

import java.io.FileReader;
import java.io.IOException;

public class Exemplo08Leitura {
    public static void main(String[] args) throws IOException{
        FileReader fReader = new FileReader("aula10/exemplos/exemplo08/arquivo.txt");
        String saida = "";
        int letra;

        // Lê o arquvio letra por letra, e quando terminar o método read retorna -1
        while ((letra = fReader.read()) != -1) {
            saida = saida + (char) letra;
        }

        System.out.println(saida);

        fReader.close();
    }
}
