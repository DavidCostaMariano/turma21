package atividadesLista2;
import java.util.Scanner;
public class Exercicio4 {

	public static void main (String []args) {
		Scanner leia = new Scanner (System.in);
		double numero;
		
		System.out.println("Insira um valor positivo e inteiro: ");
		numero = leia.nextDouble();
		if ((numero%2)==0)
		{
			numero = Math.sqrt(numero);
			System.out.printf("O numero � par e a raiz quadrada dele � %.2f",numero);
		}
		if ((numero%2)==1)
		{
			numero = Math.pow(numero, 2);
			System.out.printf("O numero � impar e o quadrado dele � %.2f",numero);
		}
		leia.close();
		
		
	}
}
