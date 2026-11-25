-- CRIACAO SCHEMA --

DROP SCHEMA IF EXISTS livraria_bairro;
CREATE SCHEMA livraria_bairro;
USE livraria_bairro;


-- CRIACAO TABELAS --

CREATE TABLE Autor (
	
    Id_Autor INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Autor VARCHAR(25) NOT NULL,
    Email VARCHAR(35)
    
);

CREATE TABLE Cliente (

	Id_Cliente INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Cliente VARCHAR(25) NOT NULL,
    Telefone VARCHAR(15) NOT NULL
    
);

CREATE TABLE Editora (
	
    Id_Editora INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Editora VARCHAR(25) NOT NULL,
    Fone VARCHAR(15)

);

CREATE TABLE Genero (

	Id_Genero INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Genero VARCHAR(35) NOT NULL
    
);

CREATE TABLE Livro (

	Id_Livro INT PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(50) NOT NULL,
    Preco FLOAT NOT NULL,
    FK_Genero_Id INT NOT NULL,
    FK_Editora_Id INT NOT NULL,
    CONSTRAINT FK_Genero_Id FOREIGN KEY (FK_Genero_Id) REFERENCES Genero(Id_Genero),
    CONSTRAINT FK_Editora_Id FOREIGN KEY (FK_Editora_Id) REFERENCES Editora(Id_Editora)
    
);

CREATE TABLE Autor_Livro (

	Id_Autor_Livro INT PRIMARY KEY AUTO_INCREMENT,
    FK_Livro_Id INT NOT NULL,
    FK_Autor_Id INT NOT NULL,
    CONSTRAINT FK_Livro_Id FOREIGN KEY (FK_Livro_Id) REFERENCES Livro(Id_Livro),
    CONSTRAINT FK_Autor_Id FOREIGN KEY (FK_Autor_Id) REFERENCES Autor(Id_Autor)
    
);

CREATE TABLE Venda (

	Id_Venda INT PRIMARY KEY AUTO_INCREMENT,
    Data_Venda DATE NOT NULL,
    Total_Venda FLOAT NOT NULL,
    FK_Cliente_Id INT NOT NULL,
    CONSTRAINT FK_Cliente_Id FOREIGN KEY (FK_Cliente_Id) REFERENCES Cliente(Id_Cliente)
    
);

CREATE TABLE Itens_Venda (

	Id_Itens_Venda INT PRIMARY KEY AUTO_INCREMENT,
    FK_Venda_Id INT NOT NULL,
    FK_Livro_Itens_Venda_Id INT NOT NULL,
	Quantidade INT NOT NULL,
    Subtotal FLOAT DEFAULT 0,
    CONSTRAINT FK_Venda_Id FOREIGN KEY (FK_Venda_Id) REFERENCES Venda(Id_Venda),
    CONSTRAINT FK_Livro_Itens_Venda_Id FOREIGN KEY (FK_Livro_Itens_Venda_Id) REFERENCES Livro(Id_Livro)
    
);


-- PREENCHIMENTO DAS TABELAS --

INSERT Autor (Nome_Autor, Email) 
	VALUES
	('Macahdo de Assis', NULL),
    ('Carlos Drumond de Andrade', NULL),
    ('Clarice Lispector', NULL),
	('Graciliano Ramos', NULL),
    ('Vinicius de Moraes', NULL),
    ('Carolina Maria de Jesus', NULL),
    ('Gregório de Matos', NULL),
    ('Gonçalves Dias', NULL),
    ('Cora Coralina', NULL),
    ('José de Alencar', NULL),
    ('Conceição Evaristo', NULL),
    ('Sérgio Vaz', 'sergio.vaz@hotmail.com'),
    ('Jarid Arraes', 'jarid.arraes@gmail.com'),
    ('Geovani Martins', 'geovani.martins@hotmail.com'),
    ('Itamar Vieira Junior', 'itamar.vieira.junior@outlook.com'),
    ('Ailton Krenak', 'ailton.krenak@hotmail.com'),
    ('Ana Martins Marques', 'ana.martins.marques@gmail.com'),
    ('Mariana Salomão Carraca', 'mariana.salomao.carraca@outlook.com'),
    ('Marcelo D´Salete ', 'marcelo.dsalete@gmail.com'),
    ('Ana Maria Machado', 'ana.maria.machado@outlook.com');
    

INSERT Cliente (Nome_Cliente, Telefone)
	VALUES
    ('Mario Roberto de Carlo', '(11) 3429-8396'),
    ('Luisa Souza De Lima', '(11) 2118-9472'),
    ('Caio Alberto Moraes', '(11) 2497-6858'),
    ('Júlia De Oliveira', '(11) 2178-1477'),
    ('Paulo Nascimento Santos', '(11) 2861-8153'),
    ('Roberta Pereira', '(11) 3776-5544'),
    ('José Antônio Rodrigues', '(11) 3215-6727'),
    ('Rafaela Dos Santos', '(11) 3621-7044'),
    ('Henrique Lima Costa', '(11) 2695-9183'),
    ('Daniela Alves', '(16) 2695-9183');
    
    
INSERT Editora (Nome_Editora, Fone)
	VALUES
    ('Companhia das Letras', '(11) 3707-3500'),
    ('Editora 34', NULL),
    ('Todavia', NULL),
    ('Editora Unesp', '(11) 3107-2623'),
    ('Darkside Books', '(21) 2556-3875');
    

INSERT Genero (Nome_Genero)
	VALUES
	('Romance'),
	('Conto'),
	('Poesia'),
	('Crônica'),
	('Ensaio'),
	('Teatro'),
	('Literatura infantil e juvenil'),
	('Diário'),
	('Quadrinhos'),
	('Jornalismo');
    

INSERT Livro (Titulo, Preco, FK_Genero_Id, FK_Editora_Id)
	VALUES
    ('Dom Casmurro', 40, 1, 3),
    ('Memórias Póstumas de Brás Cubas', 40, 1, 4),
    ('O Alienista', 37.50, 2, 2),
    ('Alguma Poesia', 41.50, 3, 5),
    ('Sentimento do Mundo', 48, 3, 1),
    ('Rosa do Povo', 65, 3, 3),
    ('A Hora da Estrela', 50, 1, 2),
    ('Água Viva', 73, 1, 4),
    ('A Paixão Segundo G.H.', 51.50, 1, 1),
    ('Vidas Secas', 35, 1, 5),
    ('S.Bernardo', 21.50, 1, 2),
    ('Agústia', 61.50, 1, 2),
    ('A Rosa de Hiroshima', 10, 3, 3),
    ('Ao Amor Serei Atento', 52.50, 3, 3),
    ('Pela Luz dos Olhos Teus', 67.50, 3, 2),
    ('Quarto de Despejo', 92.50, 8, 1),
    ('Casa de Alvenaria', 63, 8, 4),
    ('Diário de Bitita', 43.50, 8, 4),
    ('Poemas Escolhidos', 33, 3, 3),
    ('Poemas Satíricos', 35, 3, 5),
    ('Crônica do Viver Baiano Seiscentista', 139.90, 3, 5),
    ('Canção do Exílio', 99, 3, 5),
    ('I-Juca-Pirama', 55, 3, 5),
    ('Primeiros Cantos', 31.50, 3, 2),
    ('As Cocadas', 55, 7, 2),
    ('O Prato Azul-Pombinho', 50, 7, 2),
    ('Poema do Milho', 64, 3, 3),
    ('Iracema', 20.50, 1, 4),
    ('O Guarani', 50, 1, 4),
    ('Lucíola', 35, 1, 5),
	('Olhos D´Água', 32.50, 2, 5),
    ('Becos da Memória', 43.50, 1, 1),
    ('Colecionador de Pedras', 50, 3, 1),
    ('Flores da Batalha', 52.50, 3, 2),
    ('Heroinas negras Brasileiras -: em 15 cordel', 57, 3, 1),
    ('As Lendas de Dandara', 44.50, 2, 3),
    ('O Sol na Cabeça: Contos', 59.90, 2, 3),
    ('Via Ápia', 65, 1, 3),
    ('Torto Arado', 70, 1, 3),
    ('Salvar o Fogo', 76.90, 1, 1),
    ('Ideias para Adiar o Fim do Mundo', 41.50, 5, 1),
    ('A vida não é Útil', 41, 5, 2),
    ('O Livro das Semelhanças', 52, 3, 4),
    ('A Vida Submarina', 62.50, 3, 5),
    ('Se Deus me Chamar Eu não Vou', 52.50, 1, 4),
    ('Sabor Paciência', 40, 7, 4),
    ('Angola Janga', 110, 1, 4),
    ('Cumbe', 55.77, 1, 5),
    ('Menina Bonita do Laço de Fita', 37.50, 7, 1),
    ('Bisa Bia, Bisa Bel', 70, 7, 1);
    

INSERT Venda (Data_Venda, Total_Venda, FK_Cliente_Id)
	VALUES
    ('2026-01-02', 200.00, 1),
	('2026-01-03', 154.00, 2),
	('2026-01-04', 178.00, 3),
	('2026-01-05', 319.00, 4),
	('2026-01-06', 189.50, 5),
	('2026-01-07', 144.50, 6),
	('2026-01-08', 177.50, 7),
	('2026-01-09', 295.00, 8),
	('2026-01-10', 150.00, 9),
	('2026-01-11', 171.00, 10),
	('2026-01-12', 518.70, 1),
	('2026-01-13', 118.00, 2),
	('2026-01-14', 260.00, 3),
	('2026-01-15', 212.50, 4),
	('2026-01-16', 120.00, 5),
	('2026-01-17', 160.70, 6),
	('2026-01-18', 180.50, 7),
	('2026-01-19', 166.50, 8),
	('2026-01-20', 268.70, 9),
	('2026-01-21', 265.00, 10),
	('2026-01-22', 159.90, 1),
	('2026-01-23', 238.00, 2),
	('2026-01-24', 240.00, 3),
	('2026-01-25', 260.00, 4),
	('2026-01-26', 224.04, 5),
	('2026-01-27', 250.00, 6),
	('2026-01-28', 115.00, 7),
	('2026-01-29', 227.00, 8),
	('2026-01-02', 245.00, 9),
	('2026-01-03', 176.00, 10),
	('2026-01-04', 134.50, 1),
	('2026-01-05', 194.50, 2),
	('2026-01-06', 187.50, 3),
	('2026-01-07', 374.00, 4),
	('2026-01-08', 163.50, 5),
	('2026-01-09', 314.80, 6),
	('2026-01-10', 363.00, 7),
	('2026-01-11', 149.50, 8),
	('2026-01-12', 178.00, 9),
	('2026-01-13', 191.00, 10),
	('2026-01-14', 137.50, 1),
	('2026-01-15', 118.90, 2),
	('2026-01-16', 257.50, 3),
	('2026-01-17', 215.50, 4),
	('2026-01-18', 189.90, 5),
	('2026-01-19', 370.70, 6),
	('2026-01-20', 165.50, 7),
	('2026-01-21', 177.00, 8),
	('2026-01-22', 225.00, 9),
	('2026-01-23', 385.77, 10),
	('2026-01-24', 177.50, 1),
	('2026-01-25', 200.00, 2),
	('2026-01-26', 154.00, 3),
	('2026-01-27', 178.00, 4),
	('2026-01-28', 319.00, 5),
	('2026-01-29', 189.50, 6),
	('2026-01-02', 144.50, 7),
	('2026-01-03', 177.50, 8),
	('2026-01-04', 295.00, 9),
	('2026-01-05', 150.00, 10),
	('2026-01-06', 171.00, 1),
	('2026-01-07', 518.70, 2),
	('2026-01-08', 118.00, 3),
	('2026-01-09', 260.00, 4),
	('2026-01-10', 212.50, 5),
	('2026-01-11', 120.00, 6),
	('2026-01-12', 160.70, 7),
	('2026-01-13', 180.50, 8),
	('2026-01-14', 166.50, 9),
	('2026-01-15', 268.70, 10),
	('2026-01-16', 265.00, 1),
	('2026-01-17', 159.90, 2),
	('2026-01-18', 238.00, 3),
	('2026-01-19', 240.00, 4),
	('2026-01-20', 260.00, 5),
	('2026-01-21', 224.04, 6),
	('2026-01-22', 250.00, 7),
	('2026-01-23', 115.00, 8),
	('2026-01-24', 227.00, 9),
	('2026-01-25', 245.00, 10);
    
INSERT Autor_Livro (FK_Livro_Id, FK_Autor_Id)
	VALUES
    (1, 1),
    (2, 1),
    (3, 1),
    (4, 2),
    (5, 2),
    (6, 2),
    (7, 3),
    (8, 3),
    (9, 3),
    (10, 4),
    (11, 4),
    (12, 4),
    (13, 5),
    (14, 5),
    (15, 5),
    (16, 6),
    (17, 6),
    (18, 6),
    (19, 7),
    (20, 7),
    (21, 7),
    (22, 8),
    (23, 8),
    (24, 8),
    (25, 9),
    (26, 9),
    (27, 9),
    (28, 10),
    (29, 10),
    (30, 10),
	(31, 11),
    (32, 11),
    (33, 12),
	(34, 12),
    (35, 13),
    (36, 13),
    (37, 14),
    (38, 14),
    (39, 15),
    (40, 15),
    (41, 16),
    (42, 16),
    (43, 17),
    (44, 17),
    (45, 18),
    (46, 18),
    (47, 19),
    (48, 19),
    (49, 20),
    (50, 20);
    
    
    
-- SELECTS DOS ELEMENTOS --

SELECT Titulo, Nome_Genero Genero
	FROM Livro l
    INNER JOIN Genero g WHERE l.FK_Genero_Id = g.Id_Genero;
    

SELECT Nome_Autor, COUNT(FK_Autor_Id)
	FROM Autor
    INNER JOIN Autor_Livro WHERE Id_Autor = FK_Autor_Id
    GROUP BY Nome_Autor, FK_Autor_Id;
    

SELECT Nome_Autor, Titulo
	FROM Autor a
    INNER JOIN Livro l
    INNER JOIN Autor_Livro al WHERE al.FK_Autor_Id = a.Id_Autor && al.FK_Livro_Id = l.Id_Livro;
    

SELECT Nome_Cliente, ROUND(SUM(Total_Venda), 2) Fatura
	FROM Cliente c
    INNER JOIN Venda v WHERE v.FK_Cliente_Id = c.Id_Cliente
    GROUP BY Nome_Cliente
    ORDER BY Fatura DESC;
    
    
SELECT Titulo, Preco
	FROM Livro 
    WHERE Preco > (
		SELECT AVG(Preco)
			FROM Livro
	);