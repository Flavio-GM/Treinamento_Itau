package revisao01.exemplo01;

public class Metodos {

    private int atrivutoPrivate = 12;

    // Como declaramos um método:
    // Visibulidade retorno nome (parâmetros)

    // void significa que ele não dá retorno
    public void metodo1() {
        System.out.println("Metodo 1");
    }

    public String metodo2() {
        return ("Metodo 2");
    }

    // Só pode ser acioando dentro da classe
    private void metodo3() {
        System.out.println("Metodo 3");
    }

    // static indica um método da CLASSE e não do objeto
    public static void metodo4() {
        System.out.println("Metodo 4");
    }
    // final = constante

    // Infoma (retorna) o valor do atributo
    public int getAtributoPrivate() {
        return atrivutoPrivate;
    }

    // Apenas faz a ação e não prcisa retorna nenhuma confirmação
    public void setAtributoPrivate(int novoValor) {
        this.atrivutoPrivate = novoValor;
    }
}
