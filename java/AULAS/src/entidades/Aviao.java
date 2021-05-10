package entidades;

public class Aviao {

	public String tipoDoAviao;
	public double peso;
	public int quantidadePessoas;
	public double comprimento;
	public double largura;
	public double combustivelDisponivel;
	public int distancia;
	public double pesoTotal = peso + (quantidadePessoas*70) + (combustivelDisponivel*0.785);
	
	
	public void voaounao() {

		if(pesoTotal > 321000)
		{
			System.out.println("O peso do avião impossibita um pouso seguro, não é recomendado o vôo");
		}
		else if (pesoTotal > 350000)
		{
			System.out.println("O peso total do avião excede os limites para uma viagem segura, informe a torre de controle e não decole de forma alguma!");
		}
		else 
		{
			System.out.println("O peso do avião está em niveis bons ou aceitaveis, você pode decolar.");
		}
	}
		
}
