DROP FUNCTION IF EXISTS preco_com_margem;

CREATE FUNCTION preco_com_margem (valor FLOAT)
	RETURNS FLOAT
    DETERMINISTIC
		RETURN (valor * 1.1)