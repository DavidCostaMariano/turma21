package entidades;

public class Pessoas {

	
	public String nome;
	public int anoDeNascimento;
	public char genero;
	public boolean vivo;
	public char vivoounao;
	
	public void idade()
	{
		System.out.println("Sua idade �: "+(2021-anoDeNascimento));
	}
	
}
