package exemplos;
import java.util.Scanner;
public class ExercicioEd {
public static void main(String[]args) {
	
	
	String nome;
	char opcao;
	int ano;
	int idade;
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Por favor insira seu nome: ");
	nome = leia.next();
	do {
	System.out.println("Insira o gênero que você se identifica Digite M/F ou O ");
	opcao = leia.next().charAt(0);}
	while(opcao != 'o' && opcao !='O' && opcao != 'm' && opcao !='M'&& opcao != 'f' && opcao !='F');
	System.out.println("Insira o ano que você nasceu: ");
	
	ano = leia.nextInt();
	idade = 2021-ano;
	System.out.printf("Olá %s você tem %d anos e voce se identifica como %c",nome,idade,opcao);
}
	
	
}
