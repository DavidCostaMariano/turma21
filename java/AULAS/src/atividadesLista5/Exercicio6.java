package atividadesLista5;
import java.util.Scanner;

import entidades.ContaBanco;

public class Exercicio6 {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Por favor insira seu nome: ");
		String nomeProprietario = leia.nextLine();
		System.out.print("Insira seu cpf: ");
		String cpf = leia.nextLine();
		System.out.print("Insira seu RG: ");
		int RG = leia.nextInt();
		
	
		System.out.print("Insira o numero da conta: ");
		int numeroDaConta = leia.nextInt();
		System.out.print("Insira o digito da conta: ");
		int digitoDaConta = leia.nextInt();
		
		ContaBanco pessoa1 = new ContaBanco(cpf, numeroDaConta, digitoDaConta);
		System.out.printf("Olá %s\nVocê é o portador do rg: %d\n",nomeProprietario,RG);
		pessoa1.informacoesDaConta();
	}
	

}
