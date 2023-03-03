package aula10.exemplos.Exemplo08;

import java.io.FileWriter;
import java.io.IOException;

// Escrevendo conteúdo diretamente dentro do arquivo.

public class Exemplo08 {
    public static void main(String[] args) throws IOException{
        // Abre o arquivo para gravação.
        // Se colocar true no final, a classe vai acrescentar ao final e não apagar.
        FileWriter fWriter = new FileWriter("aula10/exemplos/exemplo08/arquivo.txt", true);
        String texto = "\nLinha de texto\nOutra linha";

        // Escreve dentro do arquivo
        fWriter.write(texto);

        fWriter.close();
    }
}
