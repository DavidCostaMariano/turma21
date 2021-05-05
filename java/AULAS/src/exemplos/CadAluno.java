package exemplos;
import java.util.Scanner;
public class CadAluno {

	public static void main(String[] args) {
	
		//variaveis
		Scanner leia = new Scanner(System.in);
		String nome = "";
		int anoNascimento = 0;
		char tipo = ' ';
		double salario = 0.00;
		boolean vivo=true;
		
		//entradas
		System.out.print("Digite o seu nome completo: ");
		nome = leia.nextLine().toUpperCase();
		System.out.print("Digite o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();
		System.out.print("Digite o salario: ");
		salario = leia.nextDouble();
		System.out.print("Digite M/F/O: ");
		tipo = leia.next().toUpperCase().charAt(0);
		
		//%s - string
		//%d - int
		//%.("numero de casas")f - double
		//%c - char
		System.out.printf("Nome: %s idade: %d, voce se identifica do genero %c salario: %.2f",nome,(2021-anoNascimento),tipo,salario);
		//processamentos
		
		//saidas
		leia.close();
	}

}
