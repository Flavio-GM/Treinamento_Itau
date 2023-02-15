package aula06.exercicio04;

public class Exercicio04 {
    public static void main(String[] args) {
        Data data1 = new Data(15, 02, 2023);

        System.out.println(data1.getData());
        System.out.println(data1.getDia());
        System.out.println(data1.getMes());
        System.out.println(data1.getAno());

        Data data2 = new Data();
        System.out.println(data2);
    }
    
}
