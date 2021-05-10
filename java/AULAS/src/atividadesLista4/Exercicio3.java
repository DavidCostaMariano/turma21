package atividadesLista4;
import java.util.Scanner;
public class Exercicio3 {
public static void main (String[]args) {
	Scanner leia = new Scanner (System.in);
	int matriz[][] = new int [3][3];
	int maior10= 0;
	System.out.println("Insira os 9 valores da matriz: ");
	for(int linha=0; linha<3;linha++)
	{
		for(int coluna=0;coluna<3;coluna++) {
		matriz[linha][coluna] = leia.nextInt();
	if(matriz[linha][coluna] >10 ) 
	{
		maior10++;
	}
		}
	}
	
	for(int linha=0; linha<3;linha++)
	{System.out.print("[\t");
		for(int coluna=0;coluna<3;coluna++) {
			
			System.out.print(matriz[linha][coluna]+"\t");
	}
		
		System.out.print("\n");
	}
	System.out.print("]");
	System.out.printf("A matriz possui %d numeros maior que 10",maior10);
	leia.close();
}
}