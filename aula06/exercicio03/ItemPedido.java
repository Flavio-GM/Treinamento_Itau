package aula06.exercicio03;

public class ItemPedido {
    private int numero;
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(int numero, String descricao, int quantidade, double precoUnitario) {
        setNumero(numero);
        setDescricao(descricao);
        setQuantidade(quantidade);
        setPrecoUnitario(precoUnitario);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoUnitario(double precoUnitario) {
        
    }

    public double getValorTotal() {
        return quantidade * precoUnitario;
    }

    public String getDados() {
        return numero + " - " + descricao + " - " + quantidade + " - " + precoUnitario;
    }






}
