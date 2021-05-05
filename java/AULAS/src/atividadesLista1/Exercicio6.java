package atividadesLista1;
import java.util.Scanner;
public class Exercicio6 {
public static void main (String[]args)
{
	Scanner leia = new Scanner(System.in);
	double x1;
	double x2;
	double y1;
	double y2;
	double dTotal;
	double distanciaX;
	double distanciaY;
	
	
	System.out.println("Digite um valor para x1: ");
	x1 = leia.nextInt();
	System.out.println("Digite um valor para x2: ");
	x2 = leia.nextInt();
	System.out.println("Digite um valor para y1: ");
	y1 = leia.nextInt();
	System.out.println("Digite um valor para y2: ");
	y2 = leia.nextInt();
	
	distanciaX = Math.pow((x2 - x1),2);
	distanciaY = Math.pow((y2 - y1),2);
	dTotal = Math.sqrt(distanciaX+distanciaY);
	System.out.printf("A distancia total é : %.2f ",dTotal);
leia.close();	
}
}
