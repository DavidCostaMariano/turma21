package atividadesLista4;
import java.util.Scanner;
public class Exercicio4 {
public static void main (String[]args) {
	Scanner leia = new Scanner(System.in);
	double matriz[][] = new double [2][2];
	double matriz2[][] = new double [2][2];
	double matriz3[][] = new double [2][2];
	double matriz4[][] = new double [2][2];
	
	char op;
	System.out.println("Insira os valores da matriz: ");
	
	for(int linha=0; linha <2; linha++) 
	{
		for(int coluna=0;coluna<2;coluna++)
		{
			matriz[linha][coluna]=leia.nextDouble();
		}
		
	}
	System.out.println("Agora insira os valores da segunda matriz ");
	
	for(int linha=0; linha <2; linha++) 
	{
		for(int coluna=0;coluna<2;coluna++)
		{
			matriz2[linha][coluna]=leia.nextDouble();
		}
		
	}
	do
	{
	System.out.println("O que você deseja fazer com os valores?\n1 - SOMAR AS DUAS MATRIZES \n2 - SUBTRAIR A PRIMEIRA DA SEGUNDA MATRIZ\n3 - ADICIONAR UMA CONSTANTE AS DUAS MATRIZES\n4 - IMPRIMIR AS MATRIZES\nDIGITE O NUMERO DESEJADO: ");
	op = leia.next().toUpperCase().charAt(0);
	if(op == '1')
	{
		System.out.println("Os valores são: ");
		
		for(int linha=0; linha <2; linha++) 
		{
			System.out.print("[\t");
			for(int coluna=0;coluna<2;coluna++)
			{
				
				matriz3[linha][coluna]= matriz[linha][coluna]+matriz2[linha][coluna];
				System.out.print(matriz3[linha][coluna]+"\t");
			}
			
			System.out.print("]");
			System.out.print("\n");
		}
		
	}
	else if(op =='2')
	{
		System.out.println("Os valores são: ");
	
		for(int linha=0; linha <2; linha++) 
		{
			System.out.print("[\t");
			for(int coluna=0;coluna<2;coluna++)
			{
				
				matriz4[linha][coluna]= matriz[linha][coluna]-matriz2[linha][coluna];
				System.out.print(matriz4[linha][coluna]+"\t");
			}
			System.out.print("]");
			System.out.print("\n");
			
		}
		
	}
	else if(op =='3')
	{
		System.out.print("Digite o valor da constante: ");
		final double VALOR = leia.nextDouble();
		for (int linha=0;linha<2; linha++) 
		{
			for (int coluna = 0; coluna<2; coluna++) 
			{
				matriz[linha][coluna]+=VALOR;
				matriz2[linha][coluna]+=VALOR;
			}
		}
		
		
	}
	
	else if(op =='4')
	{System.out.println("Matriz 1:");
		for(int linha=0; linha <2; linha++) 
		{
			System.out.print("[");
			
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.print(matriz[linha][coluna]+"  ");
				
			}
			System.out.print("]");
			System.out.print("\n");
		}
		
		
		System.out.println("\nMatriz 2:");
		for(int linha=0; linha <2; linha++) 
		{
			System.out.print("[");
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.print(matriz2[linha][coluna]+"  ");
			}
			System.out.print("]");
			System.out.print("\n");
		}
		
		System.out.println("\nMatriz 3:");
		for(int linha=0; linha <2; linha++) 
		{
			System.out.print("[");
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.print(matriz3[linha][coluna]+"  ");
			}
			System.out.print("]");
			System.out.print("\n");
			
		}
		System.out.println("\nMatriz 4:");
		for(int linha=0; linha <2; linha++) 
		{
			
			System.out.print("[");
			for(int coluna=0;coluna<2;coluna++)
			{
				System.out.print(matriz4[linha][coluna]+"  ");
			}
			System.out.print("]");
			System.out.print("\n");
		}
		break;
	}
}
	while(op <1 || op >4);
	
leia.close();
}
}