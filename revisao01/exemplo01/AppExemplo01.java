package revisao01.exemplo01;

public class AppExemplo01 {
    public static void main(String[] args) {
        Metodos m = new Metodos();

        m.metodo1();

        // Não pode ser feito, pois o método não retorna uma informação
        // System.out.println(m.metodo1());

        String retorno = m.metodo2();
        System.out.println(retorno);

        // m.metodo3();

        // m.metodo4();
        Metodos.metodo4();

        // Não é possível pois é privado
        // System.out.println(" Atributo Interno " + m.atributoPrivate);

        // Prcisa usar um método que devolve (Informa) o valor do atributo
        int valorDoAtributo = m.getAtributoPrivate();
        System.out.println(" Atributo Interno antes " + valorDoAtributo);

        m.setAtributoPrivate(15);
        valorDoAtributo = m.getAtributoPrivate();
        System.out.println(" Atributo Interno depois " + valorDoAtributo);
    }
}
