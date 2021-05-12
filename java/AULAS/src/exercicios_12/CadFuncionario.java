package exercicios_12;

import entidades.FuncionarioOverride;
import entidades.Terceiro;

public class CadFuncionario{

	public static void main(String[]args)
	{
		FuncionarioOverride funcionario1 = new FuncionarioOverride("123456798", "JUVENAL" , 50, 20);
		
		FuncionarioOverride terceiro1 = new Terceiro("213654","Abracadabra",50,20,10);
		System.out.println(funcionario1);
		funcionario1.mostrarSalario();
		System.out.println(terceiro1);
		System.out.println("O salario do terceiro é:R$"+terceiro1.mostrarSalario());
		
	}
}
