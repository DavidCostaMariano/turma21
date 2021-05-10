package exercicios_10;

import entidades.Pessoas;
import java.util.Scanner;
public class Cadastro {

	public static void main (String[]args)
	{
		Scanner leia = new Scanner(System.in);
		Pessoas pessoa1 = new Pessoas();
		
		System.out.print("Olá, por favor insira seu nome!: ");
		pessoa1.nome = leia.nextLine();
		System.out.printf("Ola %s por favor insira seu ano de nascimento ",pessoa1.nome);
		pessoa1.anoDeNascimento = leia.nextInt();
		System.out.print("Insira seu genero M/F/O ");
		pessoa1.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("O aluno está vivo? 1 - vivo | 2 - morto ");
		pessoa1.vivo = leia.nextInt() == 1? true : false;

		System.out.printf("Olá %s ",(pessoa1.nome));
		pessoa1.idade();
		System.out.printf("Voce se identifica no genero %c",pessoa1.genero);
		System.out.printf("\nVoce ta %s" ,(pessoa1.vivo? "Vivo": "Morto"));
		
	}
	}
