package entidades;

public class FuncionarioOverride {

	
	public String toString() {
		return "Dados do Funcionario Principal:\n-------------------------------\nMatricula:\t\t " + matricula + "\nNome:\t\t\t " + nome + "\nHoras Trabalhadas:\t "+ horasTrabalhadas + "\nSalario Hora:\t\t R$" + salarioHora+"\n--------------------------------------";
	}
	protected String matricula;
	protected String nome;
	protected int horasTrabalhadas;
	protected double salarioHora;
	
	public FuncionarioOverride(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	public FuncionarioOverride(String matricula, String nome, int horasTrabalhadas, double salarioHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}
	
	
	public double mostrarSalario()
	{
		
		System.out.printf("O salario do funcionario é: R$%.2f\n--------------------------------------\n" , horasTrabalhadas* salarioHora);
		return  horasTrabalhadas* salarioHora;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
}
