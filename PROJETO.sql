CREATE DATABASE IF NOT EXISTS PROJETO;
USE PROJETO;

SET SQL_SAFE_UPDATES = 0;

CREATE TABLE IF NOT EXISTS Cliente(
cpf CHAR(11) NOT NULL,
nome VARCHAR(45),
email VARCHAR(45),
senha VARCHAR(45),
telefone VARCHAR(45),

PRIMARY KEY (cpf)
);

CREATE TABLE IF NOT EXISTS Pedido(
idPedido INT NOT NULL,
tipoPagamento VARCHAR(45),
valorFrete FLOAT,
prazoEntrega INT,

PRIMARY KEY (idPedido),

Cliente_cpf CHAR(11),
    
CONSTRAINT fk_Cliente_cpf_ped
	FOREIGN KEY (Cliente_cpf)
	REFERENCES PROJETO.Cliente (cpf)
		ON DELETE SET NULL
		ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS Produto(
idProduto INT NOT NULL AUTO_INCREMENT,
marca VARCHAR(45),
tecido VARCHAR(45),
quantidade INT,
preco FLOAT,

PRIMARY KEY (idProduto)
);

CREATE TABLE IF NOT EXISTS NotaFiscal(
idNotaFiscal INT NOT NULL,
dataCompra DATE,

PRIMARY KEY (idNotaFiscal),

idPedido INT,
CONSTRAINT fk_idPedido_nf
	FOREIGN KEY (idPedido)
	REFERENCES PROJETO.Pedido (idPedido)
		ON DELETE SET NULL
		ON UPDATE NO ACTION
);


CREATE TABLE IF NOT EXISTS Pedido_has_Produto(
idPedido INT,
idProduto INT,

PRIMARY KEY (idPedido, idProduto),

CONSTRAINT fk_idPedido_php
	FOREIGN KEY (idPedido)
    REFERENCES PROJETO.Pedido (idPedido)
        ON DELETE NO ACTION
		ON UPDATE NO ACTION,
        
CONSTRAINT fk_idProduto_php
	FOREIGN KEY (idProduto)
    REFERENCES PROJETO.Produto (idProduto)
        ON DELETE NO ACTION
		ON UPDATE NO ACTION
);