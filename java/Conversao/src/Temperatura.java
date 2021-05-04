import java.util.Scanner;
public class Temperatura {

	public static void main (String[]args)
		{
		Scanner leia = new Scanner(System.in);
			String nome;
			double celsius;
			double farenheit;
			System.out.print("Por favor insira o seu nome: ");
			nome = leia.next();
			System.out.print(nome + " Por favor insira a temperatura em celsius: ");
			celsius = leia.nextDouble();
			farenheit = ((celsius*9/5) + 32);
			//System.out.print(nome+" a temperatura informada em celsius convertida para farenheit é igual a: "+farenheit);
			System.out.printf("Nome: %s a temperatura em Fahrenheit é: %.2f",nome,farenheit);
		leia.close();
		}
		
}
