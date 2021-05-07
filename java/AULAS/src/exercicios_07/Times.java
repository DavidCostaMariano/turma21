package exercicios_07;
import java.util.Scanner;

public class Times {
	public static void main(String[]args)
	{
		Scanner leia = new Scanner (System.in);
		
		int pontos[] = new int [4];
		String times [] = {"SPFC","SANTOS","PALMEIRAS","CORINTHIANS"};
		final int rodadas = 3;
		char g, p ,e, resultado;
		int numeroTimes = 4;
		
		for(int i=0; i <rodadas; i++)
		{
			
			for (int j=0; j<4; j++)
			{
				System.out.printf("Informe o resultado do time: %s na rodada %d: ",times[j],i+1);
				resultado = leia.next().toUpperCase().charAt(0);
			
			if(resultado =='G')
			{
				pontos[j] +=3;
			}
			else if(resultado == 'P')
			{
				pontos [j] +=0;
			}
			else 
			{
				pontos[j] +=1;
			}
		}
		}
		for (int i = 0 ; i < numeroTimes; i ++)
		{
			System.out.printf("\nA pontuação do time %s é: %d",times[i], pontos[i]);
		}
	
	}
}
