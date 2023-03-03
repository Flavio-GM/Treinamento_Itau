-- Criar uma nova tabela.

-- not null = não pode ser deixado sem preencher.
-- auto_increment = o proóprio BD vai gerar esses números: 1, 2, 3...
-- constraint é uma restrição (regra)
-- primary key (pk)= é uam chave primária.

use bd_itau;

create table carro (
	codigo integer not null auto_increment,
    modelo varchar(50),
    anoFabricacao integer,
    constraint pk_carro primary key (codigo)
);

-- Inserindo dados na tabela.
insert into carro values(null, 'VW Gol', 1990);
insert into carro values(null, 'Fiat Palio', 2001);
insert into carro (modelo, anoFabricacao) values ('Chevrolet Opala', 1970);
insert into carro values(null, 'Fiat Palio', 2001);

-- Exibindo todos os carros.
select * from carro;

-- Lista dos carros fabricados depois dos naos 90
select *
from carro
where anoFabricacao >= 1990 and codigo < 3
order by anoFabricacao;

-- Cria uma nova tabela relacianada com a tabela anterior
-- not null = obrigatório preencher, não pode ser nulo
-- unique = não pode ter repetição. Neste caso, cada pessoa tem um teelfone diferente
-- primary key (pk) = é uam chave primária.
-- foreign key (fk)= é uam chave estrangeira.
create table proprietario (
	codigo integer not null auto_increment,
    nome varchar(100),
    telefone varchar(20) not null unique,
    cod_carro integer,
    constraint pk_proprietario primary key (codigo),
    constraint fk_proprietario foreign key (cod_carro) references carro(codigo)
);

-- Apaga a tabela e todos os dados junto!
-- drop table proprietario;

-- Insere dados na tabela proprietario
insert into proprietario values(null, 'Gustavo', '111', 1);
insert into proprietario values(null, 'Rogério', '222', 2);
insert into proprietario values(null, 'Jonas', '333', null);

-- Listar todos os proprietários
select * from proprietario;

-- Listar os nomes dos proprietários e os nomes dos seus carros
select *
from proprietario, carro
where proprietario.cod_carro = carro.codigo;

-- Listar todos os priprietários e os nomes dos seus carros
select *
from proprietario inner join carro on proprietario.cod_carro = carro.codigo;

-- Listar todos os priprietários e os nomes dos seus carros, mesmo que
-- o proprietario não tenha carro cadastrado
-- left inclui todos os registros que estão na tabela à esquerda do join
select nome, modelo, anoFabricacao
from proprietario left join carro on proprietario.cod_carro = carro.codigo;

-- Listar todos os priprietários e os nomes dos seus carros, mesmo que
-- o carro não tenha um proprietario
-- right inclui todos os registros que estão na tabela à direita do join
select nome, modelo, anoFabricacao
from proprietario right join carro on proprietario.cod_carro = carro.codigo;

-- Listar todos os priprietários e os nomes dos seus carros, mesmo que
-- o carro não tenha um proprietario ou o proprietário não tenha carro
-- union une as duas tabelas (igual a teoria dos conjuuntos - em repetição)
select nome, modelo, anoFabricacao
from proprietario left join carro on proprietario.cod_carro = carro.codigo
union
select nome, modelo, anoFabricacao
from proprietario right join carro on proprietario.cod_carro = carro.codigo;