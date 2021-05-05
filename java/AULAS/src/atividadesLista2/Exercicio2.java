package atividadesLista2;
import java.util.Scanner;
	public class Exercicio2 {
		public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		double numero1;
		double numero2;
		double numero3;
		
		System.out.print("Insira o valor do primeiro numero: ");
		numero1 = leia.nextDouble();
		System.out.print("Insira o valor do segundo numero: ");
		numero2 = leia.nextDouble();
		System.out.print("Insira o valor do terceiro numero: ");
		numero3 = leia.nextDouble();
		
		if(numero1 >= numero2 && numero1>=numero3 && numero2>=numero3)
		{
			System.out.println("A sequencia crescente é: ");
			System.out.println(numero3);
			System.out.println(numero2);
			System.out.println(numero1);
		}
		else if(numero1> numero2 && numero1>numero3 && numero3>numero2)
		{
			System.out.println("A sequencia crescente é: ");
			System.out.println(numero2);
			System.out.println(numero3);
			System.out.println(numero1);
		}
		else if (numero2>=numero1 && numero2>=numero3 &&numero3>=numero1)
		{
			System.out.println("A sequencia crescente é: ");
			System.out.println(numero1);
			System.out.println(numero3);
			System.out.println(numero2);
		}
		else if (numero2>= numero1 && numero2>= numero3 &&numero1>=numero3)
		{
			System.out.println("A sequencia crescente é: ");
			System.out.println(numero3);
			System.out.println(numero1);
			System.out.println(numero2);
		}
		else if (numero3>= numero2 && numero3>= numero1 &&numero2>=numero1)
		{
			System.out.println("A sequencia crescente é: ");
			System.out.println(numero1);
			System.out.println(numero2);
			System.out.println(numero3);
		}
		else if (numero3>= numero1 && numero3>= numero2 &&numero1>=numero2)
		{
			System.out.println("A sequencia crescente é: ");
			System.out.println(numero2);
			System.out.println(numero1);
			System.out.println(numero3);
		}
	leia.close();
		
		}
	}
