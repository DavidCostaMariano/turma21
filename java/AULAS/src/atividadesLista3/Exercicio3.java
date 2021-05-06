package atividadesLista3;
import java.util.Scanner;
public class Exercicio3 {

	public static void main (String[]args) 
	{
		int qtdPessoasmenos21 = 0;
		int qtdPessoasmais50 = 0;
		int idade = 0;
		
		Scanner leia = new Scanner (System.in);
		
		while(idade != -99)
		{
			System.out.println("Insira sua idade: ");
			idade= leia.nextInt();
			   
	           
			  if(idade <21)
			  {
				  qtdPessoasmenos21++;
			  }
			  else if(idade>50)
			  {
				  qtdPessoasmais50++;
			  }
			
		
		}
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + qtdPessoasmais50);
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + qtdPessoasmenos21);
		leia.close();
	}
}
