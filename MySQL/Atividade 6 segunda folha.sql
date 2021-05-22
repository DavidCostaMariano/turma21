create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;
create table tb_categoria
(
	id bigint auto_increment primary key,
    tipo_de_curso varchar(50) not null,
    duracao_em_meses bigint not null
);

insert into tb_categoria(tipo_de_curso, duracao_em_meses)values("Informática Basica",24);
insert into tb_categoria(tipo_de_curso, duracao_em_meses)values("Beleza",12);
insert into tb_categoria(tipo_de_curso, duracao_em_meses)values("Linguas estrangeiras",12);


create table tb_cursos
(
	id bigint auto_increment primary key,
    nome_do_curso varchar(70)not null,
    valor_do_curso bigint not null,
    certificacao boolean,
    apostilas_inclusas boolean,
    id_lista_categoria bigint,
    foreign key (id_lista_categoria) references tb_categoria(id)
);

insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Informática Basica",79.00,true,true,1);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Cabelereiro Unissex",100.00,true,true,2);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Beleza Feminina",129.99,false,true,2);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Desenvolvimento em HTML e CSS",0,false,true,1);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Desenvolvedor FullStack",79.00,true,true,1);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Manicure e Pedicure",79.00,true,true,2);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Desenvolvimento de Jogos",100.00,true,true,1);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Inglês",69.00,true,false,3);
insert into tb_cursos (nome_do_curso,valor_do_curso,certificacao,apostilas_inclusas,id_lista_categoria)values("Espanhol",69.00,true,false,3);

select * from tb_cursos where valor_do_curso >50;
select * from tb_cursos where valor_do_curso between 3 and 60;
select * from tb_cursos where nome_do_curso like "%j%";

select tb_cursos.nome_do_curso,tb_cursos.valor_do_curso,tb_cursos.certificacao,tb_categoria.tipo_de_curso, tb_categoria.duracao_em_meses from tb_cursos
	inner join tb_categoria on tb_categoria.id = tb_cursos.id_lista_categoria where tb_categoria.tipo_de_curso like "%beleza%";