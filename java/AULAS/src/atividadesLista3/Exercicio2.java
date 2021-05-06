package atividadesLista3;
import java.util.Scanner;
public class Exercicio2 {
	
	public static void main(String[]args) {
		Scanner leia = new Scanner (System.in);
		int numero;
		int qtdNumeroImpar=0;
		int qtdNumeroPar=0;
		for(int x=0; x <10;x++) {
	System.out.print("Digite um número: ");
	numero = leia.nextInt();
		if((numero%2)==0)
		{
			qtdNumeroPar++;
		}
		else 
		{
			qtdNumeroImpar++;
		}
		
	}
	System.out.printf("\nA quantidade de numeros impares foi: %d",qtdNumeroImpar);	
	System.out.printf("\nA quantidade de numeros pares foi: %d",qtdNumeroPar);	
	
	leia.close();
	}
}
