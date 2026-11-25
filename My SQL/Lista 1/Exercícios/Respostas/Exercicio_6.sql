CREATE TABLE pedido_compra (

	id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    data_pedido DATE NOT NULL,
    CONSTRAINT fk_cliente_id FOREIGN KEY (cliente_id) REFERENCES cliente(id_cliente),
    CONSTRAINT fk_produto_id FOREIGN KEY (produto_id) REFERENCES produto(id_produto),
    status_pedido VARCHAR(10)
    
);