create database db_ecommerce;

use  db_ecommerce;

create table tb_produtos
(
	id bigint auto_increment,primary key(id),
    nome varchar(255),
    descricao varchar(1000),
    sobre varchar(255),
    preco float,
	imagem varchar(100)
);


insert into tb_produtos (nome, descricao, sobre, preco, imagem) values ("Longboard Skull ABEC 15","Com um rolamento ABEC 15 você será capaz de rachar sua cabeça caindo com esse skate!! 
Esteja pronto para altas aventuras","ABEC 15. 9 CAMADAS DE MARFIM. TRUCK PARA ATÉ 200 QUILOS",699,"#");

insert into tb_produtos (nome, descricao, sobre, preco, imagem) values ("Street","Contando com as rodinhas de osso importadas e oito camadas de madeira este é o skate perfeito para você
que gosta de fazer manobras radicais!!","7 CAMADAS DE MARFIM E 1 DE VIDRO TEMPERADO. TRUCK PARA ATÉ 149 QUILOS",499,"#");

insert into tb_produtos (nome, descricao, sobre, preco, imagem) values ("Longboard Roses ABEC 5 ","Este é um Longboard que conta com um rolamento mais baixo afim de proporcionar uma boa
experiencia para o usuário levando bem menos perigo para os menos experientes!!","ABEC 5. MACIEZ DA RODA 82A 8 CAMADAS DE MARFIM. TRUCK PARA ATÉ 170 QUILOS",359,"#");

insert into tb_produtos (nome, descricao, sobre, preco, imagem) values ("Skate cruiser","Voltado para o publico adulto nós trouxemos o Skate cruiser perfeito para você que gosta de estilo
e conforto ao andar pelas ruas","2 CM DE PLASTICO REFORÇADO CAPAZ DE AGUENTAR 120 QUILOS",272,"#");

insert into tb_produtos (nome, descricao, sobre, preco, imagem) values ("Skate Longboard Bel Sports","Esse é pra você que gosta de um skate enorme!! Conta com mais de 1 metro de comprimento
e um ABEC 5 para o seu maior conforto e segurança","ABEC 5. TRUCK PARA 140 QUILOS. NOVA ESTAMPA NO MERCADO",242,"#");

select * from tb_produtos where preco >500;
select * from tb_produtos where preco <500;
update tb_produtos set preco = 620 where id = 2;
select * from tb_produtos;