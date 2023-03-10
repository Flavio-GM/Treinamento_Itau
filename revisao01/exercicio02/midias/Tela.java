package revisao01.exercicio02.midias;

public class Tela implements Midia {

    @Override
    public void exibir(String mensagem) {
        System.out.println("Exibindo na tela");
        System.out.println(mensagem);
    }
    
}
