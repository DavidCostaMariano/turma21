package atividadesLista6;
import java.util.Scanner;
public class TesteAnimais {

	public static void main(String []args)
	{
		Scanner leia = new Scanner(System.in);
		System.out.print("Insira o nome do cachorro: ");
		String nome = leia.next().toUpperCase();
		System.out.print("Informe a idade do cachorro:");
		int idade = leia.nextInt();
		Animal dog1 = new Cachorro(nome, idade);
		
		
		System.out.print("Insira o nome do cavalo: ");
		String nomeCavalo = leia.next().toUpperCase();
		System.out.print("Informe a idade do cachorro:");
		int idadeCavalo	 = leia.nextInt();
		Animal Cavalo = new Cavalo(nomeCavalo,idadeCavalo);

		System.out.println("Seu cachorro é o: "+dog1.getNome()+"\nele(a) tem "+dog1.getIdade()+" anos");
		System.out.println("Seu cavalo é o: "+Cavalo.getNome()+"\nele(a) tem "+Cavalo.getIdade()+" anos");
		
	
		dog1.som();
		Cavalo.som();
		
	}
}
