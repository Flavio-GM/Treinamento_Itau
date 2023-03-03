package aula11.exercicios.contas.excecao;

public class ContaInexistenteException extends Exception{
    public ContaInexistenteException(String msg) {
        super (msg);
    }
    
}
