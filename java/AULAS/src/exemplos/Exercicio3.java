package exemplos;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String []args) {
		
		Scanner leia = new Scanner(System.in);
		int tempo;
		int horas;
		int minutos;
		int segundos;
		
		System.out.println("Informe o tempo em segundos: ");
		tempo = leia.nextInt();
		horas = tempo/3600;
		minutos = (tempo/60)%60;
		segundos = tempo%60;
		System.out.println("O tempo de duraçao foi de: "+ horas + " hora(s) " + minutos +" minutos "+ segundos+" segundos");
	
	leia.close();
	}
}
