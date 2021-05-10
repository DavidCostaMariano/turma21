package entidades;

public class ContaBanco {


	public String nomeProprietario;
	public String cpf;
	public int rg;
	public int numeroDaConta;
	public int digitoDaConta;
	
	
	public ContaBanco(String cpf,int numeroDaConta, int digitoDaConta)
	{
	
		this.cpf = cpf;
		this.numeroDaConta = numeroDaConta;
		this.digitoDaConta = digitoDaConta;
	}
	public void informacoesDaConta()
	{
		System.out.printf("cpf: %s\nSeu numero de conta com digito é: %d-%d",cpf,numeroDaConta,digitoDaConta);
	}
	
}
