package exercicios_07;
import java.util.Scanner;
public class ExemploEd1 {
	public static void main (String[]args)
	{
		Scanner leia = new Scanner (System.in);
		int pontos[] = new int[5]; // 0 - 4
		int maiorPontuacao=0;
		
		for (int x =0; x < 5 ; x++)
		{
			System.out.println("Digite sua pontuação nas atividades: ");
			pontos[x] = leia.nextInt();
			
			if(maiorPontuacao < pontos[x])
			{
				maiorPontuacao = pontos[x];
			}
		}
		System.out.printf("A maior pontuação foi de: %d ",maiorPontuacao);
	}
}
