package atividadesLista5;
import java.util.Scanner;

import entidades.Aviao;
public class Exercicio2 {
public static void main (String[]args)
{
	Scanner leia = new Scanner(System.in);
	Aviao aviao = new Aviao();
	
	System.out.print("Qual é o tipo do aviao? ");
	aviao.tipoDoAviao = leia.nextLine();
	System.out.print("Qual a largura do aviao? ");
	aviao.largura = leia.nextDouble();
	System.out.print("Qual o comprimento do avião? ");
	aviao.comprimento = leia.nextDouble();
	System.out.print("Quanto pesa esse avião? ");
	aviao.peso = leia.nextDouble();
	System.out.print("Quantas pessoas embarcaram no vôo? ");
	aviao.quantidadePessoas = leia.nextInt();
	System.out.println("Quanto de combustivel tem disponivel para a viagem?");
	aviao.combustivelDisponivel = leia.nextDouble();
	System.out.println("Qual a distância da viagem? ");
	aviao.distancia = leia.nextInt();
	
	aviao.voaounao();
	

}
}
