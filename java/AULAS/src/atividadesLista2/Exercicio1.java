package atividadesLista2;
import java.util.Scanner;
	public class Exercicio1 {
		public static void main(String[]args) {
			Scanner leia = new Scanner (System.in);
		 
			double numero1;
			double numero2;
			double numero3;
	
			System.out.print("Entre com o numero 1: ");
			numero1 = leia.nextInt();
			System.out.print("Entre com o numero 2: ");
			numero2 = leia.nextInt();
			System.out.print("Entre com o numero 3: ");
			numero3 = leia.nextInt();
			
			if(numero1 > numero2 && numero1 > numero3)
			{
				System.out.printf("O primeiro numero é o maior O valor foi %.2f",numero1);
			}
			else if(numero2 > numero1 && numero2 > numero3)
			{
				System.out.printf("O segundo numero é o maior O valor foi %.2f" , numero2);
			}
			else if (numero3 > numero1 && numero3>numero2)
			{
				System.out.printf("O terceiro numero é o maior! O valor foi %.2f",numero3);
			}
			else
			{
				System.out.println("Algum valor digitado é igual a outro, por isso não existe um valor maior!");
			}
			leia.close();
	}
}
