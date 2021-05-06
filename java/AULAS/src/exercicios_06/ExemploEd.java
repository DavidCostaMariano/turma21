package exercicios_06;
import java.util.Scanner;
public class ExemploEd {

	public static void main (String[]args)
	{
		Scanner leia = new Scanner(System.in);
		
		final int HABITANTES = 3;
		double salario=0.0;
		double somaSalario=0.0;
		double mediaSalario=0.0;
		int filhos=0;
		int somaFilho=0;
		double mediaFilhos=0.0;
		double maiorSalario=0.0;
		double percentualSalarioAte100=0.0;
		double contadorSalarioAte100 = 0.0;
		
		for(int x = 0; x < HABITANTES; x++)
		{
		System.out.printf("Insira o salario do %d habitante: ",x+1);
		salario = leia.nextDouble();
		somaSalario += salario;
		System.out.printf("Quantos filhos a familia do habitante %d tem?: ",x+1);
		filhos = leia.nextInt();
		somaFilho += filhos;
		
		if(salario > maiorSalario)
		{
			maiorSalario=salario;
		}
		if (salario<=100)
		{
			contadorSalarioAte100++;
		}
		}
		mediaFilhos = (somaFilho / HABITANTES);
		mediaSalario = (somaSalario / HABITANTES);
		percentualSalarioAte100 = ((contadorSalarioAte100 /HABITANTES) * 100);
		
		System.out.println();
		System.out.println("----------------RESUTADO DA PEQUISA----------------\n");
		System.out.printf("\nTotal de salarios : R$ %.2f",somaSalario);
		System.out.printf("\nMédia salarial    : R$ %.2f",mediaSalario);
		System.out.printf("\nMaior salario     : R$ %.2f",maiorSalario);
		System.out.printf("\nTotal de filhos   : %d",somaFilho);
		System.out.printf("\nMédia filhos      : %.2f",mediaFilhos);
		System.out.printf("\nPercentual de pessoas com salario até 100 %.2f%%",percentualSalarioAte100);
		leia.close();
	}
		
	
	}
