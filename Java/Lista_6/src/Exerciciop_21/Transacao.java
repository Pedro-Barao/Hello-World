package Exerciciop_21;

public class Transacao {

	private String descricao;
	private Double valor;
	
	Transacao(Double valor, String descricao)
	{
		
		this.valor = valor;
		this.descricao = descricao;
		
	}
	
	public String getDescricao()
	{
		
		return descricao;
		
	}
	
	public Double getValor()
	{
		
		return valor;
		
	}
	
}
