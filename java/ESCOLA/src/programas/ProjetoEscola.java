package programas;
import java.util.Scanner;
import classes.Basico;
public class ProjetoEscola {

public static void main (String[]args) {	
	
	Scanner leia = new Scanner (System.in);
	Scanner leiastring = new Scanner (System.in);
	final String nomeEscola = "Generation";
	final String sloganEscola = "Formando sonhadores para n�o deixarem de sonhar";
	String tipoEnsino[] = {"BASICO","MEDIO","GRADUA��O","P�S","MESTRADO"};
	int opcaoDesejada;
	System.out.printf("Escola: %s\nSlogan: %s\n",nomeEscola,sloganEscola);
	System.out.print("\n1 - BASICO\n2 - M�DIO\n3 - GRADUA��O\n4 - P�S\n5 - MESTRADO\n6 - SAIR\n\nDIGITE O NUMERO DO ENSINO QUE VOC� DESEJA: ");
	opcaoDesejada = leia.nextInt();
	opcaoDesejada -= 1;
	
	if(opcaoDesejada == 0 ) //ENSINO BASICO!!!
	{
	
	int diaAtual;
	char incluirRetirar = ' ';	
	System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
	
	
	System.out.print("\nInforme o dia atual: ");
	diaAtual = leia.nextInt();
	System.out.print("Qual o seu nome? ");
	String nome = leiastring.nextLine().toUpperCase();
	
	
	
	System.out.print("Insira o numero da sua matricula: ");
	int matricula = leia.nextInt();
	System.out.print("Insira seu CPF: ");
	String cpf = leia.next();
	System.out.print("Qual a data do seu anivers�rio?: ");
	int diaAniversario = leia.nextInt();
	System.out.print("Status da matricula: ");
	int opcaoStatus = leia.nextInt();
	
	

	if(opcaoStatus == 1) {
	
	Basico aluno = new Basico (matricula, cpf, diaAniversario);
	
	
		System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		System.out.printf("\nOl� %s",nome);
		System.out.println("\nMatricula: "+aluno.getMatricula());
		System.out.println("CPF: "+aluno.getCPF());
		System.out.println("");
		for (int x = 0;x<10;x++) 
		{
			
		System.out.printf("\nVoc� deseja A-adicionar ou R-retirar nota?: ");	
		incluirRetirar = leia.next().toUpperCase().charAt(0);
		
			if(incluirRetirar == 'A') 
			{
				System.out.print("Qual o valor da nota que voce deseja adicionar?: ");
						double notaAdicionar = leia.nextDouble();
				aluno.adicionarNota(notaAdicionar);
				System.out.printf("Sua nota �: %.0f",aluno.getPontos());
			}
			else if (incluirRetirar =='R')
			{
				System.out.print("Qual o valor da nota que voce deseja retirar?: ");
				double notaRetirar = leia.nextDouble();
				
				if(notaRetirar > aluno.getPontos())
				{
					System.out.println("Voc� n�o pode retirar essa quantidade de nota pois ficar� negativo!");
					System.out.printf("Sua nota atual �: %.0f",aluno.getPontos());
					
				}
				else 
				{
					aluno.retirarNota(notaRetirar);
					System.out.printf("Sua nota �: %.0f",aluno.getPontos());
				}
			}
		
		
	
	
	while(incluirRetirar == 'A' && incluirRetirar == 'R');
	
	System.out.println("\nDeseja continuar?\n1 - SIM\n2 - N�O ");
	char continuar = leia.next().toUpperCase().charAt(0);
	
	do {
	if (continuar == 'N')
	{
		if(diaAniversario == diaAtual)
		{
			aluno.bonusAniversario(diaAniversario);
			System.out.printf("Sua nota final �: %.0f",aluno.getPontos());
			x+=11;
			break;
		}
		else if(diaAniversario != diaAtual)
		{
			System.out.printf("Sua nota final �: %.0f",aluno.getPontos());
			x+=11;
			break;
		}
		
	}
	
	if(continuar == 'S')
	{
		if(x >=9) {
		System.out.println("Voc� chegou ao limite de notas que pode adicionar!!");
		if(diaAniversario == diaAtual)
		{
			aluno.bonusAniversario(diaAniversario);
			System.out.printf("Sua nota final �: %.0f",aluno.getPontos());
			break;
		}
		else if(diaAniversario != diaAtual)
		{
			System.out.printf("Sua nota final �: %.0f",aluno.getPontos());
			break;
		}
		
		}
	
	break;
	}
	break;
	}
	
	while(continuar != 'N');
	
	}
		
	
	
	}
	else if(opcaoStatus == 2)
	{
		System.out.println("Sua matricula est� inativa");
	}
	}
	
	else if(opcaoDesejada == 1 ) //ENSINO MEDIO!!!
	{
		
	System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
	
	
	}
	
	else if(opcaoDesejada == 2 ) //ENSINO GRADUA��O!!!
	{
		
	System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
	
	
	}
	
	else if(opcaoDesejada == 3 ) //ENSINO P�S!!!
	{
		
	System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
	
	
	}
	
	else if(opcaoDesejada == 4 ) //ENSINO MESTRADO!!!
	{
		
	System.out.printf("Escola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		
	}
	else if(opcaoDesejada == 5 ) //ENSINO MESTRADO!!!
	{
		
	System.out.printf("Agradecemos por utilizar o nosso programa!");
		
	}
	
}
}
