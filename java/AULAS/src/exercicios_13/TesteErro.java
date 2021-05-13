package exercicios_13;

import java.util.Scanner;

public class TesteErro {

	public static void main (String[]args) {
		
		
		Scanner leia = new Scanner(System.in);
		int valor;
		String nomes[] = new String [3];
		
		try // tratamento de erro no programa
		{
			System.out.print("Digite o numero da posição de [1 a 3] para cadastrar o nome: ");
			valor = leia.nextInt();
			System.out.print("Digite o nome da pessoa a ser cadastrada: ");
			nomes[valor] = leia.next().toUpperCase();
			System.out.println(nomes[valor]);
		}
		
		catch(java.lang.ArrayIndexOutOfBoundsException erro) // tratamento de erro no programa
		{
			System.out.println("Você colocou um tamanho de vetor maior que o permitido");
		}
		catch(java.util.InputMismatchException erro)
		{
			System.out.println("Você inseriu letra onde só podia inserir numero");
		}
		finally 
		{}
		
		System.out.println("Fim de programa!!");
		
				
	}
}
