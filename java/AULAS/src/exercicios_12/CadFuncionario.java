package exercicios_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.FuncionarioOverride;
import entidades.Terceiro;

public class CadFuncionario{

	public static void main(String[]args)
	{
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		List <FuncionarioOverride> lista = new ArrayList<>();
		
		System.out.println("CADASTRO DE FUNCIONÁRIOS");
		System.out.print("Digite a quantidade de funcionários a ser cadastrados: ");
		int qtde = leia.nextInt();
		
		for(int x=1 ; x <=qtde;x++)
		{
			System.out.println("Digite: 1 - Funcionario 2 - Funcionario tercerizado");
			char op = leia.next().charAt(0);
			System.out.print("Insira seu nome: ");
			String nome = leia.next();
			System.out.print("Insira sua matricula: ");
			String matricula = leia.next().toUpperCase();
			
			System.out.print("Insira a quantidade de horas que você trabalhou: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Quanto te pagam por hora trabalhada? ");
			double valorHora = leia.nextDouble();
			System.out.println("");
			
			if(op =='1')
			{
				lista.add( new FuncionarioOverride(matricula, nome, horasTrabalhadas, valorHora));
				
			}
			
			else if (op == '2') 
			{
				System.out.println("Qual o valor do adicional : R$");
				double adicional = leia.nextDouble();
				lista.add( new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional));
			}
		}
			System.out.println();
			System.out.println("FOLHA DE PAGAMENTO");
			//
			for(FuncionarioOverride func: lista)
			{
				System.out.println(func.getNome()+" seu salário em reais é: "+func.mostrarSalario());
			}
		
		
		
		
	
	}
}
