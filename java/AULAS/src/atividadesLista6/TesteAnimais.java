package atividadesLista6;
import java.util.Scanner;
public class TesteAnimais {

	public static void main(String []args)
	{
		Scanner leia = new Scanner(System.in);
		Scanner leiaString = new Scanner (System.in);
		
		System.out.print("Insira o nome do cachorro: ");
		String nome = leia.nextLine().toUpperCase();
		System.out.print("Informe a idade do cachorro:");
		int idade = leia.nextInt();
		Animal dog1 = new Cachorro(nome, idade);
		
		
		System.out.print("Insira o nome do cavalo: ");
		String nomeCavalo = leiaString.nextLine().toUpperCase();
		System.out.print("Informe a idade do cavalo:");
		int idadeCavalo	 = leia.nextInt();
		Animal Cavalo = new Cavalo(nomeCavalo,idadeCavalo);

		System.out.println("Seu cachorro é o: "+dog1.getNome()+"\nele(a) tem "+dog1.getIdade()+" anos" );
		dog1.som();
		System.out.println("\nSeu cavalo é o: "+Cavalo.getNome()+"\nele(a) tem "+Cavalo.getIdade()+" anos");
		Cavalo.som();
	
	}
}
