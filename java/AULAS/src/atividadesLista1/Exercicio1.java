package atividadesLista1;
import java.util.Scanner;
public class Exercicio1 {
public static void main (String[]args)
{	
	Scanner leia = new Scanner(System.in);
	int tempoTotal;
	int dias;
	int anos;
	int meses;
	System.out.println("Informe quantos anos voc� tem: ");
	anos = leia.nextInt();
	System.out.println("Informe a quantos meses voc� fez anivers�rio: ");
	meses = leia.nextInt();
	System.out.println("Informe quantos dias faz que voc� completou mais um dia de vida: ");
	dias = leia.nextInt();
	tempoTotal = ((anos*365)+(meses*30)+dias);
	System.out.println("Sua idade expressa em dias �: "+tempoTotal);
	leia.close();	
	
	}


}
