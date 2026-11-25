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

-- DROP SCHEMA IF EXISTS Aki_Jogos; --

-- CREATE SCHEMA Aki_Jogos; --


-- TABELAS --

CREATE TABLE Endereço (

	Id_Endereço INT PRIMARY KEY AUTO_INCREMENT,
    CEP VARCHAR(10) NOT NULL,
    Rua_Avenida VARCHAR(50) NOT NULL,
    Número INT NOT NULL,
    Complemento VARCHAR(40)
    
);


CREATE TABLE Categoria (

	Id_Categoria INT PRIMARY KEY,
    Nome_Categoria VARCHAR(30) NOT NULL
    
);


CREATE TABLE Aparelho (

	Id_Aparelho INT PRIMARY KEY AUTO_INCREMENT,
    Nome_Aparelho VARCHAR(150) NOT NULL,
    Data_Lançamento DATE NOT NULL
    
);


CREATE TABLE Cliente (

	Id_Cliente INT PRIMARY KEY AUTO_INCREMENT,
    CPF VARCHAR(14) UNIQUE NOT NULL,
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
    Preço_Produto DECIMAL(10, 2) NOT NULL,
    Quantidade_Estoque_Produto INT NOT NULL,
    FK_Categoria_Id INT NOT NULL,
    FK_Aparelho_Id INT NOT NULL,
    CONSTRAINT FK_Categoria_Id FOREIGN KEY (FK_Categoria_Id) REFERENCES Categoria(Id_Categoria),
    CONSTRAINT FK_Aparelho_Id FOREIGN KEY (FK_Aparelho_Id) REFERENCES Aparelho(Id_Aparelho),
    Data_Lançamento_Produto  DATE NOT NULL
    
);


CREATE TABLE Compra (

	Id_Compra INT PRIMARY KEY AUTO_INCREMENT,
    Preço_Final_Compra DECIMAL(10, 2) NOT NULL,
    FK_Cliente_Id INT NOT NULL,
    CONSTRAINT FK_Cliente_Id FOREIGN KEY (FK_Cliente_Id) REFERENCES Cliente(Id_Cliente),
    Data_Compra DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);

CREATE TABLE Compra_Produto (

	Id_Compra_Produto INT PRIMARY KEY AUTO_INCREMENT,
    Quantidade_Compra_Produto INT NOT NULL,
    Preço_Atual_Compra_Produto DECIMAL(10, 2) NOT NULL,
    FK_Compra_Id INT NOT NULL,
    FK_Produto_Id INT NOT NULL,
    CONSTRAINT FK_Compra_Id FOREIGN KEY (FK_Compra_Id) REFERENCES Compra(Id_Compra),
    CONSTRAINT FK_Produto_Id FOREIGN KEY (FK_Produto_Id) REFERENCES Produto(Id_Produto)
    
);


-- TABELAS DE LOG --

CREATE TABLE Log_Endereço (

	Log_Id_Endereço INT PRIMARY KEY,
    Log_CEP VARCHAR(10) NOT NULL,
    Log_Rua_Avenida VARCHAR(50) NOT NULL,
    Log_Número INT NOT NULL,
    Log_Complemento VARCHAR(40),
	Log_Deleta_Endereço DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Log_Categoria (

	Log_Id_Categoria INT PRIMARY KEY,
    Log_Nome_Categoria VARCHAR(30) NOT NULL,
	Log_Deleta_Categoria DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Log_Aparelho (

	Log_Id_Aparelho INT PRIMARY KEY,
    Log_Nome_Aparelho VARCHAR(35) NOT NULL,
    Log_Deleta_Aparelho DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Log_Cliente (

	Log_Id_Cliente INT PRIMARY KEY,
    Log_CPF VARCHAR(14) UNIQUE NOT NULL,
    Log_Nome_Cliente VARCHAR(35) NOT NULL,
    Log_Telefone VARCHAR(16) NOT NULL,
    Log_Email VARCHAR(25) NOT NULL,
    Log_Deleta_Cliente DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Log_Produto (

	Log_Id_Produto INT PRIMARY KEY,
    Log_Nome_Produto VARCHAR(100) NOT NULL,
    Log_Preço_Produto DECIMAL(10, 2) NOT NULL,
    Log_Quantidade_Estoque_Produto INT NOT NULL,
    Log_Deleta_Produto  DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


CREATE TABLE Log_Compra (

	Log_Id_Compra INT PRIMARY KEY,
    Log_Preço_Final_Compra DECIMAL(10, 2) NOT NULL,
    Log_Deleta_Compra DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);

CREATE TABLE Log_Compra_Produto (

	Log_Id_Compra_Produto INT PRIMARY KEY,
    Log_Quantidade_Compra_Produto INT NOT NULL,
    Log_Preço_Atual_Compra_Produto DECIMAL(10, 2) NOT NULL,
	Log_Deleta_Compra_Produto DATETIME DEFAULT (CURRENT_TIMESTAMP) NOT NULL
    
);


DROP TRIGGER IF EXISTS Preço_Atual_Igual;

DELIMITER //

CREATE TRIGGER Preço_Atual_Igual
	BEFORE INSERT ON Compra_Produto
    FOR EACH ROW
    
	BEGIN
        
		SET NEW.Preço_Atual_Compra_Produto = 
        (
        
			SELECT Preço_Produto
			FROM Produto
			WHERE Id_Produto = NEW.FK_Produto_Id
            
		);

        
    END //
    
    
DELIMITER ;


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
    ('87080-370', 'Rua Pioneiro Ignácio Gomes', 85, 'CASA COM PORTÃO AMARELO'),
    ('87025-490', 'Rua Ivinhema', 216, 'Casa Laranja'),
    ('87080-605', 'Rua Caqui', 12, NULL),
    ('87060-110', 'Rua dos Ipês', 43, 'Apto 102'),
    ('87047-500', 'Rua Eloy Victor de Melo', 142, 'Casá brnca'),
    ('87030-270', 'Rua Córdoba', 765, NULL),
    ('87060-535', 'Rua Antônio José Perez Corrêa', 67, 'Apartamento azul'),
    ('87047-721', 'Rua 36.595', 1329, 'Casa GRANDE'),
    ('87053-205', 'Rua José Nunes da Silva Ferraz', 458, NULL),
    ('87015-001', 'Avenida Doutor Luiz Teixeira Mendes', 23, 'portão azul'),
    ('87083-276', 'Rua Jaspe', 94, 'a casa do telhado preto'),
    ('87069-000', 'Avenida 61.019', 905, NULL),
    ('87060-662', 'Rua Pioneiro Olímpio Forcelli', 48, NULL),
    ('87040-340', 'Travessa Fortaleza', 278, 'casa Amarela, com a letra A Desenhada'),
    ('87083-881', 'Rua 48.012', 678, 'C4sa com cachorro bravo'),
    ('87070-800', 'Rua Pioneiro Aquino Cantagalli', 437, 'Apartamento número 103'),
    ('87065-360', 'Rua Avenca', 326, 'Apartamento 112'),
    ('87047-110', 'Rua Tomás Antônio Gonzaga', 723, 'Casa roxa'),
    ('87083-323', 'Avenida Pioneiro Antônio Franco de Morais', 621, NULL),
    ('87083-275', 'Rua Lazurita', 287, NULL),
    ('87083-080', 'Praça Reinaldo Guanaes Bittencourt Filho', 732, 'Apto 502'),
    ('87020-670', 'Viela Pioneiro Domingos Marcote', 27, 'Casa A'),
    ('87025-530', 'Rua Sebastião de Paula e Silva', 48, 'casa da esquina'),
    ('87053-300', 'Rua Monsueto', 29, NULL),
    ('87060-663', 'Rua Maria Jacira Aparecida Martins', 82, NULL),
    ('87060-705', 'Rua Izabel Fernandes Cano', 7, 'Kitnet 3'),
    ('87070-778', 'Rua Vereador Philemon de Assis Vieira', 127, 'APTO 701'),
    ('87060-610', 'Rua das Papoulas', 293, NULL),
    ('87075-560', 'Rua Pioneira Ana Pastori Buzzo', 38, NULL),
    ('87035-130', 'Praça Maestro Aniceto Matti', 833, 'apto 19'),
    ('87035-160', 'Rua Hipócrates', 458, 'casa do portão de grade preta');


INSERT INTO Categoria(Id_Categoria, Nome_Categoria)
	VALUES
    (1, 'Cartucho/Fita'),
    (2, 'Acessórios'),
    (3, 'Consoles');
    

INSERT INTO Aparelho (Nome_Aparelho, Data_Lançamento)
	VALUES
	('PlayStation 1', '1994-12-03'),
	('PocketStation', '1999-01-23'),
	('PlayStation 2', '2000-04-04'),
	('PSP (PlayStation Portable)', '2004-12-12'),
	('PlayStation 3', '2006-11-11'),
	('PSP Go', '2009-10-01'),
	('PS Vita (PlaStation Vita)', '2011-12-17'),
	('PlayStation 4', '2013-11-15'),
	('PlayStation VR (Virtual Reality)', '2016-10-13'),
	('PlayStation Classic', '2018-12-03'),
	('PlayStation 5', '2020-11-19'),
	('PlayStation VR 2', '2023-02-22'),
	('Xbox', '2001-11-15'),
	('Xbox 360', '2005-11-22'),
	('Xbox One', '2013-11-22'),
	('Xbox One S', '2016-08-02'),
	('Xbox One X', '2017-11-07'),
	('Xbox Series S', '2020-11-10'),
	('Xbox Series X', '2020-11-10'),
	('Color TV-Game', '1977-06-01'),
	('Game & Watch', '1980-07-15'),
	('NES (Nintendo Entertaiment System)', '1983-07-15'),
	('Game Boy', '1989-04-21'),
	('SNES (Super Nintendo Entertaiment System)', '1990-11-21'),
	('Vitual Boy', '1995-07-21'),
	('Nintendo 64', '1996-06-23'),
	('Game Boy Color', '1998-10-21'),
	('Game Boy Advance', '2001-03-21'),
	('Nintendo GameCube', '2001-09-14'),
	('Game Boy Advance SP', '2003-02-14'),
	('Nintendo DS (Dual Screen)', '2004-11-21'),
	('Game Boy Micro', '2005-09-13'),
	('Nintendo DS Lite', '2006-03-02'),
	('Nintendo Wii', '2006-11-19'),
	('Nintendo DSi (Dual Screen Individual)', '2008-11-01'),
	('Nintendo DSi XL/LL(Extra Large)', '2010-11-21'),
	('Nintendo 3DS', '2011-02-26'),
	('Nintendo Wii U', '2012-12-18'),
	('Nintendo 2DS', '2013-10-12'),
	('New Nintendo 3DS', '2014-10-11'),
	('Nintendo Switch', '2017-03-03'),
	('Nintendo Switch 2', '2025-06-05'),
	('Atari 2600', '1977-09-11'),
	('Intellivision', '1979-12-03'),
	('Sega SG-1000', '1983-07-15'),
	('Sega Mark III', '1985-10-20'),
	('Sega Master System', '1985-10-20'),
	('Master System TecToy', '1989-09-04'),
	('Sega Mega Drive', '1988-10-29'),
	('Sega Genesis', '1989-08-14'),
	('Mega Drive II', '1993-04-23'),
	('Sega CD', '1991-12-12'),
	('Mega-CD', '1991-12-12'),
	('Sega 32X', '1994-11-21'),
	('Sega Saturn', '1994-11-22'),
	('Sega Dreamcast', '1998-11-27'),
	('Atari Lynx', '1989-09-01'),
	('Atari Jaguar', '1993-11-23'),
	('Atari Jaguar CD', '1995-09-21'),
	('Atari VCS', '2021-06-15');
    
    
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
    ('983.099.959-97', 'Sílvia de Almeida', '(44) 93795-4361', 'Silvia20@gmail.com', 20),
    ('839.967.739-60', 'Diogo Sales', '(44) 93171-5366', 'Diogo21@gmail.com', 21),
    ('860.769.089-20', 'Marlene Morais', '(44) 92133-0707', 'Marlene22@gmail.com', 22),
    ('610.484.019-10', 'Alan Bezerra', '(44) 92825-4787', 'Alan23@gmai.com', 23),
    ('348.075.219-50', 'Wilson Correia', '(44) 93556-6650', 'Wilson24@gmail.com', 24),
    ('227.654.199-73', 'Vitória dos Reis', '(44) 93857-8310', 'Vitoria25@gmail.com', 25),
    ('387.384.809-05', 'Alex de Almeida', '(44) 92610-1906', 'Alex26@gmail.com', 26),
    ('308.162.979-91', 'Carlos de Carvalho', '(44) 92424-3571', 'Carlos27@gmail.com', 27),
    ('328.498.319-80', 'Jeferson de Moura', '(44) 92557-9276', 'Jeferson28@gmail.com', 28),
    ('707.000.369-20', 'Renan da Rosa', '(44) 93488-0485', 'Renan29@gmail.com', 29),
    ('716.383.679-14', 'Wilson Soares', '(44) 93103-2103', 'Wilson30@gmail.com', 30),
    ('453.183.429-14', 'Andréia Pinheiro', '(44) 92792-2056', 'Andreia31@gmail', 31),
    ('473.544.459-91', 'Jéssica Duarte', '(44) 92772-7378', 'Jessica32@gmail.com', 32),
    ('217.920.529-52', 'Sofia de Sousa', '(44) 92744-6255', 'Sofia33@gmail.com', 33),
    ('770.895.539-49', 'Pablo de Moura', '(44) 93836-5547', 'Pablo34@gmail.com', 34),
    ('121.150.259-70', 'Joaquim Alves', '(44) 93332-5916', 'Joaquim35@gmail.com', 35),
    ('193.004.419-49', 'Leonardo da Rosa', '(44) 92888-6564', 'Leonardo36@gmail.com', 36),
    ('456.275.869-40', 'Isabela Miranda', '(44) 93657-0573', 'Isabela37@gmail.com', 37),
    ('419.232.489-01', 'Alex Neto', '(44) 92178-5871', 'Alex38@gmail.com', 38),
    ('749.602.869-03', 'Cícero Silveira', '(44) 93227-2262', 'Cicero39@gmail.com', 39),
    ('887.684.509-74', 'Aparecida Batista', '(44) 93769-2489', 'Aparecida40@gmail.com', 40),
    ('284.039.489-80', 'Mário de Azevedo', '(44) 92765-8642', 'Mario41@gmail.com', 41),
    ('818.636.019-02', 'Renata Santana', '(44) 92510-8279', 'Renata42@gmail.com', 42),
    ('633.876.619-24', 'Tatiane Silveira', '(44) 92051-5068', 'Tatiane43@gmail.com', 43),
    ('836.398.059-50', 'Wilson Garcia', '(44) 93382-1420', 'Wilson44@gmail.com', 44),
    ('548.692.609-05', 'Thaís Mendes', '(44) 92749-8271', 'Thais45@gmail.com', 45),
    ('583.030.479-14', 'Vanessa de Freitas', '(44) 92272-3916', 'Vanessa46@gmail.com', 46),
    ('362.077.199-56', 'Marlene de Brito', '(44) 92488-7192', 'Marlene47@gmail.com', 47),
    ('585.401.519-60', 'Daniela Tavares', '(44) 92882-4217', 'Daniela48@gmail.com', 48),
    ('293.396.689-10', 'Tatiane do Nascimento', '(44) 92329-2937', 'Tatiane49@gmail.com', 49),
    ('151.633.169-90', 'Mônica Morais', '(44) 93348-6457', 'Monica50@gamil.com', 50);
    

INSERT INTO Produto (Nome_Produto, Preço_Produto, Quantidade_Estoque_Produto, FK_Categoria_Id, 
	FK_Aparelho_Id, Data_Lançamento_Produto)
    VALUES
		('PlayStation 1', 650.00, 4, 3, 1, '1994-12-03'),
		('PocketStation', 575.00, 4, 3, 2, '1999-01-23'),
		('PlayStation 2', 375.00, 4, 3, 3, '2000-04-04'),
		('PSP (PlayStation Portable)', 700.00, 4, 3, 4, '2004-12-12'),
		('PlayStation 3', 900.00, 4, 3, 5, '2006-11-11'),
		('PSP Go', 800.00, 4, 3, 6, '2009-10-01'),
		('PS Vita (PlaStation Vita)', 1700.00, 4, 3, 7, '2011-12-17'),
		('PlayStation 4', 1900.00, 4, 3, 8, '2013-11-15'),
		('PlayStation VR (Virtual Reality)', 2912.5, 4, 3, 9, '2016-10-13'),
		('PlayStation Classic', 885.00, 4, 3, 10, '2018-12-03'),
		('PlayStation 5', 5675.00, 4, 3, 11, '2020-11-19'),
		('PlayStation VR 2', 3200.00, 4, 3, 12, '2023-02-22'),
		('Xbox', 1650.00, 4, 3, 13, '2001-11-15'),
		('Xbox 360', 650.00, 4, 3, 14, '2005-11-22'),
		('Xbox One', 1850.00, 4, 3, 15, '2013-11-22'),
		('Xbox One S', 1475.00, 4, 3, 16, '2016-08-02'),
		('Xbox One X', 2050.00, 4, 3, 17, '2017-11-07'),
		('Xbox Series S', 3100.00, 4, 3, 18, '2020-11-10'),
		('Xbox Series X', 4650.00, 4, 3, 19, '2020-11-10'),
		('Color TV-Game', 1590.00, 4, 3, 20, '1977-06-01'),
		('Game & Watch', 1900.00, 4, 3, 21, '1980-07-15'),
		('NES (Nintendo Entertaiment System)', 2750.00, 4, 3, 22, '1983-07-15'),
		('Game Boy', 1250.00, 4, 3, 23, '1989-04-21'),
		('SNES (Super Nintendo Entertaiment System)', 900.00, 4, 3, 24, '1990-11-21'),
		('Vitual Boy', 5500.00, 4, 3, 25, '1995-07-21'),
		('Nintendo 64', 925.00, 4, 3, 26, '1996-06-23'),
		('Game Boy Color', 1750.00, 4, 3, 27, '1998-10-21'),
		('Game Boy Advance', 1489.00, 4, 3, 28, '2001-03-21'),
		('Nintendo GameCube', 1600.00, 4, 3, 29, '2001-09-14'),
		('Game Boy Advance SP', 1325.00, 4, 3, 30, '2003-02-14'),
		('Nintendo DS (Dual Screen)', 425.00, 4, 3, 31, '2004-11-21'),
		('Game Boy Micro', 2250.00, 4, 3, 32, '2005-09-13'),
		('Nintendo DS Lite', 450.00, 4, 3, 33, '2006-03-02'),
		('Nintendo Wii', 625.00, 4, 3, 34, '2006-11-19'),
		('Nintendo DSi (Dual Screen Individual)', 550.00, 4, 3, 35, '2008-11-01'),
		('Nintendo DSi XL/LL(Extra Large', 875.00, 4, 3, 36, '2010-11-21'),
		('Nintendo 3DS', 3500.00, 4, 3, 37, '2011-02-26'),
		('Nintendo Wii U', 1225.00, 4, 3, 38, '2012-12-18'),
		('Nintendo 2DS', 1050.00, 4, 3, 39, '2013-10-12'),
		('New Nintendo 3DS', 2100.00, 4, 3, 40, '2014-10-11'),
		('Nintendo Switch', 3000.00, 4, 3, 41, '2017-03-03'),
		('Nintendo Switch 2', 4650.00, 4, 3, 42, '2025-06-05'),
		('Atari 2600', 1100.00, 4, 3, 43, '1977-09-11'),
		('Intellivision', 2000.00, 4, 3, 44, '1979-12-03'),
		('Sega SG-1000', 5250.00, 4, 3, 45, '1983-07-15'),
		('Sega Mark III', 2750.00, 4, 3, 46, '1985-10-20'),
		('Sega Master System', 750.00, 4, 3, 47, '1985-10-20'),
		('Master System TecToy', 750.00, 4, 3, 48, '1989-09-04'),
		('Sega Mega Drive', 1125.00, 4, 3, 49, '1988-10-29'),
		('Sega Genesis', 1400.00, 4, 3, 50, '1989-08-14'),
		('Mega Drive II', 850.00, 4, 3, 51, '1993-04-23'),
		('Sega CD', 2500.00, 4, 3, 52, '1991-12-12'),
		('Mega-CD', 1850.00, 4, 3, 53, '1991-12-12'),
		('Sega 32X', 1400.00, 4, 3, 54, '1994-11-21'),
		('Sega Saturn', 1650.00, 4, 3, 55, '1994-11-22'),
		('Sega Dreamcast', 1750.00, 4, 3, 56, '1998-11-27'),
		('Atari Lynx', 2250.00, 4, 3, 57, '1989-09-01'),
		('Atari Jaguar', 4000.00, 4, 3, 58, '1993-11-23'),
		('Atari Jaguar CD', 8000.00, 4, 3, 59, '1995-09-21'),
		('Atari VCS', 4400.00, 4, 3, 60, '2021-06-15'),
		('Dragon Ball Budokai Tenkaichi 3', 50.00, 5, 1, 1, '2007-11-13'),
		('Gran Turismo', 150.00, 10, 1, 1, '1997-12-23'),
		('Final Fantasy VII', 180.00, 5, 1, 1, '1997-01-31'),
		('Metal Gear Solid', 160.00, 8, 1, 1, '1998-09-03'),
		('Crash Bandicoot', 120.00, 15, 1, 1, '1996-09-09'),
		('Resident Evil 2', 140.00, 12, 1, 1, '1998-01-21'),
		('Tekken 3', 110.00, 20, 1, 1, '1998-03-26'),
		('Tomb Raider', 130.00, 10, 1, 1, '1996-10-25'),
		('Castlevania: Symphony of the Night', 250.00, 3, 1, 1, '1997-03-20'),
		('Silent Hill', 200.00, 4, 1, 1, '1999-01-31'),
		('Spyro the Dragon', 130.00, 14, 1, 1, '1998-09-09'),
		('Doko Demo Issyo', 80.00, 5, 1, 2, '1999-07-22'),
		('Chocobo World (Final Fantasy VIII)', 60.00, 8, 1, 2, '1999-02-11'),
		('Crash Bandicoot: Warped (Mini-games)', 50.00, 10, 1, 2, '1998-10-31'),
		('Ape Escape (Mini-games)', 55.00, 12, 1, 2, '1999-05-31'),
		('Ridge Racer Type 4 (Mini-games)', 65.00, 7, 1, 2, '1998-12-03'),
		('Street Fighter Alpha 3 (Treinamento)', 70.00, 9, 1, 2, '1998-12-23'),
		('Legend of Mana (Ring Ring Land)', 75.00, 6, 1, 2, '1999-07-15'),
		('Monster Rancher 2 (Mini-games)', 60.00, 10, 1, 2, '1999-02-25'),
		('JoJo''s Bizarre Adventure (Mini-games)', 85.00, 4, 1, 2, '1999-10-14'),
		('Metal Gear Solid: Integral (Missões)', 90.00, 5, 1, 2, '1999-06-24'),
		('Grand Theft Auto: San Andreas', 100.00, 30, 1, 3, '2004-10-26'),
		('Grand Theft Auto: Vice City', 90.00, 25, 1, 3, '2002-10-29'),
		('Gran Turismo 3: A-Spec', 80.00, 18, 1, 3, '2001-04-28'),
		('Gran Turismo 4', 85.00, 15, 1, 3, '2004-12-28'),
		('Final Fantasy X', 120.00, 12, 1, 3, '2001-07-19'),
		('God of War', 110.00, 14, 1, 3, '2005-03-22'),
		('God of War II', 115.00, 10, 1, 3, '2007-03-13'),
		('Metal Gear Solid 3: Snake Eater', 140.00, 8, 1, 3, '2004-11-17'),
		('Shadow of the Colossus', 160.00, 5, 1, 3, '2005-10-18'),
		('Resident Evil 4', 130.00, 11, 1, 3, '2005-10-25'),
		('Grand Theft Auto: Liberty City Stories', 90.00, 20, 1, 4, '2005-10-24'),
		('Monster Hunter Freedom Unite', 100.00, 15, 1, 4, '2008-03-27'),
		('Daxter', 70.00, 12, 1, 4, '2006-03-14'),
		('God of War: Chains of Olympus', 85.00, 18, 1, 4, '2008-03-04'),
		('Grand Theft Auto: Vice City Stories', 95.00, 14, 1, 4, '2006-10-31'),
		('Crisis Core: Final Fantasy VII', 120.00, 10, 1, 4, '2007-09-13'),
		('Metal Gear Solid: Peace Walker', 110.00, 9, 1, 4, '2010-04-29'),
		('Lumines', 60.00, 8, 1, 4, '2004-12-12'),
		('Patapon', 65.00, 11, 1, 4, '2007-12-20'),
		('Persona 3 Portable', 180.00, 5, 1, 4, '2009-11-01'),
		('The Last of Us', 90.00, 25, 1, 5, '2013-06-14'),
		('Grand Theft Auto V', 100.00, 30, 1, 5, '2013-09-17'),
		('Uncharted 2: Among Thieves', 80.00, 20, 1, 5, '2009-10-13'),
		('Uncharted 3: Drake''s Deception', 75.00, 18, 1, 5, '2011-11-01'),
		('Metal Gear Solid 4: Guns of the Patriots', 85.00, 15, 1, 5, '2008-06-12'),
		('Gran Turismo 5', 70.00, 22, 1, 5, '2010-11-24'),
		('Red Dead Redemption', 110.00, 12, 1, 5, '2010-05-18'),
		('God of War III', 95.00, 14, 1, 5, '2010-03-16'),
		('Demon''s Souls', 150.00, 8, 1, 5, '2009-02-05'),
		('Journey', 60.00, 10, 1, 5, '2012-03-13'),
		('Persona 4 Golden', 160.00, 8, 1, 7, '2012-06-14'),
		('Uncharted: Golden Abyss', 100.00, 12, 1, 7, '2011-12-17'),
		('Killzone: Mercenary', 90.00, 10, 1, 7, '2013-09-04'),
		('Gravity Rush', 110.00, 9, 1, 7, '2012-02-09'),
		('Tearaway', 85.00, 7, 1, 7, '2013-11-20'),
		('Soul Sacrifice', 75.00, 11, 1, 7, '2013-03-07'),
		('Danganronpa: Trigger Happy Havoc', 130.00, 6, 1, 7, '2014-02-11'),
		('LittleBigPlanet PS Vita', 80.00, 14, 1, 7, '2012-09-19'),
		('Freedom Wars', 70.00, 10, 1, 7, '2014-06-26'),
		('Ys VIII: Lacrimosa of DANA', 150.00, 5, 1, 7, '2016-07-21'),
		('Grand Theft Auto V', 120.00, 40, 1, 8, '2014-11-18'),
		('Red Dead Redemption 2', 150.00, 25, 1, 8, '2018-10-26'),
		('God of War', 130.00, 30, 1, 8, '2018-04-20'),
		('Marvel''s Spider-Man', 110.00, 28, 1, 8, '2018-09-07'),
		('The Witcher 3: Wild Hunt', 100.00, 20, 1, 8, '2015-05-19'),
		('Horizon Zero Dawn', 90.00, 22, 1, 8, '2017-02-28'),
		('Uncharted 4: A Thief''s End', 85.00, 24, 1, 8, '2016-05-10'),
		('Bloodborne', 140.00, 15, 1, 8, '2015-03-24'),
		('The Last of Us Remastered', 80.00, 35, 1, 8, '2014-07-29'),
		('Ghost of Tsushima', 160.00, 18, 1, 8, '2020-07-17'),
		('Beat Saber', 150.00, 15, 1, 9, '2018-11-20'),
		('Astro Bot Rescue Mission', 120.00, 10, 1, 9, '2018-10-02'),
		('Resident Evil 7: Biohazard (VR)', 130.00, 12, 1, 9, '2017-01-24'),
		('Superhot VR', 100.00, 20, 1, 9, '2017-07-19'),
		('Blood & Truth', 110.00, 8, 1, 9, '2019-05-28'),
		('Moss', 90.00, 11, 1, 9, '2018-02-27'),
		('The Elder Scrolls V: Skyrim VR', 140.00, 14, 1, 9, '2017-11-17'),
		('Job Simulator', 80.00, 18, 1, 9, '2016-10-13'),
		('Firewall Zero Hour', 95.00, 9, 1, 9, '2018-08-28'),
		('Tetris Effect', 125.00, 7, 1, 9, '2018-11-09'),
		('Final Fantasy VII (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Tekken 3 (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('R4: Ridge Racer Type 4 (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Wild Arms (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Jumping Flash! (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Syphon Filter (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Metal Gear Solid (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Resident Evil Director''s Cut (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Twisted Metal (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Rayman (Classic)', 50.00, 20, 1, 10, '2018-12-03'),
		('Marvel''s Spider-Man 2', 350.00, 25, 1, 11, '2023-10-20'),
		('Demon''s Souls (Remake)', 250.00, 15, 1, 11, '2020-11-12'),
		('Ratchet & Clank: Rift Apart', 200.00, 20, 1, 11, '2021-06-11'),
		('Returnal', 220.00, 12, 1, 11, '2021-04-30'),
		('Horizon Forbidden West', 280.00, 18, 1, 11, '2022-02-18'),
		('God of War Ragnarök', 300.00, 30, 1, 11, '2022-11-09'),
		('Final Fantasy XVI', 320.00, 22, 1, 11, '2023-06-22'),
		('Astro''s Playroom', 0.00, 99, 1, 11, '2020-11-12'),
		('Helldivers 2', 200.00, 40, 1, 11, '2024-02-08'),
		('Baldur''s Gate 3', 350.00, 15, 1, 11, '2023-09-06'),
		('Horizon Call of the Mountain', 300.00, 10, 1, 12, '2023-02-22'),
		('Gran Turismo 7 (Modo VR)', 250.00, 15, 1, 12, '2023-02-22'),
		('Resident Evil Village (Modo VR)', 200.00, 12, 1, 12, '2023-02-22'),
		('Resident Evil 4 Remake (Modo VR)', 250.00, 18, 1, 12, '2023-12-08'),
		('Beat Saber (PSVR2)', 150.00, 20, 1, 12, '2023-05-24'),
		('Synapse', 180.00, 8, 1, 12, '2023-07-04'),
		('Pavlov', 130.00, 14, 1, 12, '2023-02-22'),
		('The Dark Pictures: Switchback VR', 190.00, 7, 1, 12, '2023-03-16'),
		('No Man''s Sky (Modo VR)', 150.00, 11, 1, 12, '2023-02-22'),
		('Moss: Book II (PSVR2)', 140.00, 9, 1, 12, '2023-02-22'),
		('Halo: Combat Evolved', 120.00, 15, 1, 13, '2001-11-15'),
		('Halo 2', 130.00, 18, 1, 13, '2004-11-09'),
		('Fable', 100.00, 12, 1, 13, '2004-09-14'),
		('Star Wars: Knights of the Old Republic', 150.00, 8, 1, 13, '2003-07-15'),
		('Tom Clancy''s Splinter Cell', 90.00, 14, 1, 13, '2002-11-17'),
		('Ninja Gaiden', 110.00, 10, 1, 13, '2004-03-02'),
		('Forza Motorsport', 85.00, 11, 1, 13, '2005-05-03'),
		('Project Gotham Racing 2', 75.00, 9, 1, 13, '2003-11-17'),
		('Jade Empire', 105.00, 7, 1, 13, '2005-04-12'),
		('Crimson Skies: High Road to Revenge', 80.00, 6, 1, 13, '2003-10-21'),
		('Halo 3', 100.00, 25, 1, 14, '2007-09-25'),
		('Gears of War', 90.00, 20, 1, 14, '2006-11-07'),
		('Gears of War 2', 95.00, 18, 1, 14, '2008-11-07'),
		('Mass Effect 2', 120.00, 12, 1, 14, '2010-01-26'),
		('The Elder Scrolls V: Skyrim', 110.00, 22, 1, 14, '2011-11-11'),
		('Grand Theft Auto V', 130.00, 30, 1, 14, '2013-09-17'),
		('Call of Duty: Modern Warfare 2', 85.00, 28, 1, 14, '2009-11-10'),
		('BioShock', 105.00, 15, 1, 14, '2007-08-21'),
		('Red Dead Redemption', 115.00, 14, 1, 14, '2010-05-18'),
		('Forza Horizon', 90.00, 16, 1, 14, '2012-10-23'),
		('Halo 5: Guardians', 120.00, 20, 1, 15, '2015-10-27'),
		('Gears 5', 130.00, 18, 1, 15, '2019-09-10'),
		('Forza Horizon 3', 110.00, 15, 1, 15, '2016-09-27'),
		('Forza Horizon 4', 140.00, 22, 1, 15, '2018-10-02'),
		('The Witcher 3: Wild Hunt', 100.00, 25, 1, 15, '2015-05-19'),
		('Red Dead Redemption 2', 150.00, 30, 1, 15, '2018-10-26'),
		('Sea of Thieves', 90.00, 14, 1, 15, '2018-03-20'),
		('Ori and the Blind Forest', 75.00, 12, 1, 15, '2015-03-11'),
		('Halo: The Master Chief Collection', 160.00, 19, 1, 15, '2014-11-11'),
		('Cuphead', 85.00, 17, 1, 15, '2017-09-29'),
		('Halo Infinite', 250.00, 20, 1, 19, '2021-12-08'),
		('Forza Horizon 5', 280.00, 25, 1, 19, '2021-11-09'),
		('Starfield', 300.00, 15, 1, 19, '2023-09-06'),
		('Microsoft Flight Simulator', 220.00, 12, 1, 19, '2021-07-27'),
		('Hi-Fi Rush', 150.00, 18, 1, 19, '2023-01-25'),
		('Senua''s Saga: Hellblade II', 250.00, 10, 1, 19, '2024-05-21'),
		('Gears Tactics', 140.00, 8, 1, 19, '2020-11-10'),
		('Pentiment', 100.00, 11, 1, 19, '2022-11-15'),
		('Grounded', 130.00, 14, 1, 19, '2022-09-27'),
		('Cyberpunk 2077 (Versão Next-Gen)', 180.00, 22, 1, 19, '2022-02-15'),
		('Light Tennis (Pong)', 50.00, 5, 1, 20, '1977-06-01'),
		('Hockey', 50.00, 5, 1, 20, '1977-06-01'),
		('Volleyball', 50.00, 5, 1, 20, '1977-06-01'),
		('Ping Pong', 50.00, 5, 1, 20, '1977-06-01'),
		('Shooting Game', 50.00, 5, 1, 20, '1977-06-01'),
		('Blockbreaker (Block Kuzushi)', 50.00, 5, 1, 20, '1979-04-23'),
		('Racing 112', 50.00, 5, 1, 20, '1978-06-08'),
		('Ball', 150.00, 4, 1, 21, '1980-04-28'),
		('Fire', 180.00, 3, 1, 21, '1981-12-04'),
		('Octopus', 200.00, 5, 1, 21, '1981-07-16'),
		('Donkey Kong', 300.00, 2, 1, 21, '1982-06-03'),
		('Chef', 170.00, 4, 1, 21, '1981-09-08'),
		('Mario Bros.', 250.00, 3, 1, 21, '1983-03-14'),
		('Parachute', 160.00, 5, 1, 21, '1981-06-19'),
		('Turtle Bridge', 140.00, 6, 1, 21, '1982-02-01'),
		('Helmet', 190.00, 4, 1, 21, '1981-02-21'),
		('Zelda', 400.00, 1, 1, 21, '1989-08-01'),
		('Super Mario Bros.', 150.00, 20, 1, 22, '1985-09-13'),
		('Super Mario Bros. 3', 180.00, 18, 1, 22, '1988-10-23'),
		('The Legend of Zelda', 200.00, 12, 1, 22, '1986-02-21'),
		('Metroid', 160.00, 10, 1, 22, '1986-08-06'),
		('Mega Man 2', 170.00, 8, 1, 22, '1988-12-24'),
		('Castlevania', 140.00, 11, 1, 22, '1986-09-26'),
		('Contra', 130.00, 14, 1, 22, '1988-02-09'),
		('Punch-Out!!', 120.00, 9, 1, 22, '1987-09-18'),
		('Tetris', 80.00, 25, 1, 22, '1989-11-01'),
		('Duck Hunt', 90.00, 15, 1, 22, '1984-04-21'),
		('Tetris', 60.00, 30, 1, 23, '1989-06-14'),
		('Pokémon Red/Blue/Yellow', 250.00, 10, 1, 23, '1996-02-27'),
		('Pokémon Gold/Silver/Crystal', 280.00, 8, 1, 23, '1999-11-21'),
		('The Legend of Zelda: Link''s Awakening', 150.00, 12, 1, 23, '1993-06-06'),
		('Super Mario Land 2: 6 Golden Coins', 120.00, 14, 1, 23, '1992-10-21'),
		('Kirby''s Dream Land', 90.00, 15, 1, 23, '1992-04-27'),
		('Wario Land: Super Mario Land 3', 110.00, 11, 1, 23, '1994-01-21'),
		('Donkey Kong (1994)', 100.00, 13, 1, 23, '1994-06-14'),
		('Metroid II: Return of Samus', 160.00, 7, 1, 23, '1991-11-01'),
		('Super Mario Bros. Deluxe', 130.00, 10, 1, 23, '1999-05-01'),
		('Super Mario World', 180.00, 25, 1, 24, '1990-11-21'),
		('Chrono Trigger', 350.00, 5, 1, 24, '1995-03-11'),
		('The Legend of Zelda: A Link to the Past', 250.00, 10, 1, 24, '1991-11-21'),
		('Super Metroid', 280.00, 8, 1, 24, '1994-03-19'),
		('Final Fantasy VI', 300.00, 6, 1, 24, '1994-04-02'),
		('EarthBound', 450.00, 2, 1, 24, '1994-08-27'),
		('Donkey Kong Country', 150.00, 20, 1, 24, '1994-11-21'),
		('Super Mario Kart', 140.00, 18, 1, 24, '1992-08-27'),
		('Street Fighter II', 100.00, 22, 1, 24, '1992-06-10'),
		('Star Fox', 130.00, 12, 1, 24, '1993-02-21'),
		('Mario''s Tennis', 120.00, 5, 1, 25, '1995-07-21'),
		('Virtual Boy Wario Land', 200.00, 3, 1, 25, '1995-12-01'),
		('Red Alarm', 90.00, 4, 1, 25, '1995-07-21'),
		('Galactic Pinball', 85.00, 5, 1, 25, '1995-07-21'),
		('Teleroboxer', 100.00, 3, 1, 25, '1995-07-21'),
		('Mario Clash', 150.00, 4, 1, 25, '1995-09-28'),
		('Panic Bomber', 110.00, 5, 1, 25, '1995-07-21'),
		('Jack Bros.', 350.00, 1, 1, 25, '1995-09-29'),
		('Waterworld', 250.00, 2, 1, 25, '1995-12-21'),
		('Nester''s Funky Bowling', 180.00, 2, 1, 25, '1996-02-26'),
		('Super Mario 64', 180.00, 20, 1, 26, '1996-06-23'),
		('The Legend of Zelda: Ocarina of Time', 250.00, 15, 1, 26, '1998-11-21'),
		('GoldenEye 007', 150.00, 18, 1, 26, '1997-08-25'),
		('Mario Kart 64', 160.00, 16, 1, 26, '1996-12-14'),
		('Super Smash Bros.', 190.00, 12, 1, 26, '1999-01-21'),
		('Banjo-Kazooie', 170.00, 10, 1, 26, '1998-06-29'),
		('The Legend of Zelda: Majora''s Mask', 280.00, 8, 1, 26, '2000-04-27'),
		('Star Fox 64', 140.00, 14, 1, 26, '1997-04-27'),
		('Perfect Dark', 130.00, 11, 1, 26, '2000-05-22'),
		('Paper Mario', 220.00, 6, 1, 26, '2000-08-11'),
		('Pokémon Ruby/Sapphire/Emerald', 200.00, 15, 1, 28, '2002-11-21'),
		('Mario Kart: Super Circuit', 110.00, 12, 1, 28, '2001-07-21'),
		('The Legend of Zelda: The Minish Cap', 180.00, 8, 1, 28, '2004-11-04'),
		('Advance Wars', 150.00, 9, 1, 28, '2001-09-10'),
		('Fire Emblem', 190.00, 6, 1, 28, '2003-04-25'),
		('Metroid Fusion', 170.00, 10, 1, 28, '2002-11-17'),
		('Castlevania: Aria of Sorrow', 250.00, 4, 1, 28, '2003-05-06'),
		('Golden Sun', 160.00, 7, 1, 28, '2001-08-01'),
		('WarioWare: Minigame Mania', 90.00, 11, 1, 28, '2003-03-21'),
		('Mother 3', 300.00, 2, 1, 28, '2006-04-20'),
		('Super Smash Bros. Melee', 200.00, 15, 1, 29, '2001-11-21'),
		('The Legend of Zelda: The Wind Waker', 220.00, 12, 1, 29, '2002-12-13'),
		('Mario Kart: Double Dash!!', 180.00, 14, 1, 29, '2003-11-07'),
		('Resident Evil 4', 150.00, 16, 1, 29, '2005-01-11'),
		('Metroid Prime', 170.00, 10, 1, 29, '2002-11-17'),
		('Super Mario Sunshine', 190.00, 11, 1, 29, '2002-07-19'),
		('Luigi''s Mansion', 160.00, 13, 1, 29, '2001-09-14'),
		('Animal Crossing', 140.00, 9, 1, 29, '2001-12-14'),
		('F-Zero GX', 210.00, 6, 1, 29, '2003-07-25'),
		('Paper Mario: The Thousand-Year Door', 250.00, 5, 1, 29, '2004-07-22'),
		('New Super Mario Bros.', 100.00, 25, 1, 31, '2006-05-15'),
		('Nintendogs', 80.00, 20, 1, 31, '2005-04-21'),
		('Mario Kart DS', 110.00, 22, 1, 31, '2005-11-14'),
		('Brain Age', 60.00, 30, 1, 31, '2005-05-19'),
		('Pokémon Diamond/Pearl', 180.00, 15, 1, 31, '2006-09-28'),
		('Animal Crossing: Wild World', 120.00, 14, 1, 31, '2005-11-23'),
		('Grand Theft Auto: Chinatown Wars', 90.00, 10, 1, 31, '2009-03-17'),
		('Chrono Trigger (DS)', 250.00, 5, 1, 31, '2008-11-20'),
		('The Legend of Zelda: Phantom Hourglass', 150.00, 9, 1, 31, '2007-06-23'),
		('Professor Layton and the Curious Village', 130.00, 8, 1, 31, '2007-02-15'),
		('Wii Sports', 80.00, 40, 1, 34, '2006-11-19'),
		('Mario Kart Wii', 120.00, 30, 1, 34, '2008-04-10'),
		('Super Mario Galaxy', 140.00, 20, 1, 34, '2007-11-01'),
		('Super Mario Galaxy 2', 150.00, 18, 1, 34, '2010-05-23'),
		('Super Smash Bros. Brawl', 130.00, 22, 1, 34, '2008-01-31'),
		('The Legend of Zelda: Twilight Princess', 160.00, 15, 1, 34, '2006-11-19'),
		('Wii Fit', 90.00, 25, 1, 34, '2007-12-01'),
		('Just Dance', 70.00, 28, 1, 34, '2009-11-17'),
		('Xenoblade Chronicles', 200.00, 8, 1, 34, '2010-06-10'),
		('New Super Mario Bros. Wii', 110.00, 24, 1, 34, '2009-11-11'),
		('Mario Kart 7', 120.00, 20, 1, 37, '2011-12-01'),
		('Pokémon X/Y', 150.00, 18, 1, 37, '2013-10-12'),
		('Animal Crossing: New Leaf', 130.00, 15, 1, 37, '2012-11-08'),
		('Super Mario 3D Land', 110.00, 22, 1, 37, '2011-11-03'),
		('Super Smash Bros. for Nintendo 3DS', 140.00, 16, 1, 37, '2014-09-13'),
		('The Legend of Zelda: A Link Between Worlds', 160.00, 10, 1, 37, '2013-11-22'),
		('Fire Emblem Awakening', 180.00, 8, 1, 37, '2012-04-19'),
		('Monster Hunter 4 Ultimate', 130.00, 12, 1, 37, '2014-10-11'),
		('Luigi''s Mansion: Dark Moon', 120.00, 14, 1, 37, '2013-03-20'),
		('The Legend of Zelda: Ocarina of Time 3D', 170.00, 9, 1, 37, '2011-06-16'),
		('Mario Kart 8', 120.00, 15, 1, 38, '2014-05-29'),
		('Super Smash Bros. for Wii U', 130.00, 12, 1, 38, '2014-11-21'),
		('Splatoon', 100.00, 14, 1, 38, '2015-05-28'),
		('Super Mario 3D World', 110.00, 16, 1, 38, '2013-11-21'),
		('The Legend of Zelda: Breath of the Wild', 180.00, 10, 1, 38, '2017-03-03'),
		('Bayonetta 2', 150.00, 8, 1, 38, '2014-09-20'),
		('Donkey Kong Country: Tropical Freeze', 125.00, 11, 1, 38, '2014-02-13'),
		('Pikmin 3', 115.00, 9, 1, 38, '2013-07-13'),
		('Super Mario Maker', 140.00, 10, 1, 38, '2015-09-10'),
		('The Legend of Zelda: The Wind Waker HD', 160.00, 7, 1, 38, '2013-09-20'),
		('Mario Kart 8 Deluxe', 250.00, 30, 1, 41, '2017-04-28'),
		('Animal Crossing: New Horizons', 220.00, 25, 1, 41, '2020-03-20'),
		('Super Smash Bros. Ultimate', 280.00, 20, 1, 41, '2018-12-07'),
		('The Legend of Zelda: Breath of the Wild', 260.00, 22, 1, 41, '2017-03-03'),
		('The Legend of Zelda: Tears of the Kingdom', 300.00, 18, 1, 41, '2023-05-12'),
		('Super Mario Odyssey', 240.00, 24, 1, 41, '2017-10-27'),
		('Pokémon Sword/Shield', 230.00, 19, 1, 41, '2019-11-15'),
		('Splatoon 3', 250.00, 15, 1, 41, '2022-09-09'),
		('Super Mario Bros. Wonder', 280.00, 20, 1, 41, '2023-10-20'),
		('Fire Emblem: Three Houses', 210.00, 12, 1, 41, '2019-07-26'),
		('Pac-Man', 80.00, 25, 1, 43, '1982-03-16'),
		('Pitfall!', 100.00, 20, 1, 43, '1982-04-20'),
		('Space Invaders', 90.00, 22, 1, 43, '1980-03-01'),
		('Missile Command', 70.00, 18, 1, 43, '1981-03-01'),
		('Demon Attack', 60.00, 15, 1, 43, '1982-03-01'),
		('Asteroids', 85.00, 19, 1, 43, '1981-07-01'),
		('Frogger', 95.00, 17, 1, 43, '1982-08-01'),
		('Yars'' Revenge', 110.00, 14, 1, 43, '1982-05-01'),
		('Adventure', 120.00, 12, 1, 43, '1980-01-01'),
		('River Raid', 130.00, 10, 1, 43, '1982-12-01'),
		('Astrosmash', 60.00, 15, 1, 44, '1981-01-01'),
		('Las Vegas Poker & Blackjack', 50.00, 18, 1, 44, '1979-12-03'),
		('Major League Baseball', 55.00, 16, 1, 44, '1980-01-01'),
		('Utopia', 80.00, 10, 1, 44, '1982-01-01'),
		('BurgerTime', 90.00, 12, 1, 44, '1982-01-01'),
		('Star Strike', 65.00, 14, 1, 44, '1981-01-01'),
		('Advanced Dungeons & Dragons', 120.00, 8, 1, 44, '1982-01-01'),
		('B-17 Bomber', 75.00, 11, 1, 44, '1982-01-01'),
		('Night Stalker', 85.00, 9, 1, 44, '1982-01-01'),
		('Tron: Deadly Discs', 95.00, 7, 1, 44, '1982-01-01'),
		('Girl''s Garden', 100.00, 5, 1, 45, '1984-12-01'),
		('Flicky', 90.00, 6, 1, 45, '1984-01-01'),
		('Monaco GP', 80.00, 7, 1, 45, '1983-07-15'),
		('Zaxxon', 110.00, 4, 1, 45, '1985-01-01'),
		('Congo Bongo', 85.00, 5, 1, 45, '1983-01-01'),
		('Star Force', 95.00, 6, 1, 45, '1985-01-01'),
		('Ninja Princess', 120.00, 3, 1, 45, '1986-01-01'),
		('H.E.R.O.', 130.00, 4, 1, 45, '1985-01-01'),
		('Space Invaders', 75.00, 8, 1, 45, '1985-01-01'),
		('Lode Runner', 85.00, 5, 1, 45, '1984-01-01'),
		('Alex Kidd in Miracle World', 120.00, 15, 1, 47, '1986-11-01'),
		('Phantasy Star', 200.00, 8, 1, 47, '1987-12-20'),
		('Sonic the Hedgehog', 140.00, 18, 1, 47, '1991-10-25'),
		('Wonder Boy III: The Dragon''s Trap', 150.00, 10, 1, 47, '1989-01-01'),
		('California Games', 90.00, 12, 1, 47, '1989-03-01'),
		('Psycho Fox', 110.00, 9, 1, 47, '1989-12-01'),
		('OutRun', 100.00, 14, 1, 47, '1987-10-01'),
		('Castle of Illusion Starring Mickey Mouse', 130.00, 11, 1, 47, '1990-11-01'),
		('Asterix', 95.00, 10, 1, 47, '1991-01-01'),
		('Mônica no Castelo do Dragão', 180.00, 5, 1, 47, '1991-01-01'),
		('Sonic the Hedgehog 2', 150.00, 20, 1, 49, '1992-11-21'),
		('Sonic the Hedgehog', 140.00, 18, 1, 49, '1991-06-23'),
		('Sonic 3 & Knuckles', 200.00, 12, 1, 49, '1994-10-18'),
		('Streets of Rage 2', 180.00, 14, 1, 49, '1992-12-20'),
		('Gunstar Heroes', 250.00, 8, 1, 49, '1993-09-09'),
		('Shinobi III: Return of the Ninja Master', 160.00, 10, 1, 49, '1993-07-23'),
		('Phantasy Star IV', 300.00, 5, 1, 49, '1993-12-17'),
		('Mortal Kombat II', 120.00, 16, 1, 49, '1994-09-09'),
		('Golden Axe', 110.00, 15, 1, 49, '1989-12-22'),
		('Aladdin', 100.00, 18, 1, 49, '1993-11-11'),
		('Sonic CD', 200.00, 10, 1, 52, '1993-09-23'),
		('Lunar: The Silver Star', 250.00, 6, 1, 52, '1992-06-26'),
		('Snatcher', 400.00, 2, 1, 52, '1994-11-30'),
		('Lunar: Eternal Blue', 300.00, 4, 1, 52, '1994-12-22'),
		('Silpheed', 120.00, 8, 1, 52, '1993-07-30'),
		('Final Fight CD', 150.00, 7, 1, 52, '1993-04-02'),
		('Night Trap', 180.00, 5, 1, 52, '1992-10-15'),
		('Popful Mail', 220.00, 4, 1, 52, '1994-04-01'),
		('Vay', 160.00, 5, 1, 52, '1993-10-22'),
		('Robo Aleste', 190.00, 3, 1, 52, '1992-11-27'),
		('Knuckles'' Chaotix', 250.00, 5, 1, 54, '1995-03-24'),
		('Star Wars Arcade', 120.00, 8, 1, 54, '1994-12-05'),
		('Virtua Racing Deluxe', 100.00, 10, 1, 54, '1994-11-21'),
		('Doom', 90.00, 12, 1, 54, '1994-11-21'),
		('Virtua Fighter', 110.00, 9, 1, 54, '1995-10-01'),
		('Kolibri', 280.00, 3, 1, 54, '1995-01-01'),
		('Space Harrier', 150.00, 6, 1, 54, '1994-12-01'),
		('Shadow Squadron', 130.00, 5, 1, 54, '1995-04-01'),
		('Blackthorne', 140.00, 4, 1, 54, '1995-09-01'),
		('Mortal Kombat II', 160.00, 7, 1, 54, '1995-03-01'),
		('NiGHTS into Dreams', 180.00, 10, 1, 55, '1996-07-05'),
		('Panzer Dragoon Saga', 500.00, 2, 1, 55, '1998-01-29'),
		('Virtua Fighter 2', 120.00, 15, 1, 55, '1995-12-01'),
		('Sega Rally Championship', 100.00, 14, 1, 55, '1995-12-29'),
		('Guardian Heroes', 250.00, 5, 1, 55, '1996-01-26'),
		('Shining Force III', 300.00, 4, 1, 55, '1997-12-11'),
		('Daytona USA', 90.00, 18, 1, 55, '1995-04-01'),
		('Virtua Cop 2', 110.00, 12, 1, 55, '1996-11-22'),
		('Radiant Silvergun', 450.00, 2, 1, 55, '1998-07-23'),
		('Burning Rangers', 350.00, 3, 1, 55, '1998-02-26'),
		('Shenmue', 200.00, 10, 1, 56, '1999-12-29'),
		('Sonic Adventure', 150.00, 15, 1, 56, '1998-12-23'),
		('Soulcalibur', 160.00, 12, 1, 56, '1999-08-05'),
		('Crazy Taxi', 120.00, 18, 1, 56, '2000-01-24'),
		('Jet Set Radio', 180.00, 9, 1, 56, '2000-06-29'),
		('Phantasy Star Online', 140.00, 11, 1, 56, '2000-12-21'),
		('Resident Evil - Code: Veronica', 170.00, 8, 1, 56, '2000-02-03'),
		('Marvel vs. Capcom 2', 250.00, 6, 1, 56, '2000-03-30'),
		('Skies of Arcadia', 280.00, 5, 1, 56, '2000-10-05'),
		('Power Stone 2', 220.00, 7, 1, 56, '2000-04-27'),
		('California Games', 70.00, 15, 1, 57, '1989-09-01'),
		('Blue Lightning', 60.00, 12, 1, 57, '1989-09-01'),
		('Chip''s Challenge', 80.00, 10, 1, 57, '1989-09-01'),
		('Klax', 55.00, 14, 1, 57, '1990-01-01'),
		('Rygar', 90.00, 8, 1, 57, '1990-01-01'),
		('Todd''s Adventures in Slime World', 85.00, 9, 1, 57, '1990-01-01'),
		('S.T.U.N. Runner', 75.00, 11, 1, 57, '1991-01-01'),
		('Rampage', 95.00, 7, 1, 57, '1990-01-01'),
		('Batman Returns', 110.00, 5, 1, 57, '1992-01-01'),
		('Xenophobe', 65.00, 10, 1, 57, '1990-01-01'),
		('Alien vs Predator', 200.00, 8, 1, 58, '1994-10-21'),
		('Tempest 2000', 150.00, 10, 1, 58, '1994-04-13'),
		('Doom', 120.00, 12, 1, 58, '1994-11-28'),
		('Rayman', 180.00, 6, 1, 58, '1995-09-19'),
		('Cybermorph', 70.00, 15, 1, 58, '1993-11-23'),
		('Iron Soldier', 110.00, 9, 1, 58, '1994-12-22'),
		('Wolfenstein 3D', 140.00, 7, 1, 58, '1994-08-01'),
		('Cannon Fodder', 130.00, 6, 1, 58, '1995-02-01'),
		('Raiden', 100.00, 11, 1, 58, '1993-11-23'),
		('Super Burnout', 160.00, 5, 1, 58, '1995-07-01'),
		('Battlemorph', 180.00, 4, 1, 59, '1995-12-01'),
		('Primal Rage', 140.00, 6, 1, 59, '1995-12-22'),
		('Blue Lightning', 120.00, 7, 1, 59, '1995-09-21'),
		('Highlander: The Last of the MacLeods', 150.00, 5, 1, 59, '1995-10-01'),
		('Myst', 110.00, 8, 1, 59, '1995-12-01'),
		('Space Ace', 130.00, 6, 1, 59, '1995-12-01'),
		('Dragon''s Lair', 160.00, 5, 1, 59, '1995-12-01'),
		('Iron Soldier 2', 200.00, 3, 1, 59, '1997-04-01'),
		('Hover Strike: Unconquered Lands', 100.00, 7, 1, 59, '1995-10-01'),
		('Vid Grid', 90.00, 9, 1, 59, '1995-09-21'),
		('Missile Command: Recharged', 50.00, 20, 1, 60, '2020-12-14'),
		('Centipede: Recharged', 50.00, 20, 1, 60, '2021-09-29'),
		('Asteroids: Recharged', 50.00, 20, 1, 60, '2021-12-14'),
		('Yars: Recharged', 50.00, 20, 1, 60, '2022-08-23'),
		('Danger Scavenger', 60.00, 15, 1, 60, '2020-12-22'),
		('Jetboard Joust', 60.00, 15, 1, 60, '2021-05-18'),
		('Donut Dodo', 45.00, 25, 1, 60, '2022-06-01'),
		('Kombinera', 75.00, 12, 1, 60, '2022-04-07'),
		('Atari Mania', 90.00, 10, 1, 60, '2022-10-13'),
		('BPM: Bullets Per Minute', 100.00, 8, 1, 60, '2022-02-01'),
        ('Controle Original PS1 (Sem Analógico)', 80.00, 15, 2, 1, '1994-12-03'),
		('Controle DualShock PS1', 120.00, 30, 2, 1, '1997-11-20'),
		('Memory Card 1MB PS1', 50.00, 50, 2, 1, '1994-12-03'),
		('Multitap PS1', 100.00, 10, 2, 1, '1995-10-15'),
		('PlayStation Mouse', 90.00, 5, 2, 1, '1994-12-03'),
		('PlayStation Link Cable', 60.00, 8, 2, 1, '1995-09-09'),
		('Strap para PocketStation', 30.00, 10, 2, 2, '1999-01-23'),
		('Controle DualShock 2', 120.00, 40, 2, 3, '2000-03-04'),
		('Memory Card 8MB PS2', 60.00, 60, 2, 3, '2000-03-04'),
		('Câmera EyeToy', 150.00, 12, 2, 3, '2003-10-21'),
		('Multitap PS2', 110.00, 15, 2, 3, '2000-10-26'),
		('Network Adapter PS2', 200.00, 8, 2, 3, '2002-08-27'),
		('Controle Remoto DVD PS2', 90.00, 10, 2, 3, '2000-12-22'),
		('Memory Stick PRO Duo 1GB', 80.00, 30, 2, 4, '2004-12-12'),
		('Câmera PSP Go!Cam', 160.00, 10, 2, 4, '2007-05-16'),
		('Case de Proteção UMD', 40.00, 25, 2, 4, '2005-03-24'),
		('Fone de Ouvido c/ Controle Remoto PSP', 70.00, 20, 2, 4, '2004-12-12'),
		('Controle DualShock 3', 180.00, 25, 2, 5, '2007-11-11'),
		('Controle Sixaxis', 140.00, 15, 2, 5, '2006-11-11'),
		('Câmera PlayStation Eye', 100.00, 15, 2, 5, '2007-10-23'),
		('Controle PlayStation Move Motion', 200.00, 20, 2, 5, '2010-09-15'),
		('Controle PlayStation Move Navigation', 150.00, 10, 2, 5, '2010-09-15'),
		('Headset Wireless Bluetooth PS3', 130.00, 18, 2, 5, '2008-10-30'),
		('Wireless Keypad PS3', 120.00, 5, 2, 5, '2008-12-01'),
		('Memory Card PS Vita 16GB', 250.00, 15, 2, 7, '2011-12-17'),
		('Cradle (Base de Carregamento) PS Vita', 90.00, 8, 2, 7, '2011-12-17'),
		('Controle DualShock 4', 280.00, 35, 2, 8, '2013-11-15'),
		('PlayStation Camera PS4', 220.00, 15, 2, 8, '2013-11-15'),
		('Headset Sem Fio Gold', 450.00, 20, 2, 8, '2014-02-10'),
		('Base de Carregamento DualShock 4', 120.00, 25, 2, 8, '2013-11-15'),
		('PS VR Aim Controller', 400.00, 10, 2, 9, '2017-05-16'),
		('Controle DualSense Branco', 450.00, 40, 2, 11, '2020-11-12'),
		('Controle DualSense Edge', 1400.00, 10, 2, 11, '2023-01-26'),
		('Headset Sem Fio Pulse 3D', 550.00, 25, 2, 11, '2020-11-12'),
		('Câmera HD PS5', 300.00, 12, 2, 11, '2020-11-12'),
		('Controle de Mídia PS5', 180.00, 15, 2, 11, '2020-11-12'),
		('Tampas do Console PS5 (Preta)', 350.00, 20, 2, 11, '2022-01-21'),
		('Base de Carregamento Sense Controller', 250.00, 15, 2, 12, '2023-02-22'),
		('Adaptador PC para PS VR2', 350.00, 10, 2, 12, '2024-08-07'),
		('Controle Duke Xbox', 180.00, 10, 2, 13, '2001-11-15'),
		('Controle S Xbox', 150.00, 20, 2, 13, '2002-04-01'),
		('Memory Unit 8MB Xbox', 70.00, 15, 2, 13, '2001-11-15'),
		('DVD Movie Playback Kit Xbox', 90.00, 12, 2, 13, '2001-11-15'),
		('Xbox Live Starter Kit', 200.00, 5, 2, 13, '2002-11-15'),
		('Controle Sem Fio Xbox 360', 180.00, 35, 2, 14, '2005-11-22'),
		('Sensor Kinect Xbox 360', 250.00, 20, 2, 14, '2010-11-04'),
		('Disco Rígido (HD) 120GB Xbox 360', 300.00, 15, 2, 14, '2007-04-29'),
		('Kit Play & Charge Xbox 360', 100.00, 30, 2, 14, '2005-11-22'),
		('Teclado Chatpad Xbox 360', 90.00, 18, 2, 14, '2007-09-04'),
		('Adaptador de Rede Sem Fio (Wireless) Xbox 360', 150.00, 12, 2, 14, '2005-11-22'),
		('Controle Sem Fio Xbox One', 300.00, 30, 2, 15, '2013-11-22'),
		('Xbox Elite Wireless Controller Series 1', 900.00, 10, 2, 15, '2015-10-27'),
		('Sensor Kinect Xbox One', 350.00, 12, 2, 15, '2013-11-22'),
		('Adaptador de Headset Estéreo Xbox One', 120.00, 20, 2, 15, '2014-02-25'),
		('Controle Sem Fio Xbox Series', 420.00, 40, 2, 19, '2020-11-10'),
		('Xbox Elite Wireless Controller Series 2', 1100.00, 12, 2, 19, '2019-11-04'),
		('Cartão de Expansão de Armazenamento Seagate 1TB', 1300.00, 8, 2, 19, '2020-11-10'),
		('Headset Sem Fio Xbox', 500.00, 20, 2, 19, '2021-03-16'),
		('Bateria Recarregável + Cabo USB-C Xbox', 180.00, 25, 2, 19, '2020-11-10'),
		('Controle NES', 80.00, 25, 2, 22, '1985-10-18'),
		('NES Zapper (Pistola de Luz)', 150.00, 15, 2, 22, '1985-10-18'),
		('R.O.B. (Robotic Operating Buddy)', 600.00, 2, 2, 22, '1985-10-18'),
		('Power Pad', 250.00, 5, 2, 22, '1988-02-01'),
		('NES Advantage (Controle Arcade)', 200.00, 8, 2, 22, '1987-08-01'),
		('Cabo Game Link', 50.00, 30, 2, 23, '1989-04-21'),
		('Game Boy Camera', 250.00, 10, 2, 23, '1998-02-21'),
		('Game Boy Printer', 300.00, 5, 2, 23, '1998-02-21'),
		('Lupa com Luz (Magnifier)', 60.00, 20, 2, 23, '1989-10-01'),
		('Controle SNES', 90.00, 30, 2, 24, '1990-11-21'),
		('Super Scope (Arma de Luz)', 350.00, 8, 2, 24, '1992-02-01'),
		('Super Game Boy (Adaptador)', 220.00, 15, 2, 24, '1994-06-14'),
		('SNES Mouse', 150.00, 10, 2, 24, '1992-07-14'),
		('Super Multitap', 180.00, 12, 2, 24, '1993-09-01'),
		('AC Adapter Virtual Boy', 150.00, 5, 2, 25, '1995-07-21'),
		('Controle N64', 130.00, 25, 2, 26, '1996-06-23'),
		('Rumble Pak N64', 90.00, 20, 2, 26, '1997-04-27'),
		('Controller Pak (Memory Card) N64', 70.00, 30, 2, 26, '1996-06-23'),
		('Expansion Pak N64', 250.00, 15, 2, 26, '1998-12-01'),
		('Transfer Pak N64', 120.00, 12, 2, 26, '1999-04-30'),
		('Controle Original GameCube', 150.00, 25, 2, 29, '2001-09-14'),
		('Controle Sem Fio WaveBird', 300.00, 10, 2, 29, '2002-06-01'),
		('Memory Card 59 Blocos', 50.00, 35, 2, 29, '2001-09-14'),
		('Memory Card 251 Blocos', 100.00, 20, 2, 29, '2002-07-19'),
		('Game Boy Player', 400.00, 8, 2, 29, '2003-03-21'),
		('Cabo de Conexão GameCube-Game Boy Advance', 90.00, 15, 2, 29, '2001-12-14'),
		('Kit Canetas Stylus NDS', 30.00, 40, 2, 31, '2004-11-21'),
		('Circle Pad Pro 3DS', 150.00, 10, 2, 37, '2011-12-10'),
		('Amiibo NFC Reader/Writer', 120.00, 12, 2, 37, '2015-09-25'),
		('Wii Remote', 150.00, 40, 2, 34, '2006-11-19'),
		('Nunchuk', 80.00, 35, 2, 34, '2006-11-19'),
		('Classic Controller Pro', 140.00, 15, 2, 34, '2009-08-01'),
		('Wii Balance Board', 250.00, 12, 2, 34, '2007-12-01'),
		('Wii Zapper', 90.00, 18, 2, 34, '2007-11-19'),
		('Wii Wheel (Volante)', 60.00, 25, 2, 34, '2008-04-10'),
		('Wii MotionPlus Adapter', 75.00, 20, 2, 34, '2009-06-08'),
		('Wii U Pro Controller', 250.00, 15, 2, 38, '2012-12-18'),
		('Adaptador de Controle GameCube para Wii U', 180.00, 20, 2, 38, '2014-11-21'),
		('Bateria de Alta Capacidade GamePad', 200.00, 8, 2, 38, '2013-07-25'),
		('Par de Joy-Con (Neon Red/Neon Blue)', 450.00, 35, 2, 41, '2017-03-03'),
		('Nintendo Switch Pro Controller', 400.00, 25, 2, 41, '2017-03-03'),
		('Joy-Con Charging Grip', 150.00, 15, 2, 41, '2017-03-03'),
		('Dock Set Nintendo Switch', 500.00, 10, 2, 41, '2017-05-19'),
		('Ring-Con e Leg Strap (Acessório Ring Fit)', 350.00, 12, 2, 41, '2019-10-18'),
		('Case de Proteção Oficial Switch', 120.00, 40, 2, 41, '2017-03-03'),
		('Control Pad Master System', 80.00, 20, 2, 47, '1985-10-20'),
		('Light Phaser (Pistola)', 150.00, 12, 2, 47, '1986-01-01'),
		('Óculos 3-D Sega', 300.00, 5, 2, 47, '1987-11-07'),
		('Controle 3 Botões Mega Drive', 90.00, 25, 2, 49, '1988-10-29'),
		('Controle 6 Botões Mega Drive', 130.00, 30, 2, 49, '1993-01-01'),
		('Sega Menacer (Pistola)', 250.00, 8, 2, 49, '1992-06-01'),
		('Sega Mouse', 150.00, 5, 2, 49, '1993-08-01'),
		('Sega Team Player (Multitap)', 180.00, 6, 2, 49, '1993-01-01'),
		('Cartucho de Backup RAM Sega CD', 250.00, 4, 2, 52, '1991-12-12'),
		('Controle Original Saturn', 120.00, 20, 2, 55, '1994-11-22'),
		('3D Control Pad Saturn', 200.00, 12, 2, 55, '1996-07-05'),
		('Arcade Stick Saturn', 300.00, 8, 2, 55, '1994-11-22'),
		('Cartucho de Memória RAM Saturn', 150.00, 15, 2, 55, '1994-11-22'),
		('Pistola Virtua Gun (Stunner)', 180.00, 10, 2, 55, '1995-11-24'),
		('Controle Dreamcast', 140.00, 25, 2, 56, '1998-11-27'),
		('VMU (Visual Memory Unit)', 100.00, 30, 2, 56, '1998-11-27'),
		('Jump Pack (Rumble) Dreamcast', 90.00, 20, 2, 56, '1999-04-01'),
		('Dreamcast Keyboard (Teclado)', 200.00, 8, 2, 56, '1999-09-09'),
		('Dreamcast Mouse', 150.00, 5, 2, 56, '1999-09-09'),
		('Vara de Pesca Dreamcast (Fishing Controller)', 250.00, 6, 2, 56, '1999-01-01'),
		('Maracas Sega Samba de Amigo', 600.00, 2, 2, 56, '2000-04-27'),
		('Joystick CX40', 70.00, 40, 2, 43, '1977-09-11'),
		('Paddle Controllers (Par)', 120.00, 15, 2, 43, '1977-09-11'),
		('Driving Controller', 100.00, 10, 2, 43, '1978-01-01'),
		('Video Touch Pad', 150.00, 5, 2, 43, '1981-01-01'),
		('Controle Original Jaguar', 180.00, 10, 2, 58, '1993-11-23'),
		('ProController Jaguar', 350.00, 5, 2, 58, '1995-01-01'),
		('Team Tap (Multitap Jaguar)', 250.00, 3, 2, 58, '1995-01-01'),
		('Memory Track Jaguar CD', 300.00, 4, 2, 58, '1995-09-21');
    

INSERT INTO Compra (Preço_Final_Compra, FK_Cliente_Id)
	VALUES
		(150.00, 12), 
        (80.00, 45), 
        (220.00, 3), 
        (65.00, 29), 
        (310.00, 18), 
        (125.00, 50), 
        (95.00, 7), 
        (280.00, 33), 
        (55.00, 21), 
        (190.00, 4),
		(140.00, 15), 
        (75.00, 38), 
        (210.00, 2), 
        (90.00, 42), 
        (300.00, 11), 
        (135.00, 48), 
        (85.00, 9), 
        (270.00, 31), 
        (60.00, 25), 
        (180.00, 6),
		(160.00, 19), 
        (70.00, 41), 
        (230.00, 5), 
        (88.00, 27), 
        (320.00, 14), 
        (145.00, 49), 
        (105.00, 8), 
        (290.00, 36), 
        (62.00, 22), 
        (200.00, 1),
		(155.00, 13), 
        (82.00, 44), 
        (215.00, 10), 
        (78.00, 30), 
        (305.00, 17), 
        (130.00, 47), 
        (98.00, 20), 
        (275.00, 34), 
        (58.00, 24), 
        (185.00, 3),
		(165.00, 16), 
        (68.00, 39), 
        (225.00, 1), 
        (92.00, 28), 
        (315.00, 12), 
        (150.00, 46), 
        (100.00, 15), 
        (285.00, 35), 
        (64.00, 23), 
        (195.00, 2),
		(148.00, 21), 
        (72.00, 43), 
        (205.00, 6), 
        (84.00, 26), 
        (295.00, 19), 
        (120.00, 45), 
        (96.00, 11), 
        (265.00, 32), 
        (56.00, 20), 
        (175.00, 5),
		(152.00, 18), 
        (76.00, 40), 
        (218.00, 4), 
        (86.00, 31), 
        (308.00, 13), 
        (138.00, 50), 
        (94.00, 9), 
        (278.00, 37), 
        (66.00, 25), 
        (188.00, 8),
		(158.00, 14), 
        (84.00, 37), 
        (212.00, 7), 
        (90.00, 29), 
        (302.00, 16), 
        (132.00, 48), 
        (102.00, 10), 
        (282.00, 33), 
        (60.00, 22), 
        (182.00, 1),
		(162.00, 17), 
        (70.00, 42), 
        (228.00, 2), 
        (88.00, 30), 
        (318.00, 15), 
        (142.00, 49), 
        (108.00, 12), 
        (292.00, 34), 
        (68.00, 26), 
        (192.00, 3),
		(145.00, 20), 
        (74.00, 39), 
        (208.00, 5), 
        (82.00, 28), 
        (298.00, 18), 
        (128.00, 47), 
        (98.00, 8), 
        (268.00, 35), 
        (54.00, 21), 
        (178.00, 4),
		(155.00, 12), 
        (80.00, 45), 
        (220.00, 3), 
        (65.00, 29), 
        (310.00, 18), 
        (125.00, 50), 
        (95.00, 7), 
        (280.00, 33), 
        (55.00, 21), 
        (190.00, 4),
		(140.00, 15), 
        (75.00, 38), 
        (210.00, 2), 
        (90.00, 42), 
        (300.00, 11), 
        (135.00, 48), 
        (85.00, 9), 
        (270.00, 31), 
        (60.00, 25), 
        (180.00, 6),
		(160.00, 19), 
        (70.00, 41), 
        (230.00, 5), 
        (88.00, 27), 
        (320.00, 14), 
        (145.00, 49), 
        (105.00, 8), 
        (290.00, 36), 
        (62.00, 22), 
        (200.00, 1),
		(155.00, 13), 
        (82.00, 44), 
        (215.00, 10), 
        (78.00, 30), 
        (305.00, 17), 
        (130.00, 47), 
        (98.00, 20), 
        (275.00, 34), 
        (58.00, 24), 
        (185.00, 3),
		(165.00, 16), 
        (68.00, 39), 
        (225.00, 1), 
        (92.00, 28), 
        (315.00, 12), 
        (150.00, 46), 
        (100.00, 15), 
        (285.00, 35), 
        (64.00, 23), 
        (195.00, 2),
		(148.00, 21), 
        (72.00, 43), 
        (205.00, 6), 
        (84.00, 26), 
        (295.00, 19), 
        (120.00, 45), 
        (96.00, 11), 
        (265.00, 32), 
        (56.00, 20), 
        (175.00, 5),
		(152.00, 18), 
        (76.00, 40), 
        (218.00, 4), 
        (86.00, 31), 
        (308.00, 13), 
        (138.00, 50), 
        (94.00, 9), 
        (278.00, 37), 
        (66.00, 25), 
        (188.00, 8),
		(158.00, 14), 
        (84.00, 37), 
        (212.00, 7), 
        (90.00, 29), 
        (302.00, 16), 
        (132.00, 48), 
        (102.00, 10), 
        (282.00, 33), 
        (60.00, 22), 
        (182.00, 1),
		(162.00, 17), 
        (70.00, 42), 
        (228.00, 2), 
        (88.00, 30), 
        (318.00, 15), 
        (142.00, 49), 
        (108.00, 12), 
        (292.00, 34), 
        (68.00, 26), 
        (192.00, 3),
		(145.00, 20), 
        (74.00, 39), 
        (208.00, 5), 
        (82.00, 28), 
        (298.00, 18), 
        (128.00, 47), 
        (98.00, 8), 
        (268.00, 35), 
        (54.00, 21), 
        (178.00, 4);
			
INSERT INTO Compra_Produto (Quantidade_Compra_Produto, FK_Compra_Id, FK_Produto_Id)
	VALUES 
		(1, 1, 219),
		(1, 2, 44), 
        (1, 3, 12),
        (1, 4, 89), 
        (1, 5, 5), 
        (1, 6, 110), 
        (1, 7, 34), 
        (1, 8, 77), 
        (1, 9, 21), 
        (1, 10, 99), 
        (1, 11, 15),
		(1, 12, 42), 
        (1, 13, 11), 
        (1, 14, 88), 
        (1, 15, 6), 
        (1, 16, 108), 
        (1, 17, 33), 
        (1, 18, 76), 
        (1, 19, 20), 
        (1, 20, 98), 
        (1, 21, 14),
		(1, 22, 46), 
        (1, 23, 10), 
        (1, 24, 90), 
        (1, 25, 4), 
        (1, 26, 112), 
        (1, 27, 35), 
        (1, 28, 78), 
        (1, 29, 22), 
        (1, 30, 100), 
        (1, 31, 16),
		(1, 32, 43), 
        (1, 33, 13), 
        (1, 34, 87), 
        (1, 35, 7), 
        (1, 36, 109), 
        (1, 37, 32), 
        (1, 38, 75), 
        (1, 39, 19), 
        (1, 40, 97), 
        (1, 41, 17),
		(1, 42, 45), 
        (1, 43, 9), 
        (1, 44, 91), 
        (1, 45, 8), 
        (1, 46, 111), 
        (1, 47, 36), 
        (1, 48, 79), 
        (1, 49, 23), 
        (1, 50, 101), 
        (1, 51, 18),
		(1, 52, 41), 
        (1, 53, 14), 
        (1, 54, 86), 
        (1, 55, 3), 
        (1, 56, 107), 
        (1, 57, 31), 
        (1, 58, 74), 
        (1, 59, 18), 
        (1, 60, 96), 
        (1, 61, 13),
		(1, 62, 47), 
        (1, 63, 15), 
        (1, 64, 92), 
        (1, 65, 2), 
        (1, 66, 113), 
        (1, 67, 37), 
        (1, 68, 80), 
        (1, 69, 24), 
        (1, 70, 102), 
        (1, 71, 19),
		(1, 72, 40), 
        (1, 73, 16), 
        (1, 74, 85), 
        (1, 75, 1), 
        (1, 76, 106), 
        (1, 77, 30), 
        (1, 78, 73), 
        (1, 79, 17), 
        (1, 80, 95), 
        (1, 81, 12),
		(1, 82, 48), 
        (1, 83, 17),
        (1, 84, 93), 
        (1, 85, 9), 
        (1, 86, 114), 
        (1, 87, 38), 
        (1, 88, 81), 
        (1, 89, 25), 
        (1, 90, 103), 
        (1, 91, 20),
		(1, 92, 39), 
        (1, 93, 18), 
        (1, 94, 84), 
        (1, 95, 10), 
        (1, 96, 105), 
        (1, 97, 29), 
        (1, 98, 72), 
        (1, 99, 16), 
        (1, 100, 94), 
        (1, 101, 11),
		(1, 102, 44), 
        (1, 103, 12), 
        (1, 104, 89), 
        (1, 105, 5), 
        (1, 106, 110), 
        (1, 107, 34), 
        (1, 108, 77), 
        (1, 109, 21), 
        (1, 110, 99), 
        (1, 111, 15),
		(1, 112, 42), 
        (1, 113, 11), 
        (1, 114, 88),
        (1, 115, 6), 
        (1, 116, 108),
        (1, 117, 33), 
        (1, 118, 76), 
        (1, 119, 20), 
        (1, 120, 98), 
        (1, 121, 14),
		(1, 122, 46),
        (1, 123, 10), 
        (1, 124, 90), 
        (1, 125, 4), 
        (1, 126, 112), 
        (1, 127, 35), 
        (1, 128, 78), 
        (1, 129, 22), 
        (1, 130, 100), 
        (1, 131, 16),
		(1, 132, 43), 
        (1, 133, 13), 
        (1, 134, 87), 
        (1, 135, 7), 
        (1, 136, 109), 
        (1, 137, 32), 
        (1, 138, 75), 
        (1, 139, 19), 
        (1, 140, 97), 
        (1, 141, 17),
		(1, 142, 45), 
        (1, 143, 9), 
        (1, 144, 91),
        (1, 145, 8), 
        (1, 146, 111), 
        (1, 147, 36),
        (1, 148, 79), 
        (1, 149, 23), 
        (1, 150, 101), 
        (1, 151, 18),
		(1, 152, 41), 
        (1, 153, 14), 
        (1, 154, 86), 
        (1, 155, 3), 
        (1, 156, 107), 
        (1, 157, 31), 
        (1, 158, 74), 
        (1, 159, 18), 
        (1, 160, 96), 
        (1, 161, 13),
		(1, 162, 47), 
        (1, 163, 15), 
        (1, 164, 92),
        (1, 165, 2), 
        (1, 166, 113),
        (1, 167, 37), 
        (1, 168, 80), 
        (1, 169, 24),
        (1, 170, 102), 
        (1, 171, 19),
		(1, 172, 40), 
        (1, 173, 16), 
        (1, 174, 85), 
        (1, 175, 1), 
        (1, 176, 106),
        (1, 177, 30), 
        (1, 178, 73), 
        (1, 179, 17), 
        (1, 180, 95), 
        (1, 181, 12),
		(1, 182, 48), 
        (1, 183, 17), 
        (1, 184, 93), 
        (1, 185, 9), 
        (1, 186, 114), 
        (1, 187, 38), 
        (1, 188, 81), 
        (1, 189, 25),
        (1, 190, 103), 
        (1, 191, 20),
		(1, 192, 39), 
        (1, 193, 18), 
        (1, 194, 84), 
        (1, 195, 10), 
        (1, 196, 105), 
        (1, 197, 29), 
        (1, 198, 72), 
        (1, 199, 16), 
        (1, 200, 94);
        
        
-- VIEWS --

DROP VIEW IF EXISTS Ver_Dados_Cliente;
DROP VIEW IF EXISTS Ver_Dados_Produto;

CREATE VIEW Ver_Dados_Cliente AS
	SELECT Id_Cliente Id, CPF, Nome_Cliente Nome, Telefone, Email,
		DATE_FORMAT(Data_Cadastro_Cliente, '%H:%i %d/%m/%Y') Data_Cadastro
		FROM cliente;

SELECT * FROM Ver_Dados_Cliente;


CREATE VIEW Ver_Dados_Produto AS
	SELECT Id_Produto Id, Nome_Produto Nome, Preço_Produto Preço, Quantidade_Estoque_Produto Estoque,
		FK_Categoria_Id Categoria, FK_Aparelho_Id Console,
		DATE_FORMAT(Data_Lançamento_Produto, '%d/%m/%Y') Data_Lançamento_Produto
		FROM produto;

SELECT * FROM Ver_Dados_Produto;


-- PROCEDURES --

DROP PROCEDURE IF EXISTS Produtos_Por_Console;
DROP PROCEDURE IF EXISTS Registrar_Compra;
DROP PROCEDURE IF EXISTS Registrar_Compra_Produto;


DELIMITER //

	CREATE PROCEDURE Produtos_Por_Console (Nome_Aparelho VARCHAR(150))

		BEGIN
        
			SELECT 
				a.Id_Aparelho, 
				a.Nome_Aparelho, 
                p.Nome_Produto,
                p.Quantidade_Estoque_Produto AS Estoque_Produto,
                p.Preço_Produto
                
				FROM aparelho AS a
                INNER JOIN produto AS p
					ON a.Id_Aparelho = p.FK_Aparelho_Id
					WHERE a.Nome_Aparelho LIKE CONCAT('%', Nome_Aparelho, '%');
                
		END // 
    
DELIMITER ;


DELIMITER //

	CREATE PROCEDURE Registrar_Compra (Preço_Final_Compra DECIMAL, FK_Cliente_Id INT)

		BEGIN
        
			INSERT INTO Compra (Preço_Final_Compra, FK_Cliente_Id)
                VALUES (Preço_Final_Compra, FK_Cliente_Id);
                
		END // 
    
DELIMITER ;


DELIMITER //

	CREATE PROCEDURE Registrar_Compra_Produto (Quantidade_Compra_Produto INT, 
		Preço_Atual_Compra_Produto DECIMAL, FK_Compra_Id INT, FK_Produto_Id INT)

		BEGIN
			
            INSERT INTO Compra_Produto
				VALUES (Quantidade_Compra_Produto, Preço_Atual_Compra_Produto, FK_Compra_Id, 
                FK_Produto_Id);
			
            UPDATE Produto
				SET Quantidade_Estoque_Produto = Quantidade_Estoque_Produto - Quantidade_Compra_Produto
				WHERE FK_Produto_Id = Id_Produto;
                
		END // 
    
DELIMITER ;


/*

CALL Produtos_Por_Console('Nome do Console');
CALL Registrar_Compra(Preço Final da Compra, Id do Cliente que Comprou);
CALL Registrar_Compra_Produto(Quantidade de um Produto Específico comprado, Preço Atual de um Produto
							Específico Comprado, Id da Compra que Ele Está Presente, Id do Produto
                            Específico Comprado);

*/


-- TRIGGERS --

DROP TRIGGER IF EXISTS Deleta_Endereço;
DROP TRIGGER IF EXISTS Deleta_Categoria;
DROP TRIGGER IF EXISTS Deleta_Aparelho;
DROP TRIGGER IF EXISTS Deleta_Cliente;
DROP TRIGGER IF EXISTS Deleta_Produto;
DROP TRIGGER IF EXISTS Deleta_Compra;
DROP TRIGGER IF EXISTS Deleta_Compra_Produto;
DROP TRIGGER IF EXISTS Compra_Errada;


DELIMITER //

	CREATE TRIGGER Deleta_Endereço
		AFTER DELETE ON Endereço
		FOR EACH ROW
		
		BEGIN
			
			INSERT INTO Log_Endereço (Log_Id_Endereço, Log_CEP, Log_Rua_Avenida, Log_Número, Log_Complemento)
				VALUES 
					(OLD.Id_Endereço, OLD.CEP, OLD.Rua_Avenida, OLD.Número, OLD.Complemento);
			
		END //
    
    
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Deleta_Categoria
		AFTER DELETE ON Categoria
		FOR EACH ROW
		
		BEGIN
			
			INSERT INTO Log_Categoria (Log_Id_Categoria, Log_Nome_Categoria)
				VALUES 
					(OLD.Id_Categoria, OLD.Nome_Categoria);
			
		END //
    
    
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Deleta_Aparelho
		AFTER DELETE ON Aparelho
		FOR EACH ROW
		
		BEGIN
			
			INSERT INTO Log_Aparelho (Log_Id_Aparelho, Log_Nome_Aparelho)
				VALUES 
					(OLD.Id_Aparelho, OLD.Nome_Aparelho);
		END //
		
		
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Deleta_Cliente
		AFTER DELETE ON Cliente
		FOR EACH ROW
		
		BEGIN
			
			INSERT INTO Log_Cliente (Log_Id_Cliente, Log_CPF, Log_Nome_Cliente, Log_Telefone, Log_Email)
				VALUES 
					(OLD.Id_Cliente, OLD.CPF, OLD.Nome_Cliente, OLD.Telefone, OLD.Email);
			
		END //
    
    
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Deleta_Produto
		AFTER DELETE ON Produto
		FOR EACH ROW

		BEGIN
			
			INSERT INTO Log_Produto (Log_Id_Produto, Log_Nome_Produto, Log_Preço_Produto, Log_Quantidade_Estoque_Produto)
				VALUES 
					(OLD.Id_Produto, OLD.Nome_Produto, OLD.Preço_Produto, OLD.Quantidade_Estoque_Produto);
			
		END //
		
    
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Deleta_Compra
		AFTER DELETE ON Compra
		FOR EACH ROW
		
		BEGIN
			
			INSERT INTO Log_Compra (Log_Id_Compra, Log_Preço_Final_Compra)
				VALUES 
					(OLD.Id_Compra, OLD.Preço_Final_Compra);
			
		END //
		
    
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Deleta_Compra_Produto
		AFTER DELETE ON Compra_Produto
		FOR EACH ROW
		
		BEGIN
			
			INSERT INTO Log_Compra_Produto (Log_Id_Compra_Produto, Log_Quantidade_Compra_Produto, Log_Preço_Atual_Compra_Produto)
				VALUES 
					(OLD.Id_Compra_Produto, OLD.Quantidade_Compra_Produto, OLD.Preço_Atual_Compra_Produto);
			
		END //
    
    
DELIMITER ;


DELIMITER //

	CREATE TRIGGER Compra_Errada
		BEFORE INSERT ON Compra_Produto
		FOR EACH ROW
		
		BEGIN
			
			IF NEW.Quantidade_Compra_Produto < 0 THEN
				SIGNAL SQLSTATE '45000'
				SET MESSAGE_TEXT = 'A quantidade disponível no estoque não pode ser negativa';
			END IF;
			
		END //
    
    
DELIMITER ;


-- FUNCTIONS --

DROP FUNCTION IF EXISTS Validação_Compra;
DROP FUNCTION IF EXISTS Desconto;
DROP FUNCTION IF EXISTS Calcular_Lucro_Bruto;
DROP FUNCTION IF EXISTS Calcular_Lucro_Líquido;
DROP FUNCTION IF EXISTS Calcular_Gastos;


DELIMITER //

	CREATE FUNCTION Validação_Compra (Verificador_Id_Compra INT)
		RETURNS VARCHAR(100)
		DETERMINISTIC
		BEGIN

			IF (
				SELECT COUNT(*)
				FROM Compra
				WHERE Id_Compra = Verificador_Id_Compra
			) = 0
				THEN
				RETURN 'Compra não encontrada';
			END IF;
					
			IF ( 
				SELECT SUM(cp.Quantidade_Compra_Produto * cp.Preço_Atual_Compra_Produto)
				FROM Compra_Produto cp
				WHERE cp.FK_Compra_Id = Verificador_Id_Compra
			)	IS NULL THEN
				RETURN 'Valor final da compra é nulo';
			END IF;
			
			IF (
				SELECT Preço_Final_Compra
					FROM Compra
					WHERE Id_Compra = Verificador_Id_Compra
			) != (
				SELECT SUM(Quantidade_Compra_Produto * Preço_Atual_Compra_Produto)
					FROM Compra_Produto
					WHERE FK_Compra_Id = Verificador_Id_Compra
				) 
				THEN
				RETURN 'Valor final não condizente com o valor de compra';
			ELSE
				RETURN 'Valor final condizente com o valor de compra';
			END IF;
			
		END //

DELIMITER ;


DELIMITER //

	CREATE FUNCTION Desconto
		(Preço_Produto DECIMAL(10, 2), Valor_Desconto DECIMAL(10, 2))
		RETURNS DECIMAL(10, 2)
		DETERMINISTIC
		BEGIN
			
			RETURN Preço_Produto - (Preço_Produto * Valor_Desconto / 100);
			
		END //

DELIMITER ;


DELIMITER //

	CREATE FUNCTION Calcular_Lucro_Bruto()
		RETURNS DECIMAL(10, 2)
		DETERMINISTIC
		BEGIN
				
			RETURN (
				SELECT SUM(Preço_Final_Compra)
					FROM Compra
			);
			
		END //

DELIMITER ;


DELIMITER //

	CREATE FUNCTION Calcular_Gastos
		(
			
			Aluguel DECIMAL(10, 2),
			Condomínio DECIMAL(10, 2),
			Valor_Venal DECIMAL(10, 2),
			Manutenção DECIMAL(10, 2),
			Imposto_por_Venda DECIMAL(10, 2),
			Perdas DECIMAL(10, 2),
			Internet DECIMAL(10, 2)
			
		)
		RETURNS DECIMAL(10, 2)
		DETERMINISTIC
		BEGIN
				
			RETURN Aluguel + Condomínio + (Valor_Venal * 0.1) + 
				(Calcular_Lucro_Bruto() * Imposto_por_Venda / 100) +
				Manutenção + (Calcular_Lucro_Bruto() + Perdas / 100) + Internet;
			
		END //

DELIMITER ;


DELIMITER //

	CREATE FUNCTION Calcular_Lucro_Líquido()
		RETURNS DECIMAL(10, 2)
		DETERMINISTIC
		BEGIN
				
			RETURN Calcular_Lucro_Bruto() - Calcular_Gastos(3250, 550, 2000, 550, 8, 3, 750);
			
		END //

DELIMITER ;



/*

SELECT Validação_Compra(Número da Compra para ser verificada);

SELECT 
	Nome_Produto, 
    Preço_Produto AS Preço_Original,
    Desconto_de_Agosto(Preço_Produto, Valor do Desconto) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto, 
    FK_Categoria_Id, 
	FK_Aparelho_Id, 
    Data_Lançamento_Produto
    FROM Produto;
    
SELECT Calcular_Lucro_Bruto(*VAZIO*)

SELECT Calcular_Gastos(Aluguel, Condomínio, Valor Venal, Impostos, Manutenção, Perdas, Internet)

SELECT Calcular_Lucro_Líquido(*VAZIO*, mas necessário com os mesmos valores de dentro do Gastos)
    
*/


-- SELECTS --

	-- Cliente / Enderço --
SELECT c.Id_Cliente AS Id_Cliente, c.Nome_Cliente AS Nome, e.CEP AS CEP, 
	e.Rua_Avenida AS Endreço, e.Número AS Número, e.Complemento AS Complemento
	FROM cliente c
	JOIN endereço e
		WHERE c.FK_Endereço_Id = e.Id_Endereço;

	-- Cliente / Compra --
SELECT cl.Id_Cliente AS Id_Cliente, cl.Nome_Cliente AS Nome, cp.Id_Compra AS Id_Compra, 
	cp.Preço_Final_Compra AS Gastos, cp.Data_Compra
    FROM cliente cl
    JOIN compra cp
		WHERE cl.Id_Cliente = cp.FK_Cliente_Id;

	-- Cliente / Compra / Data Compra --
SELECT cl.Id_Cliente AS Id_Cliente, cl.Nome_Cliente AS Nome, 
	cop.Quantidade_Compra_Produto AS Quantidade_Comprada, 
    cop.Preço_Atual_Compra_Produto AS Preço_por_Produto, 
    DATE_FORMAT(Data_Compra, '%H:%i %d/%m/%Y') AS Data_Compra
    FROM cliente cl
    JOIN compra cp 
		ON cl.Id_Cliente = cp.FK_Cliente_Id
    JOIN compra_produto cop
		ON cp.Id_Compra = cop.FK_Compra_Id;

	-- Cliente / Soma Gastos --
SELECT cl.Id_Cliente AS Id_Cliente, cl.Nome_Cliente AS Nome, 
	SUM(cop.Preço_Atual_Compra_Produto) AS Soma_Gastos
    FROM cliente cl
    JOIN compra cp 
		ON cl.Id_Cliente = cp.FK_Cliente_Id
    JOIN compra_produto cop
		ON cp.Id_Compra = cop.FK_Compra_Id
	GROUP BY cl.Id_Cliente;

	-- Verificação dos Descontos (TODOS OS PRODUTOS)--
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto;

	-- Validação Compra --
SELECT Validação_Compra(1);


	-- Verificação dos Descontos (CATEGORIAS ESPECÍFICAS)--
    
    -- Cartucho/Fita --
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
    WHERE FK_Categoria_Id = 1;
    

    -- Acessórios --

SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
    WHERE FK_Categoria_Id = 2;
    
    -- Consoles --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
    WHERE FK_Categoria_Id = 3;
    
    
	-- Verificação dos Descontos (MARCAS ESPECÍFICAS)--
    
    -- SONY --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
    WHERE (Id_Produto BETWEEN 1 AND 12)
		OR (Id_Produto BETWEEN 61 AND 171)
        OR (Id_Produto BETWEEN 479 AND 517);
    
    -- MICROSOFT / XBOX --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
	WHERE (Id_Produto BETWEEN 13 AND 19)
		OR (Id_Produto BETWEEN 172 AND 211)
		OR (Id_Produto BETWEEN 518 AND 537);
    
    -- NINTENDO --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
	WHERE (Id_Produto BETWEEN 20 AND 42)
		OR (Id_Produto BETWEEN 212 AND 348)
		OR (Id_Produto BETWEEN 538 AND 582);
        
    -- ATARI --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
	WHERE (Id_Produto = 43)
		OR (Id_Produto BETWEEN 57 AND 60)
		OR (Id_Produto BETWEEN 349 AND 358)
        OR (Id_Produto BETWEEN 439 AND 478)
        OR (Id_Produto BETWEEN 604 AND 611);

    -- MATTEL --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
	WHERE (Id_Produto = 44)
		OR (Id_Produto BETWEEN 359 AND 368);
        
    -- SEGA --
    
SELECT 
	Nome_Produto AS Nome, 
    Preço_Produto AS Preço_Original,
    Desconto(Preço_Produto, 20) AS Preço_Com_Desconto,
    Quantidade_Estoque_Produto AS Estoque, 
    FK_Categoria_Id AS Id_Categoria, 
	FK_Aparelho_Id AS Id_Aparelho, 
    Data_Lançamento_Produto
    FROM Produto
	WHERE (Id_Produto BETWEEN 45 AND 56)
		OR (Id_Produto BETWEEN 369 AND 438)
        OR(Id_Produto BETWEEN 583 AND 603);
        
        
    -- LUCRO BRUTO / GASTOS / LUCRO LÍQUIDO --        
    
SELECT Calcular_Lucro_Bruto() AS Lucro_Bruto, 
		Calcular_Gastos(3250, 550, 2000, 550, 8, 3, 750) Gastos, 
		Calcular_Lucro_Líquido() Lucro_Líquido;


	-- VER DADOS --
    
SELECT * FROM Ver_Dados_Cliente;

SELECT * FROM Ver_Dados_Produto;