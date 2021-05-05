package atividadesLista1;
import java.util.Scanner;
public class Exercicio8 {
	public static void main (String[]args) 
	{
		Scanner leia = new Scanner(System.in);
		
		double PDISTRIBUIDOR = 0.28;
		double PIMPOSTO = 0.45;
		double custoConsumidor = 0.00;
		double custoFabrica = 0.00;
		int percentagemDistribuidor = 0;
		double imposto = 0.00;
		
		System.out.println("Digite o custo de fabrico em R$: ");
		custoFabrica = leia.nextDouble();
		percentagemDistribuidor =   (int) (custoFabrica * PDISTRIBUIDOR);
		imposto = custoFabrica * PIMPOSTO;
		custoConsumidor = (int)percentagemDistribuidor + imposto + custoFabrica;
		System.out.println("Custo de fabrica: R$ " + custoFabrica);
		System.out.println("Distribuidor: R$ " + percentagemDistribuidor);
		System.out.println("Imposto: R$ " + imposto);
		System.out.println("Custo para o Consumidor: R$ " + custoConsumidor);
		leia.close();
		
	}
	
	
}
