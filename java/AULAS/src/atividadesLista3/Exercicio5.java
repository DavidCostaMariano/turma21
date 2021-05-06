package atividadesLista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[]args) {
			
		Scanner leia = new Scanner (System.in);
		int numero = 0;
		int somaTotal = 0;

		do 
		{

			System.out.println("Insira um valor qualquer: ");
			numero = leia.nextInt();
			somaTotal+=numero;
		}
		while((numero%2)!=0);
		
		System.out.printf("A soma de todos os valores informados é: %d",somaTotal);
		leia.close();
	}
}
