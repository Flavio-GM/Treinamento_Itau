package br.gama.itau.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity // Indica que esta classe será armazenada no BD
@Table(name = "professor") // Opcional: Indica o nome da tabela no BD
@Getter // Anotação do lombok que irá gerar todos os Get "autmaticamente"
@Setter

public class Professor {

    @Id // Indica que este atrivuto é chave primária no BD
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que será gerado pelo BD sequencialmente
    @Column(name = "cod") // Troca o nome da coluna na tabela
    private long codigo;

    @Column(length = 200, nullable = false) // Tamanho máximo do nome, e nome é obrigatório
    private String nome;

    @Column(length = 100, nullable = false, unique = true) // Não pode ter repetição de e-mail
    private String email;

    
}
