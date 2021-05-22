create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint not null auto_increment,
classe varchar(20)not null,
arma_principal varchar(50)not null,
primary key(id)
);
select * from tb_classe;
insert into tb_classe (id,classe,arma_principal)values(null,"Arqueiro","Arco verdejante");
insert into tb_classe (id,classe,arma_principal)values(null,"Mago","Cajado arcano");
insert into tb_classe (id,classe,arma_principal)values(null,"Guerreiro","Espada de seraphin");
insert into tb_classe (id,classe,arma_principal)values(null,"Caçador","Garras espreitadoras");

create table tb_personagem(
	id bigint not null auto_increment,
	nome_personagem varchar(50) not null,
	pontos_defesa_fisica bigint,
	pontos_defesa_magica bigint,
	pontos_ataque_fisico bigint,
	pontos_ataque_magico bigint,
	ponto_esquiva bigint,
	classe_id bigint,
	primary key(id),
	foreign key(classe_id) references tb_classe(id)
);
insert into tb_personagem (id,nome_personagem,pontos_defesa_fisica,pontos_defesa_magica,pontos_ataque_fisico,pontos_ataque_magico,ponto_esquiva,classe_id)
values(null,"Akandi",4500,3700,2200,700,200,3);
insert into tb_personagem (id,nome_personagem,pontos_defesa_fisica,pontos_defesa_magica,pontos_ataque_fisico,pontos_ataque_magico,ponto_esquiva,classe_id)
values(null,"Manká",1000,500,7000,2000,1300,4);
insert into tb_personagem (id,nome_personagem,pontos_defesa_fisica,pontos_defesa_magica,pontos_ataque_fisico,pontos_ataque_magico,ponto_esquiva,classe_id)
values(null,"Andromeda",100,500,700,6520,2300,2);
insert into tb_personagem (id,nome_personagem,pontos_defesa_fisica,pontos_defesa_magica,pontos_ataque_fisico,pontos_ataque_magico,ponto_esquiva,classe_id)
values(null,"Akandi",1200,700,3500,700,800,1);
select * from tb_personagem;

-- essa linha mostra qualquer um que tenha mais de 2000 em qualquer um dos tipos de ataque select nome_personagem, pontos_ataque_fisico, pontos_ataque_magico from tb_personagem where pontos_ataque_fisico or pontos_ataque_magico >=2000;
select nome_personagem, pontos_ataque_fisico from tb_personagem where pontos_ataque_fisico >=2000;
select nome_personagem, pontos_ataque_magico from tb_personagem where pontos_ataque_magico >=2000;

-- retorna todos que tiver entre 1000 e 2000 em qualquer tipo de defesa select nome_personagem, pontos_defesa_fisica, pontos_defesa_magica from tb_personagem where pontos_defesa_fisica or pontos_defesa_magica >1000 <2000;
select nome_personagem, pontos_defesa_fisica from tb_personagem where pontos_defesa_fisica between 1000 and 2000;
select nome_personagem, pontos_defesa_magica from tb_personagem where pontos_defesa_magica between 1000 and 2000;
update tb_personagem set nome_personagem = "Canaris" where id = 2;
select * from tb_personagem where nome_personagem like "%C%";

select tb_personagem.nome_personagem, tb_classe.classe from tb_personagem
    inner join tb_classe on tb_classe.id = tb_personagem.classe_id where tb_classe.classe = "mago";
	