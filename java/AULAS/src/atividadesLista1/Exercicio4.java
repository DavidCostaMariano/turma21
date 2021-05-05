package atividadesLista1;
import java.util.Scanner;
public class Exercicio4 {
	public static void main (String[]args) 
	{
		Scanner leia = new Scanner (System.in);
			
		double a;
		double b;
		double c;
		double d;
		double r;
		double s;
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Informe o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Informe o valor de C: ");
		c = leia.nextDouble();
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		System.out.println("O valor de D é: "+ d);
	leia.close();			
	}
}
