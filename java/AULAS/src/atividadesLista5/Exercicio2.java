package atividadesLista5;
import java.util.Scanner;

import entidades.Aviao;
public class Exercicio2 {
public static void main (String[]args)
{
	Scanner leia = new Scanner(System.in);
	Aviao aviao = new Aviao();
	
	System.out.print("Qual � o tipo do aviao? ");
	aviao.tipoDoAviao = leia.nextLine();
	System.out.print("Qual a largura do aviao? ");
	aviao.largura = leia.nextDouble();
	System.out.print("Qual o comprimento do avi�o? ");
	aviao.comprimento = leia.nextDouble();
	System.out.print("Quanto pesa esse avi�o? ");
	aviao.peso = leia.nextDouble();
	System.out.print("Quantas pessoas embarcaram no v�o? ");
	aviao.quantidadePessoas = leia.nextInt();
	System.out.println("Quanto de combustivel tem disponivel para a viagem?");
	aviao.combustivelDisponivel = leia.nextDouble();
	System.out.println("Qual a dist�ncia da viagem? ");
	aviao.distancia = leia.nextInt();
	
	aviao.voaounao();
	

}
}
