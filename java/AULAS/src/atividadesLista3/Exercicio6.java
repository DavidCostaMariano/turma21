package atividadesLista3;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		double media = 0;
		int somaTotal = 0;
		int numero = 0;
		int qtdNumerosDigitados=0;
		int opcao;
		do {
		System.out.print("Insira um valor: ");
		numero = leia.nextInt();
		qtdNumerosDigitados++;
		if((numero%3) ==0)
		{
			somaTotal +=numero;
					
		}
		System.out.print("Voc� deseja sair? 0-SIM ou 1-NAO: ");
		opcao = leia.nextInt();
		}
		while(opcao!=0);
		media = somaTotal/qtdNumerosDigitados;
		System.out.printf("A soma dos valores que s�o multiplos de 3 �: %d",somaTotal);
		System.out.printf("\nA media dos valores que s�o multiplos de 3 �: %.2f",media);
	leia.close();	
	}
	
}

