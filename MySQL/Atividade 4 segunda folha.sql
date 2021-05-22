create database db_cidade_das_carnes;
use db_cidade_das_carnes;


create table tb_categoria
(
	id bigint not null auto_increment primary key,
    nome varchar (30)not null,
	tipo varchar (30)not null,
    local_de_coleta varchar (50)not null
);

insert into tb_categoria(nome,tipo,local_de_coleta)values("Alcatra","Carne","Fazenda do seu joão");
insert into tb_categoria(nome,tipo,local_de_coleta)values("Picanha","Carne","Fazenda da dona Inácia");
insert into tb_categoria(nome,tipo,local_de_coleta)values("Lombinho","Carne","Fazenda do seu Cícero");
insert into tb_categoria(nome,tipo,local_de_coleta)values("Alface","Vegetal","Horta da dona Maria");
insert into tb_categoria(nome,tipo,local_de_coleta)values("Almôndega","Carne","Fazenda do seu joão");
insert into tb_categoria(nome,tipo,local_de_coleta)values("Frango","Carne","Fazenda do seu Cícero");
insert into tb_categoria(nome,tipo,local_de_coleta)values("Tilapia","Carne","Fazenda da dona Inácia");

create table tb_produto
(
	id bigint auto_increment primary key,
    nome varchar(30),
    preço float,
    quantidade_em_kilos float,
    cortar boolean,
    id_estoque bigint,
    foreign key (id_estoque) references tb_categoria(id)
);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Alcatra",39.90,1.597,true,1);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Picanha",59.90,3.00,true,2);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Lombinho",20.00,2.240,true,3);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Alface",12.90,1.876,false,4);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Almôndega",19.99,2.329,false,5);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Frango",29.90,1.230,false,6);
insert into tb_produto(nome,preço,quantidade_em_kilos,cortar,id_estoque)values("Tilapia",13.00,2.685,false,7);

select * from tb_produto where preço >50;

select * from tb_produto where preço between  3 and 60;

select * from tb_produto where nome like "%lombi%";

-- retorna todos os produtos disponiveis que pertencem a um Tipo (CARNE OU VEGETAL)
select tb_produto.nome, tb_categoria.tipo, tb_produto.preço,tb_categoria.local_de_coleta from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.id_estoque where tb_categoria.tipo like"%vege%";
