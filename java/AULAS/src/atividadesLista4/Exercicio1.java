package atividadesLista4;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a[] = {1,0,5,-2,-5,7};
		int somaa1a3a5;
		somaa1a3a5 = a[0]+ a[1] + a[5];
		System.out.printf("A soma dos valores de a0 a1 e a5 é: %d", somaa1a3a5);
		System.out.print("\nInsira um novo valor para o vetor 4: ");
		a[3] = leia.nextInt();
		int numerosvetores=0;
		for(int x= 0; x<6;x++)
		{
			numerosvetores++;
			System.out.printf("\nO valor do vetor %d é: %d",numerosvetores,a[x]);
			
		}
	}

}
