create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
	id bigint not null auto_increment,
    nome varchar(50)not null,
    tipo varchar(20)not null,
    primary key(id),
    quantidade_em_estoque bigint,
    prateleira bigint
);
insert into tb_categoria(nome,tipo,quantidade_em_estoque,prateleira)values("Tinta para cabelo 7.0","Cosmético",110,1);
insert into tb_categoria(nome,tipo,quantidade_em_estoque,prateleira)values("Mascara facial","Cosmético",70,1);
insert into tb_categoria(nome,tipo,quantidade_em_estoque,prateleira)values("Diprimax","Remédio",312,5);
insert into tb_categoria(nome,tipo,quantidade_em_estoque,prateleira)values("Paracetamol","Remédio",20,3);
insert into tb_categoria(nome,tipo,quantidade_em_estoque,prateleira)values("Creme corporal","Cosmético",120,2);
insert into tb_categoria(nome,tipo,quantidade_em_estoque,prateleira)values("Acetazolamida","Remédio",37,3);

create table tb_produto(
	id bigint not null auto_increment primary key,
    nome varchar(50)not null,
    preço float not null,
    quantidade_pedida bigint,
    id_item_estoque bigint,
    foreign key (id_item_estoque) references tb_categoria (id)
);

insert into tb_produto (nome,preço,quantidade_pedida,id_item_estoque)values("Tinta para cabelo 7.0",30.00,3,1);
insert into tb_produto (nome,preço,quantidade_pedida,id_item_estoque)values("Paracetamol",19.99,2,4);
insert into tb_produto (nome,preço,quantidade_pedida,id_item_estoque)values("Diprimax",15.00,3,3);
insert into tb_produto (nome,preço,quantidade_pedida,id_item_estoque)values("Mascara facial",60.00,2,2);
insert into tb_produto (nome,preço,quantidade_pedida,id_item_estoque)values("creme corporal",30.00,2,5);
insert into tb_produto (nome,preço,quantidade_pedida,id_item_estoque)values("Acetazolamida",110,2,6);

-- as proximas linhas procuram o item de acordo com o id informado
select tb_produto.nome, tb_produto.quantidade_pedida,tb_produto.preço, tb_categoria.quantidade_em_estoque, tb_categoria.prateleira from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_item_estoque where id_item_estoque = 1;

-- as proximas linhas procuram o item de acordo com um nome informado
select tb_produto.nome, tb_produto.quantidade_pedida,tb_produto.preço, tb_categoria.quantidade_em_estoque, tb_categoria.prateleira from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.id_item_estoque where tb_produto.nome like "%para%";


