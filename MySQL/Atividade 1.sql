create database db_rh; -- criando o banco de dados

use db_rh; -- acessando o banco de dados


create table tb_funcionarios -- criando a tabela
(
	id bigint auto_increment,
    nome varchar(70) not null,
    carteira_de_trabalho bigint,
    carga_horaria int not null,
    salario float not null,
    primary key(id)
);
-- preenchendo os dados necessarios
insert into tb_funcionarios(nome, carteira_de_trabalho, carga_horaria, salario) values ("Rogerio",34586,50,1500);
insert into tb_funcionarios(nome, carteira_de_trabalho, carga_horaria, salario) values ("Amanda",04587,44,1459.28);
insert into tb_funcionarios(nome, carteira_de_trabalho, carga_horaria, salario) values ("David",98463,50,1458.20);
insert into tb_funcionarios(nome, carteira_de_trabalho, carga_horaria, salario) values ("Rebeca",50526,55,1630);
insert into tb_funcionarios(nome, carteira_de_trabalho, carga_horaria, salario) values ("Ednaldo",51005,60,1800);

select * from tb_funcionarios; -- mostrando todos os dados iniciais

update tb_funcionarios set salario = 2300 where id = 1; -- alterando o salario por que ja havia criado menor que 2000
update tb_funcionarios set salario = 2400 where id = 3; -- alterando o salario por que ja havia criado menor que 2000

select * from tb_funcionarios where salario > 2000; -- funcionarios que recebem mais que 2000 reais
select * from tb_funcionarios where salario < 2000; -- funcionarios que recebem menos de 2000 reais

update tb_funcionarios set salario = 1900 where id = 3; -- alterando um dado na tabela
 -- mostrando os dados novamente



