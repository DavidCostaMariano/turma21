package atividadesLista5;
import java.util.Scanner;
import entidades.Funcionario;

public class Exercicio4 {
	public static void main(String[]args)
	{
		Scanner leia = new Scanner (System.in);
		Funcionario funcionario1 = new Funcionario ();
		
		System.out.print("Ol�, por favor insira seu nome: ");
		funcionario1.nome = leia.nextLine();
		System.out.println("Informe quantas horas voc� trabalhou");
		funcionario1.horasTrabalhadas = leia.nextInt();
		funcionario1.salario();
	}
}
