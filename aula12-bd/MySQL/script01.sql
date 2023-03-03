
-- Isso é um comentário.

-- Cria um novo schema (Um novo Banco de Dados)
create database bd_itau;

-- Marque este banco como padrão (default).
use bd_itau;

-- Criar um nova tabela.
create table cliente (
codigo int,
nome varchar(100)
);

-- Inserindo novos dados dentro da tabela.
insert into cliente values(1, 'Rogério Silva');
insert into cliente values(2, 'Marlene Alcantara');

-- Consultando os dados da tabaela
-- * significa todas as colunas.
select * from cliente;

-- Mostra apenas os nomes
select nome from cliente;

-- Mostra os dados apenas do cliente número 1.
select * from cliente where codigo = 2;

-- Alterar os dados.
update cliente set nome = 'Malene Barros' where codigo = 2;

-- Apagando um registro (linha) que tem o codigo 2.
delete from cliente where codigo = 1;

-- Insert / Select / Update / Delete.
-- CRUD = Create / Read / Update / Delete.
