drop database loja;
create database loja;
use loja;
	
CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL	,
    telefone VARCHAR(20) not null,
    email VARCHAR(100) not null,
    datanasc date,
    senha varchar(50) not null,
    ativo boolean not null
);
CREATE TABLE roupa (
    id_roupa INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
	preco DOUBLE(10, 2) NOT NULL,
	cor	varchar(20),
    descricao varchar(50)		
);
CREATE TABLE tamanho (
    id_tamanho INT AUTO_INCREMENT PRIMARY KEY,
    sigla VARCHAR(5) NOT NULL, -- Ex: P, M, G, GG
    descricao varchar(50)
);

CREATE TABLE roupa_tamanho (
    id_roupa INT,
    id_tamanho INT,
    PRIMARY KEY (id_roupa, id_tamanho),
    FOREIGN KEY (id_roupa) REFERENCES roupa(id_roupa),
    FOREIGN KEY (id_tamanho) REFERENCES tamanho(id_tamanho)
);

create table compra(
id_roupa int,
id_cliente int,
quantidade int,
PRIMARY KEY (id_roupa, id_cliente),
    FOREIGN KEY (id_roupa) REFERENCES roupa(id_roupa),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

insert into cliente (nome, cpf, telefone, email, datanasc, senha, ativo)values (
"jair","12345678910","99526881435", "jair@gmail.com", "2007-02-22", "12345", true

);
update cliente set senha = sha1(senha);
set sql_safe_updates = 0
