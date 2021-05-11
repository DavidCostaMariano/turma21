package classes;

public abstract class Estudante {

	//atributos - PRONTO
	private String nome;
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	
	
	//construtores
	
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}


	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}


	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}
	
	//encapsulamento - - get and set
	public String getCPF(){
	    return this.cpf;
	  }

	  public void setCPF(String cpf){
	    this.cpf = cpf;
	  }


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public double getPontos() {
		return pontos;
	}


	/*public void setPontos(double pontos)
	  	{
			this.pontos = pontos;
		}
*/

	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}

	
	//metodos
	public void adicionarNota(double pontos)
	{
		this.pontos += pontos;//this.pontos = this.pontos += pontos;
	}
	public void retirarNota(double pontos)
	{
		this.pontos -= pontos; //this.pontos = this.pontos += pontos;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


}
