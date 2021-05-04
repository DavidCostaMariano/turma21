package exemplos;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[]args) 
	{
		Scanner leia = new Scanner(System.in);
		
		int anos;
		int dias;
		int meses;
		int dia;
		//entrada
		System.out.println("Informe quantos dias de vida você tem: ");
		dias = leia.nextInt();
		anos = dias/365;
		meses = ((dias%365)/30);
		dia = ((dias%365)%30);
		System.out.println("Você tem " + anos + " ano(s) " + meses + " meses e " + dia + " dias de vida");
		leia.close();
		
		
	}
	
	
}

