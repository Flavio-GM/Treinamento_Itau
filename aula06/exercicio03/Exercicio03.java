package aula06.exercicio03;

public class Exercicio03 {
    public static void main(String[] args) {
        ItemPedido item = new ItemPedido(1234, "Mouse Gamer", 4, 80);

        System.out.println("Produto: ");

        // Para usar no printf:
        // %d = número inteiro
        // %s = String
        // %.2f = double ou float
        // \n para descer para a próxima linha.
        // www.digitalocean.com/community/tutorials/java-printf-method

        System.out.printf("%d - %s (%d) R$ %.2f\n"), item.getDescricao(), item.getQuantidade(), item.getPrecoUnitario();

        System.out.printf("Valor total: R$ %2.f\n", item.getValorTotal());
    }
    
}
