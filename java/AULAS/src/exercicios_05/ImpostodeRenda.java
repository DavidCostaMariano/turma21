package exercicios_05;
import java.util.Scanner;
public class ImpostodeRenda {

	public static void main(String[] args) {
		/*
		 * IR
nome do contribuinte
masculino, feminino, outro - M/F/O
emergencial SIM/NÃO - true/false
salario bruto -
se a soma do salario bruto anual foi acima de 60 mil paga IR por faixa
senão é isento/isenta/isente
se é isento e usou o emergencial - não é  fraude - vc tem direito a mais um emergencial
acima de 5000 até 6000 - 15%
6000 e 10000 - 17%
acima de 10.000 25%
se pegou o emergencial - fraude  - devolar o valor - 600 * 5
		 */
		Scanner leia = new Scanner (System.in);
		//variaveis
		final double imposto1, imposto2, imposto3;
		final int valorEmergencial = 3000;
		imposto1 = 0.15;
		imposto2 = 0.17;
		imposto3 = 0.25;
		String nomeContribuinte;
		char opcaoGenero;
		boolean emergencial = true;
		double salario = 0.00;
		double somaSalario = 0.00;
		double valorImposto,valorTotal;
		int opcaoemergencial = 0;
		//entradas
		System.out.print("Insira o seu nome:");
		nomeContribuinte = leia.next();
		System.out.print("Insira o genero que você se identifica M/F/O: ");
		opcaoGenero = leia.next().charAt(0);
		System.out.print("Insira quanto você ganha por mês: ");
		salario = leia.nextDouble();
		somaSalario = salario * 12;
		System.out.print("Você pegou o auxilio emergencial? Digite 1 para sim ou 2 para não: ");
		opcaoemergencial = leia.nextInt();
		if(opcaoemergencial ==1) 
		{
			emergencial=true;
		}
		else 
		{
			emergencial=false;
		}
		if(somaSalario >60000)
		{
			System.out.println("Você terá de pagar o imposto de renda");
		}
		else 
		{
			if(opcaoGenero =='m' || opcaoGenero=='M')
			{
				System.out.println("Você é isento!!");
			}
			if(opcaoGenero =='f' || opcaoGenero=='F')
			{
				System.out.println("Você é isenta!!");
			}
			if(opcaoGenero =='o' || opcaoGenero=='O')
			{
				System.out.println("Você é isente!!");
			}
			
		}
		
		if(salario>5000 && salario <=6000) 
		{
			valorImposto = 	somaSalario *	imposto1;	
			if(emergencial == true)
			{
			valorTotal = valorEmergencial + valorImposto;
			System.out.printf("O valor do IR mais o Auxilio emergencial fraudado é de: %.2f", valorTotal);
			}
			else
			{
				System.out.printf("Você terá de pagar o seu imposto de renda no valor de %.2f",valorImposto);
			}
		}
		else if(salario>6000 && salario <=10000)
		{
			valorImposto = somaSalario * imposto2;
			if(emergencial == true)
			{
				valorTotal = valorEmergencial + valorImposto;
				System.out.printf("O valor do IR mais o Auxilio emergencial fraudado é de: %.2f", valorTotal);
			}
			else
			{
				System.out.printf("Você terá de pagar o seu imposto de renda no valor de %.2f",valorImposto);
			}
		}
		else if(salario >10000)
		{
			valorImposto = somaSalario * imposto3;
			if(emergencial == true) 
			{
				valorTotal = valorEmergencial + valorImposto;
				System.out.printf("O valor do IR mais o Auxilio emergencial fraudado é de: %.2f", valorTotal);
			}
			else 
			{
				System.out.printf("Você terá de pagar o seu imposto de renda no valor de %.2f",valorImposto);
			}
		}
		
	
		leia.close();
	
	}

}
