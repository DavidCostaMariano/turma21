package atividadesLista5;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner leia = new Scanner (System.in);
		Cliente cliente = new Cliente();
		
		
		System.out.print("Olá, por favor insira seu nome: ");
		cliente.nomeCliente = leia.nextLine();
		System.out.printf("Olá %s insira seu Rg: ",cliente.nomeCliente);
		cliente.rg = leia.nextInt();
		System.out.print("Agora insira seu CPF:");
		cliente.cpf = leia.next();
		System.out.print("Informe o saldo do seu cartão: ");
		cliente.saldoDoCartao = leia.nextDouble();
		System.out.print("Insira o valor total da compra: ");
		cliente.valorDaCompra = leia.nextDouble();
		
		System.out.printf("%s é muito bom te ver novamente. Aqui estão alguns dados seus:\nRg: %d\nCPF: %s\nSaldo disponivel no cartão: R$ %.2f\n", cliente.nomeCliente, cliente.rg, cliente.cpf, cliente.saldoDoCartao);
		System.out.printf("O valor total da sua compra foi de: R$ %.2f",cliente.valorDaCompra);
		
		
		cliente.PodeComprar();
	}

}
