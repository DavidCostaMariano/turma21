package entidades;

public class Funcionario {
	
	public String nome;
	public double salario;
	public int carteiraTrabalho;
	public int horasTrabalhadas;
	public int horaExtra;
	public double salarioExtra;
	
	
	public void salario() 
	{
		
		if(horasTrabalhadas <=50) {
		salario = horasTrabalhadas*10;
		System.out.printf("Ola %s, você trabalhou %d na semana e vai receber %.2f de salario",nome,horasTrabalhadas,salario);
	}
		else 
		{	horaExtra = horasTrabalhadas-50;
			horasTrabalhadas=50;
			salario = horasTrabalhadas*10;
			salarioExtra = horaExtra*20;
			
			System.out.printf("Ola %s, você trabalhou %d na semana e vai receber %.2f de salario\n" ,nome ,horasTrabalhadas ,salario);
			System.out.printf("Porém você tem %d hora(s) extra(s) trabalhanda(s) e por isso receberá: R$ %.2f de sálario extra",horaExtra,salarioExtra);
		}
	}
}
