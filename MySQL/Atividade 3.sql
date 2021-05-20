create database db_escola; -- criando o banco de dados

use db_escola; -- acessando o banco de dados

-- criando a tabela
create table tb_alunos
(
	id bigint auto_increment,primary key(id),
    nome varchar(100),
    nota float (3),
    sala int,
    ano_de_estudo int
);

-- criando os valores dos campos
insert into tb_alunos (nome,nota,sala,ano_de_estudo) values("David",5,2,9);

insert into tb_alunos (nome,nota,sala,ano_de_estudo) values("Fabricio",8,2,9);

insert into tb_alunos (nome,nota,sala,ano_de_estudo) values("Aline",7,3,9);

insert into tb_alunos (nome,nota,sala,ano_de_estudo) values("Dafhne",9,1,7);

insert into tb_alunos (nome,nota,sala,ano_de_estudo) values("Elielthon",10,8,5);

select *from tb_alunos; -- exibe os dados iniciais da tabela

select * from tb_alunos where nota >7; -- busca todos os dados dos alunos que tiverem o campo nota maior que 7
select * from tb_alunos where nota <7; -- busca todos os dados dos alunos que tiverem o campo nota menor que 7

update tb_alunos set nota = 6 where id =1; -- altera a nota para 6 onde o id for igual a 1
select *from tb_alunos; -- mostra o dado atulizado