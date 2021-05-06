package exercicios_06;
	import java.util.Scanner;
		public class AtividadeEmClasse {
			public static void main (String[]args) {

		Scanner leia = new Scanner (System.in);
		int numero=1, somatorio=0, media=0, totalValoresLidos=0, qtdVezes=0;
		
		while(numero !=0)
		{
			System.out.println("Informe um numero positivo: ");
			numero = leia.nextInt();
			somatorio += numero;
			if(numero>0)
			{
				totalValoresLidos++;
			}
			else 
			{
				break;
			}
			media =somatorio / totalValoresLidos;
		}
		System.out.printf("\nA soma dos valores informados é de %d ",somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros diferentes de 0 foi: %d vezes",totalValoresLidos);
		System.out.printf("\nA media dos numeros informados é: %d", media);
	leia.close();
			}
}