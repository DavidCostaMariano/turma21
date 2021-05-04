package exemplos;

import java.util.Scanner;

public class OiMundo 
{

		public static void main (String [] args) 
		{
			Scanner leia = new Scanner(System.in);
			//variaveis
			
			String nome;
			int numero1;
			int numero2;
			double salario = 0.00;//real
			char op = 's'; //caracter
			
					
			//entradas
			System.out.println("Insira seu nome: ");
			nome = leia.next();
			System.out.println("Insira o valor do seu salario: ");
			salario = leia.nextDouble();

			System.out.println("Seu nome é: "+nome);
			System.out.println("Seu salario é: "+ salario);
			System.out.println("Digite um numero: ");
			numero1 = leia.nextInt();
			System.out.println("Digite o numero 2: ");
			numero2 = leia.nextInt();
			System.out.println("A Soma: "+(numero1 + numero2));
			//processamento
			
			//saida
			leia.close();
		}
		
}
