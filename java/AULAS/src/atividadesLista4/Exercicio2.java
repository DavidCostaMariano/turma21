package atividadesLista4;
import java.util.Scanner;
public class Exercicio2 {
public static void main(String []args) {
	Scanner leia = new Scanner (System.in);
	int numeros[]= new int [6];
	int somaPar = 0;
	int qtdNumerosImpares=0;
	System.out.println("Insira o valor dos 6 numeros desejados");
	
	for(int x =0; x<6; x++) {
	numeros[x]=leia.nextInt();
	
	}
	for (int x =0;x<6;x++) 
	{
		if((numeros[x]%2)==0)
		{		
			System.out.printf("\nNumero par: %d",numeros[x]);
			somaPar += numeros[x];
		}
		else 
		{
			qtdNumerosImpares++;
		}
		
	}
	System.out.printf("A soma dos valores pares é: %d",somaPar);
	System.out.printf("\nA quantidade de numeros impares digitados é: %d",qtdNumerosImpares);
	}
}