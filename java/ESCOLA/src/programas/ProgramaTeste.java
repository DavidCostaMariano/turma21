package programas;
import java.util.Scanner;

import classes.Basico;
import classes.Estudante;
public class ProgramaTeste {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
			
			System.out.print("Digite o seu nome ");
			String nome = leia.next().toUpperCase();
			System.out.print("Digite o numero da matricula ");
			int matricula = leia.nextInt();
			System.out.print("Digite o cpf: ");
			String cpf = leia.next();
			System.out.print("Digite o dia de aniversário: ");
			int dia = leia.nextInt();
			
			
			System.out.print("Digite a nota inicial ");
			double nota = leia.nextDouble();
			Basico aluno1 = new Basico (matricula, cpf, dia);
			aluno1.setNome(nome);
			aluno1.adicionarNota(nota);
			System.out.printf("PONTOS ATUAIS DO ALUNO %s = %.0f: ",aluno1.getNome(),aluno1.getPontos());
			System.out.println("\nDigite o dia atual: ");
			int diaatual = leia.nextInt();
			aluno1.bonusAniversario(diaatual);
			System.out.printf("PONTOS ATUAIS APÓS METODO DO ALUNO %s = %.0f: ",aluno1.getNome(),aluno1.getPontos());
			
		}

}
