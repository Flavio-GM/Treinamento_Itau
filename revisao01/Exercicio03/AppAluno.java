package revisao01.Exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class AppAluno {
    public static void main(String[] args) {
        final int QTDE_ALUNOS = 3;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alunos> alunos = new ArrayList<>();
        String nome;
        double nota, media;
        int alunoAcimaMedia;

        media = 0;
        for (int i = 0; i <QTDE_ALUNOS; i++) {
            System.out.println("Digite o nome do aluno: ");
            nome = entrada.nextLine();
            System.out.println("Digite a nota: ");
            nota = Double.parseDouble(entrada.nextLine());

            alunos.add(new Alunossss(nome, nota));
            media += nota;
        }

        media /= QTDE_ALUNOS;

        System.out.println("Alunos acima da média: ");
        
        alunoAcimaMedia = 0;
        for (Aluno aluno : alunos) {
            if(aluno.getNota() > media) {
                System.out.println(aluno);
                alunoAcimaMedia++;
            }
        }

        System.out.println("Total de alunos acima da média: " + alunoAcimaMedia);

        entrada.close();
    }
}
