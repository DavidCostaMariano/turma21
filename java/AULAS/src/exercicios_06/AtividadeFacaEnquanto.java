package exercicios_06;
import java.util.Scanner;
public class AtividadeFacaEnquanto {
	public static void main(String[]args) {
		
	
	Scanner leia = new Scanner (System.in);

	
	int numero = 0;
	System.out.println("Insira um numero entre 233 e 456");
	numero = leia.nextInt();
	do
	{
		if (numero >=300 && numero <=400) 
		{
		System.out.printf("%d + 3 =",numero);
		numero +=3;
		System.out.println(numero);
		}
		
		if (numero >=233 && numero <300 || numero >400 && numero<456)
		{
			System.out.printf("%d + 5 =",numero);
			numero += 5;
			System.out.println(numero);
		}
		
	

} while(numero >=233 && numero <456);
	
	if(numero <233 || numero >456) 
	{
		System.out.println("O numero inserido nao esta entre 233 a 456");
	}
	}
	}