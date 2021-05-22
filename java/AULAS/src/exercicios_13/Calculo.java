package exercicios_13;
import java.util.Scanner;
public class Calculo {
public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	double e =0;
	int a =0;
	int b =0;
	int c =0;
	
	System.out.print("Insira o valor de A: ");
	a = leia.nextInt();
	System.out.print("Insira o valor de B: ");
	b = leia.nextInt();
	System.out.print("Insira o valor de C: ");
	c = leia.nextInt();
	System.out.printf("O valor é: %.2f",((e = a+4*b+c)/6));
}
}
