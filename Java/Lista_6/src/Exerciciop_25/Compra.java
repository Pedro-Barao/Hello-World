package Exerciciop_25;

import java.util.List;
import java.util.ArrayList;

public class Compra {

	private int id;
	private List<Item> item;
	
	Compra(int id, List<Item> item)
	{
		
		this.id = id;
		this.item = item;
		
	}
	
	public int getId()
	{
		
		return id;
		
	}
	
	public List<Item> getItem()
	{
		
		return item;
		
	}
	
}
