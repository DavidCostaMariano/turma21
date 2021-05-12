package entidades;

public class Terceiro extends FuncionarioOverride{

	@Override
	public String toString() {
		return "\n\nDados do funcionario tercerizado\n--------------------------------" + "\nMatricula: \t\t"+super.matricula+"\nNome: \t\t\t"+super.nome+"\nHoras Trabalhadas: \t"+super.horasTrabalhadas+"\nSalario hora:\t\tR$"+super.salarioHora+"\nadicional:\t\tR$" + adicional+"\n--------------------------------";
	}

	private double adicional;

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double salarioPorHora, double adicional) {
		super(matricula, nome,horasTrabalhadas,salarioPorHora);
		this.adicional = adicional;
		// TODO Auto-generated constructor stub
	}
	
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double mostrarSalario()
	{
		
		return (horasTrabalhadas* salarioHora)+adicional;
	}

	
}
