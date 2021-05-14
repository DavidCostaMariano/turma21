package classes;
public class Medio extends Estudante

{ 	
	double Boletim;
	int ContaBoletim;
	
	public Medio(int matricula, String cpf) {
		super(matricula, cpf);
			
	
		
	}

	public int getContaBoletim() {
		return ContaBoletim;
	}

	public void setContaBoletim(int contaBoletim) {
		ContaBoletim = contaBoletim;
	}
	
	public void Boletim(double pontos) {
	

		ContaBoletim++;
	}
	
	public double getBoletim() {
		return Boletim;
	}

	public void setBoletim(double boletim) {
		Boletim = boletim;
	}

	public void ContaBoletim(int Vezes) {
	
	if (Vezes>3)
	{
		System.out.println("Você excedeu seu limite de impressão");
		
	}
	else if(Vezes<=3)
	{
		//Boletim 
	}
	
	}
	
}