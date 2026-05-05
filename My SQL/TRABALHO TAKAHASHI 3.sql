-- TRABALHO DA EMPRESA AKI JOGOS --

/*

TABELAS:

-Cliente
= Id_Cliente (Chave Primária)
= CPF
= Nome_cliente
= Telefone
= Email
= Endereço_Id (Chave Estrangeira)
= Data_Cadastro_Cliente

-Endereço
= Id_Endereço
= CEP
= Rua/Avenida
= Número
= Complemento (Pode ser Nulo)

-Protudo
= Id_Produto
= Nome_Produto
= Preço_Produto
= Quantidade_Produto
= Categoria_Produto_Id (Chave Estrangeira)
= Aparelho_Produto_Id (Chave_Estrangeira)
= Data_Lançamento_Produto

-Categoria
= Id_Categoria
= Nome_Categoria
|-> Cartucho/Fita
|-> Console/Videogame
|-> Acessórios

-Aparelho
= Id_Aparelho
= Nome_Aparelho
= Data_Lançamento

-Compra
= Id_Compra
= Preço_Final_Compra
= Data_Compra
= Cliente_Id (Chave Estrangeira)

-Compra_Produto
= Id_Compra_Produto
= Quantidade_Compra_Produto
= Preço_Atual_Compra_Produto
= Compra_Id (Chave Estrangeira)
= Produto_Id (Chave Estrangeira)


VIEWS:

-Ver_Dados_Cliente
= Id_Cliente
= CPF
= Nome_cliente
= Telefone
= Email
= Endereço_Id
= Data_Cadastro_Cliente (FORMATADA para dia/mês/ano)


*/

DROP SCHEMA IF EXISTS Aki_Jogos;

CREATE SCHEMA Aki_Jogos;


CREATE TABLE Endereço (

	Id_Endereço INT PRIMARY KEY AUTO_INCREMENT,
    CEP VARCHAR(10) NOT NULL,
    Rua_Avenida VARCHAR(50) NOT NULL,
    Número INT NOT NULL,
    Complemento VARCHAR(30)
    
);


CREATE TABLE Categoria (

	Id_Categoria INT PRIMARY KEY,
    Nome_Categoria VARCHAR(30) NOT NULL
    
);


CREATE TABLE Aparelho (

	Id_Aparelho INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Aparelho VARCHAR(35) NOT NULL,
    Data_Lançamento DATE NOT NULL
    
);


CREATE TABLE Cliente (

	Id_Cliente INT PRIMARY KEY AUTO_INCREMENT,
    CPF VARCHAR(14) NOT NULL,
    Nome_Cliente VARCHAR(35) NOT NULL,
    Telefone VARCHAR(16) NOT NULL,
    Email VARCHAR(25) NOT NULL,
    FK_Endereço_Id INT NOT NULL,
    CONSTRAINT FK_Endereço_Id FOREIGN KEY (FK_Endereço_Id) REFERENCES Endereço(Id_Endereço),
    Data_Cadastro_Cliente DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Produto (

	Id_Produto INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Produto VARCHAR(100) NOT NULL,
    Preço_Produto DOUBLE NOT NULL,
    Quantidade_Produto INT NOT NULL,
    FK_Categoria_Id INT NOT NULL,
    FK_Aparelho_Id INT NOT NULL,
    CONSTRAINT FK_Categoria_Id FOREIGN KEY (FK_Categoria_Id) REFERENCES Categoria(Id_Categoria),
    CONSTRAINT FK_Aparelho_Id FOREIGN KEY (FK_Aparelho_Id) REFERENCES Aparelho(Id_Aparelho),
    Data_Lançamento_Produto  DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Compra (

	Id_Compra INT PRIMARY KEY AUTO_INCREMENT,
    Preço_Final_Compra DOUBLE NOT NULL,
    Data_Compra DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL,
    FK_Cliente_Id INT NOT NULL,
    CONSTRAINT FK_Cliente_Id FOREIGN KEY (FK_Cliente_Id) REFERENCES Cliente(Id_Cliente)
    
);

CREATE TABLE Compra_Produto (

	Id_Compra_Produto INT PRIMARY KEY AUTO_INCREMENT,
    Quantidade_Compra_Produto INT NOT NULL,
    Preço_Atual_Compra_Produto DOUBLE NOT NULL,
    FK_Compra_Id INT NOT NULL,
    FK_Produto_Id INT NOT NULL,
    CONSTRAINT FK_Compra_Id FOREIGN KEY (FK_Compra_Id) REFERENCES Compra(Id_Compra),
    CONSTRAINT FK_Produto_Id FOREIGN KEY (FK_Produto_Id) REFERENCES Produto(Id_Produto)
    
);

-- INSERTS --

INSERT INTO Endereço (CEP, Rua_Avenida, Número, Complemento)
	VALUES
    ('87060-657', 'Rua 20.081', 22, NULL),
    ('87023-106', 'Rua Sol Poente', 46, 'A casa da esquina'),
	('87045-739', 'Rua Antares', 199, NULL),
    ('87047-090', 'Rua Vila Rica', 1002, 'O APARTAMENTO VERDE, 101'),
    ('87060-706', 'Rua 44.023', 300, 'casa azul'),
    ('87013-215', 'Largo Inocente Vila Nova Júnior', 572, NULL),
    ('87035-632', 'Rua José Gancedo', 43, NULL),
    ('87047-260', 'Rua Professor Bento Fernandes Dias', 821, 'Casa Com Portão Grande'),
    ('87020-519', 'Rua Ronaldo Petrucci', 21, NULL),
    ('87043-620', 'Rua Pioneiro Joaquim dos Santos', 732, 'Cqsa com portão preto'),
    ('87060-026', 'Rua Luíza Zequim', 532, NULL),
    ('87035-620', 'Rua Pioneiro Pompílio Custódio Valério', 71, 'casa na esquina'),
    ('87047-390', 'Praça Pioneiro Bento de Freitas da Silva', 234, NULL),
    ('87024-090', 'Rua Pioneiro José Moreschi', 53, 'Apto 303'),
    ('87065-295', 'Rua Pioneiro Francisco Bim Sobrinho', 802, 'Apartamento 702'),
    ('87105-046', 'Rua Patu', 427, NULL),
    ('87047-160', 'Rua Gisele Gomes de Castro', 213, 'Casa branca do portão preto'),
    ('87047-390', 'Praça Pioneiro Bento de Freitas da Silva', 14, 'Casa com pitbull na entrada'),
    ('87023-590', 'Rua Pau d*Alho', 74, NULL),
    ('87080-370', 'Rua Pioneiro Ignácio Gomes', 85, 'CASA COM PORTÃO AMARELO');


INSERT INTO Categoria(Id_Categoria, Nome_Categoria)
	VALUES
    (1, 'Cartucho/Fita'),
    (2, 'Console/Videogame'),
    (3, 'Acessórios');
    

INSERT INTO Aparelho (Nome_Aparelho, Data_Lançamento)
	VALUES('Playstation 2', '2000-04-04');
    
    
INSERT INTO Cliente (CPF, Nome_Cliente, Telefone, Email, FK_Endereço_Id)
	VALUES
    ('630.850.479-30', 'Letícia Almeida', '(44) 92583-5521', 'Leticia1@gmail.com', 1),
    ('717.043.309-55', 'Anna Castro', '(44) 92406-0308', 'Anna2@gmail.com', 2),
    ('523.181.629-99', 'Caio de Oliveira', '(44) 92335-2321', 'Caio3@gmail.com', 3),
    ('217.518.529-03', 'André Carvalho', '(44) 92112-1176', 'Andre4@gmail.com', 4),
    ('531.404.029-88', 'Mario Barbosa', '(44) 92419-8176', 'Mario5@gmail.com', 5),
    ('692.942.699-73', 'Ricardo Maurício', '(44) 92801-0664', 'Ricardo6@gmail.com', 6),
    ('896.406.569-76', 'Andressa Barbosa', '(44) 92214-4151', 'Andressa7@gmail.com', 7),
    ('531.323.769-14', 'Leandro Dias', '(44) 93858-5589', 'Leandro8@gmail.com', 8),
    ('849.485.729-00', 'Viviane das Neves', '(44) 93213-5629', 'Viviane9@gmail.com', 9),
    ('830.336.519-33', 'Fábio Guimarães', '(44) 92159-8525', 'Fabio10@gmail.com', 10),
    ('281.233.599-85', 'João José', '(44) 93957-3115', 'Joao11@gmail.com', 11),
    ('409.349.659-51', 'Manuel de Freitas', '(44) 92234-6892', 'Manuel12@gmail.com', 12),
    ('318.713.919-11', 'Gustavo Moreira', '(44) 93986-6557', 'Gustavo13@gmail.com', 13),
    ('830.731.379-12', 'Joana de Assis', '(44) 93777-5885', 'Joana14@gmail.com', 14),
    ('260.147.189-15', 'Felipe França', '(44) 92375-1106', 'Felipe15@gmail.com', 15),
    ('675.316.349-29', 'Débora de Oliveira', '(44) 92430-4994', 'Debora16@gmail.com', 16),
    ('374.845.159-81', 'David Cordeiro', '(44) 92598-7646', 'David17@gmail.com', 17),
    ('078.545.779-86', 'Benedito da Rocha', '(44) 93294-6036', 'Benedito18@gmail.com', 18),
    ('422.912.059-19', 'Luana Bezerra', '(44) 93081-8856', 'Luana19@gmail.com', 19),
    ('983.099.959-97', 'Sílvia de Almeida', '(44) 93795-4361', 'Silvia20@gmail.com', 20);
    

INSERT INTO produto (Nome_Produto, Preço_Produto, Quantidade_Produto, FK_Categoria_Id, FK_Aparelho_Id,
	Data_Lançamento_Produto)
    VALUES ('Dragon Ball Budokai Tenkaichi 3', 50, 5, 1, 1, '2007-11-13');

INSERT INTO compra (Preço_Final_Compra, FK_Cliente_Id)
	VALUES (200, 1);
    
INSERT INTO compra_produto (Quantidade_Compra_Produto, Preço_Atual_Compra_Produto, FK_Compra_Id, FK_Produto_Id)
	VALUES (1, 50, 1, 1),
	(1, 50, 1, 1);
    
    
-- VIEWS --

DROP VIEW IF EXISTS Ver_Dados_Cliente;
DROP VIEW IF EXISTS Ver_Dados_Produto;

CREATE VIEW Ver_Dados_Cliente AS
	SELECT Id_Cliente Id, CPF, Nome_Cliente Nome, Telefone, Email,
		DATE_FORMAT(Data_Cadastro_Cliente, '%H:%i %d/%m/%Y') Data_Cadastro
		FROM cliente;

SELECT * FROM Ver_Dados_Cliente;


CREATE VIEW Ver_Dados_Produto AS
	SELECT Id_Produto Id, Nome_Produto Nome, Preço_Produto Preço, Quantidade_Produto Estoque,
		FK_Categoria_Id Categoria, FK_Aparelho_Id Console,
		DATE_FORMAT(Data_Lançamento_Produto, '%H:%i %d/%m/%Y') Data_Cadastro_Produto
		FROM produto;

SELECT * FROM Ver_Dados_Produto;


-- SELECTS --

	-- Cliente / Enderço --
SELECT c.Id_Cliente Id, c.Nome_Cliente Nome, e.CEP CEP, e.Rua_Avenida Endreço, e.Número, e.Complemento
	FROM cliente c
	JOIN endereço e
		WHERE c.FK_Endereço_Id = e.Id_Endereço;


	-- Cliente / Compra --
SELECT cl.Id_Cliente, cl.Nome_Cliente Nome, cp.Id_Compra, cp.Preço_Final_Compra Preço, cp.Data_Compra
    FROM cliente cl
    JOIN compra cp
		WHERE cl.Id_Cliente = cp.FK_Cliente_Id;


	-- Cliente / Compra / Data Compra --
SELECT cl.Id_Cliente, cl.Nome_Cliente, cop.Quantidade_Compra_Produto, cop.Preço_Atual_Compra_Produto, 
    DATE_FORMAT(Data_Compra, '%H:%i %d/%m/%Y') Data_Compra
    FROM cliente cl
    JOIN compra cp 
		ON cl.Id_Cliente = cp.FK_Cliente_Id
    JOIN compra_produto cop
		ON cp.Id_Compra = cop.FK_Compra_Id;


	-- Cliente / Soma Gastos --
SELECT cl.Id_Cliente, cl.Nome_Cliente, SUM(cop.Preço_Atual_Compra_Produto)
    FROM cliente cl
    JOIN compra cp 
		ON cl.Id_Cliente = cp.FK_Cliente_Id
    JOIN compra_produto cop
		ON cp.Id_Compra = cop.FK_Compra_Id
	GROUP BY cl.Id_Cliente;

        
-- TRIGGERS --

DROP TRIGGER IF EXISTS Deleta_Clientes;
DROP TRIGGER IF EXISTS Deleta_Produtos;


DELIMITER //

CREATE TRIGGER Deleta_Clientes
	AFTER DELETE ON cliente
    FOR EACH ROW
    
	BEGIN
        
        INSERT INTO log_cliente (Log_Id_Cliente, Log_CPF, Log_Nome_Cliente, Log_Telefone, Log_Email,
			Log_Data_Deletado_Cliente)
			VALUES 
				(Log_Id_Cliente, Log_CPF, Log_Nome_Cliente, Log_Telefone, Log_Email,
			Log_Data_Deletado_Cliente);
        
    END //
    
    
DELIMITER ;


DELIMITER //

CREATE TRIGGER Limite_Produtos
	BEFORE INSERT ON prodouto
    FOR EACH ROW
    
	BEGIN
    
		IF (COUNT(Id_Produto) < 300) THEN
			SIGNAL SQLSTATE '45000'
			SET MESSAGE_TEXT = 'Limite de Produtos Atingido';
        END IF;
        
    END //
    
    
DELIMITER ;