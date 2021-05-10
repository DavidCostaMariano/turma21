package exercicios_10;

import java.util.Scanner;

import entidades.Retangulo;

public class CalculoRetanguloObjeto {
	public static void main (String[]args) 
	{
		
		Scanner leia = new Scanner (System.in);
		Retangulo ret1= new Retangulo();
		Retangulo ret2= new Retangulo();
		
		System.out.println("Retangulo 1 : ");
		System.out.print("Digite a base 1: ");
		ret1.base = leia.nextDouble();
		System.out.print("Digite a altura 1:  ");
		ret1.altura = leia.nextDouble();
		System.out.println("Retangulo 2 : ");
		System.out.print("Digite a base 2: ");
		ret2.base = leia.nextDouble();
		System.out.print("Digite a altura 1:  ");
		ret2.altura = leia.nextDouble();
		System.out.printf("A area do retangulo 1");
		ret1.area();
		System.out.println("A area do retangulo 2");
		ret2.area();
		
	}
}
