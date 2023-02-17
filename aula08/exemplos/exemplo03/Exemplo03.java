package aula08.exemplos.exemplo03;

public class Exemplo03 {
    public static void main(String[] args) {
        // Não pode ser feito pois interface não pode gerar
        //DispsitivoSaida d = new DispositvoSaida
        
        // podemos gerar objetos do tipo Tela
        Tela tela = new Tela();
        // Podemos gerar objetos do tipo Immpressora
        Impressora imp = new Impressora();

        // Se tela e Impressoa são DispositivosSaida
        //Podemos usar DispositivoSaida como referênciia para os dois.
        DispositivoSaida d1 = new Impressora();
        DispositivoSaida d2 = new Tela();

        tela.imprimir();
        imp.imprimir();

        d1.imprimir();
        d2.imprimir();

        Pessoa pessoa = new Pessoa();

        System.out.println("Exibindo dados da pessoa: ");
        pessoa.exibirDados(tela);
        pessoa.exibirDados(imp);
    }
    
}
