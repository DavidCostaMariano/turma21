package atividadesLista2;
import java.util.Scanner;
	public class Exercicio3 {
		public static void main(String[]args) {
			
		
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.print("Insira a sua idade: ");
		idade = leia.nextInt();
		if(idade >=10 && idade <=14) 
		{
			System.out.println("Você se encontra na categoria INFANTIL");
		}
		else if(idade >=15 && idade <=17)
		{
			System.out.println("Você se encontra na categoria JUVENIL");
		}
		else if(idade>=18 && idade <=25)
		{
			System.out.println("Você se encontra na catergoria ADULTO");
		}
		else 
		{
			System.out.println("A sua idade não se encaixa em nenhuma categoria");
			
		}
		leia.close();
		}
}
