package aula04.exercicios.Exercicio03;

public class Veiculo {
    private String marca, modelo;
    private double consumo;

    public Veiculo(String marca, String modelo, double consumo) {
    this.marca = marca;
    this.modelo = modelo;
    if(consumo > 0) {
        this.consumo = consumo;
    }
    
    }

    public void exibir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        
    }
    public double obterConsumo() {
        return consumo;
    }


    
    
}
