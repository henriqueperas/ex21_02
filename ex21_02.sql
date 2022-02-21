CREATE DATABASE ex21_02
GO
USE ex21_02

CREATE TABLE tbMotorista(
Codigo_Moto		VARCHAR(100)	NOT NULL,
Nome_Moto		VARCHAR(100),
Natura_Moto		VARCHAR(100),
PRIMARY KEY(Codigo_Moto)
)
GO

CREATE TABLE tbOnibus(
Placa_Oni		VARCHAR(100)	NOT NULL,
Marca_Oni		VARCHAR(100),
Ano_Oni			INT,
Descricao_Oni	VARCHAR(100),
PRIMARY KEY(Placa_Oni)
)
GO

CREATE TABLE tbViagem(
Codigo_Via			VARCHAR(100),
Oni_Via				VARCHAR(100),
Moto_Via			VARCHAR(100),
Hora_Saida_Via		INT,
Hora_Chegada_Via	INT,
Partida_Via			VARCHAR(100),
Destino_Via			VARCHAR(100),
PRIMARY KEY(Codigo_Via,Oni_Via,Moto_Via),
FOREIGN KEY (Oni_Via) REFERENCES tbOnibus(Placa_Oni),
FOREIGN KEY (Moto_Via) REFERENCES tbMotorista(Codigo_Moto)
)
GO

INSERT INTO tbMotorista (Codigo_Moto, Nome_Moto, Natura_Moto) 
VALUES ('12341',	'Julio Cesar',	'S�o Paulo'),
('12342',	'Mario Carmo',			'Americana'),
('12343',	'Lucio Castro',			'Campinas'),
('12344',	'Andr� Figueiredo',		'S�o Paulo'),
('12345',	'Luiz Carlos',			'S�o Paulo'),
('12346',	'Carlos Roberto',		'Campinas'),
('12347',	'Jo�o Paulo',			'S�o Paulo')
GO 

INSERT INTO tbOnibus (Placa_Oni, Marca_Oni, Ano_Oni, Descricao_Oni) 
VALUES ('adf0965',	'Mercedes',	2009,	'Leito'),
('bhg7654',	'Mercedes',	2012,	'Sem Banheiro'),
('dtr2093',	'Mercedes',	2017,	'Ar Condicionado'),
('gui7625',	'Volvo',	2014,	'Ar Condicionado'),
('jhy9425',	'Volvo',	2018,	'Leito'),
('lmk7485',	'Mercedes',	2015,	'Ar Condicionado'),
('aqw2374',	'Volvo',	2014,	'Leito')
GO 

INSERT INTO tbViagem (Codigo_Via, Oni_Via, Moto_Via, Hora_Saida_Via, Hora_Chegada_Via, Partida_Via, Destino_Via) 
VALUES (101,	'adf0965',	'12343',	10,	12,	'S�o Paulo',	'Campinas'),
(102,	'gui7625',	'12341',	7,	12,	'S�o Paulo',	'Araraquara'),
(103,	'bhg7654',	'12345',	14,	22,	'S�o Paulo',	'Rio de Janeiro'),
(104,	'dtr2093',	'12344',	18,	21,	'S�o Paulo',	'Sorocaba'),
(105,	'aqw2374',	'12342',	11,	17,	'S�o Paulo',	'Ribeir�o Preto'),
(106,	'jhy9425',	'12347',	10,	19,	'S�o Paulo',	'S�o Jos� do Rio Preto'),
(107,	'lmk7485',	'12346',	13,	20,	'S�o Paulo',	'Curitiba'),
(108,	'adf0965',	'12343',	14,	16,	'Campinas',	'S�o Paulo'),
(109,	'gui7625',	'12341',	14,	19,	'Araraquara',	'S�o Paulo'),
(110,	'bhg7654',	'12345',	0,	8,	'Rio de Janeiro',	'S�o Paulo'),
(111,	'dtr2093',	'12344',	22,	1,	'Sorocaba',	'S�o Paulo'),
(112,	'aqw2374',	'12342',	19,	5,	'Ribeir�o Preto',	'S�o Paulo'),
(113,	'jhy9425',	'12347',	22,	7,	'S�o Jos� do Rio Preto',	'S�o Paulo'),
(114,	'lmk7485',	'12346',	0,	7,	'Curitiba',	'S�o Paulo')
GO 

SELECT * FROM tbMotorista
SELECT * FROM tbOnibus
SELECT * FROM tbViagem


CREATE VIEW v_motorista_onibus AS
	SELECT Codigo_Moto, Nome_Moto FROM tbMotorista
	UNION 
	SELECT Placa_Oni, Marca_Oni FROM tbOnibus
	GO

CREATE VIEW v_descricao_onibus AS
	SELECT tbOnibus.Placa_Oni, tbOnibus.Marca_Oni, tbOnibus.Ano_Oni, tbOnibus.Descricao_Oni, tbViagem.Codigo_Via 
	FROM tbOnibus
	INNER JOIN tbViagem ON
	tbOnibus.Placa_Oni = tbViagem.Oni_Via
	GO

--CREATE VIEW v_descricao_viagem AS
	--SELECT * FROM tbViagem
	--GO

--SELECT * FROM v_motorista_onibus
--SELECT * FROM v_descricao_onibus
--SELECT * FROM v_descricao_viagem

