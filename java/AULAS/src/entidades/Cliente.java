package entidades;

public class Cliente {

	public String nomeCliente;
	public int rg;
	public String cpf;
	public double saldoDoCartao;
	public double valorDaCompra;
	
	public void PodeComprar()
	{
		if(saldoDoCartao < valorDaCompra) {
		System.out.println("\nO valor total da compra excede o valor que você tem disponível no cartão, por favor retire alguns itens");
	}
		else
		{
			System.out.printf("\nSeu novo saldo no cartão é de: %.2f" ,(saldoDoCartao - valorDaCompra));
		}
	}
}
