package programas;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import classes.Basico;
import classes.Estudante;
import classes.Graduacao;
import classes.Medio;
import classes.Mestrado;
import classes.Pós;
public class ProjetoEscola {


	public static void main (String[]args) {	

		Scanner leia = new Scanner (System.in);
		Scanner leiaString = new Scanner (System.in);
	
		final String nomeEscola = "Generation";
		final String sloganEscola = "Formando sonhadores para que não deixem de sonhar.";
		String tipoEnsino[] = {"BASICO","MEDIO","GRADUAÇÃO","PÓS","MESTRADO"};
		int opcaoDesejada;
		System.out.printf("Escola: %s\n%s\n",nomeEscola,sloganEscola);
		System.out.print("\n1 - BASICO\t\t2 - MÉDIO\n3 - GRADUAÇÃO\t\t4 - PÓS\n5 - MESTRADO\t\t6 - SAIR\n\nDigite o número referente a opção de ensino desejada: ");
		opcaoDesejada = leia.nextInt();
		opcaoDesejada -= 1;
		
		if(opcaoDesejada == 0 ) //ENSINO BASICO!!!
		{
			{
				
				int diaAtual;
				char incluirRetirar = ' ';
				
				System.out.printf("\n\n\n\n\nEscola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				System.out.print("\nInforme o dia atual: ");
				diaAtual = leia.nextInt();
				System.out.print("Qual o seu nome? ");
				String nome = leiaString.nextLine().toUpperCase();
				System.out.print("Insira o numero da sua matricula: ");
				int matricula = leia.nextInt();
				System.out.print("Insira seu CPF: ");
				String cpf = leia.next();
				System.out.print("Qual a data do seu aniversário?: ");
				int diaAniversario = leia.nextInt();
				System.out.print("Status da matricula: ");
				int opcaoStatus = leia.nextInt();
				
				if(opcaoStatus == 1) {
				
				Basico aluno = new Basico (nome ,matricula, cpf, diaAniversario);
				
				
					System.out.printf("\n\n\n\n\n\n\nEscola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
					System.out.println("\nMatricula: "+aluno.getMatricula());
					System.out.println("CPF: "+aluno.getCpf());
					for (int x = 0;x<10;x++) 
					{
					
					System.out.printf("\nVocê deseja A-adicionar ou R-retirar nota?: ");	
					incluirRetirar = leia.next().toUpperCase().charAt(0);
					
						if(incluirRetirar == 'A') 
						{
							System.out.print("Qual o valor da nota que voce deseja adicionar?: ");
							double notaAdicionar = leia.nextDouble();
							aluno.adicionarNota(notaAdicionar);
							System.out.printf("Sua nota é: %.0f",aluno.getPontos());
						}
						else if (incluirRetirar =='R')
						{
							System.out.print("Qual o valor da nota que voce deseja retirar?: ");
							double notaRetirar = leia.nextDouble();
						
							if(notaRetirar > aluno.getPontos())
							{
								System.out.println("Você não pode retirar essa quantidade de nota pois ficará negativo!");
								System.out.printf("Sua nota atual é: %.0f",aluno.getPontos());
							}
							else 
							{
								aluno.tirarNota(notaRetirar);
								System.out.printf("Sua nota é: %.0f",aluno.getPontos());
							}
						}	
			
				while(incluirRetirar == 'A' && incluirRetirar == 'R');
				System.out.println("\nDeseja continuar? 1 - SIM 2 - NÃO ");
				char continuar = leia.next().toUpperCase().charAt(0);
				
				do {
					
					if (continuar == '2')
					{
						if(diaAniversario == diaAtual)
						{
							aluno.bonusAniversario(diaAniversario);
							System.out.printf("Matricula: %d \nCPF: %s\nSua nota final é: %.0f",aluno.getMatricula(),aluno.getCpf(),aluno.getPontos());
							x+=11;
							break;
						}
						else if(diaAniversario != diaAtual)
						{
							System.out.printf("Matricula: %d \nCPF: %s\nSua nota final é: %.0f",aluno.getMatricula(),aluno.getCpf(),aluno.getPontos());
							x+=11;
							break;
						}
				
					}
				
			if(continuar == '1')
			{
				if(x >=9) 
				{
					
					System.out.println("Você chegou ao limite de notas que pode adicionar!!");
					if(diaAniversario == diaAtual)
					{
						aluno.bonusAniversario(diaAniversario);
						System.out.printf("Matricula: %d \nCPF: %s\nSua nota final é: %.0f",aluno.getMatricula(),aluno.getCpf(),aluno.getPontos());
						break;
					}
					else if(diaAniversario != diaAtual)
					{
						System.out.printf("Matricula: %d \nCPF: %s\nSua nota final é: %.0f",aluno.getMatricula(),aluno.getCpf(),aluno.getPontos());
						break;
					}
				}
			break;
			}
		break;
		}
		while(continuar != '2');
		
		}
		}
	}
	}
		
	if(opcaoDesejada == 1 ) // em desenvolvimento
	{
		
			Collection<Double> boletim = new ArrayList();
			char op = ' ' ;
			System.out.printf("\n\n\n\n\nEscola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
			System.out.print("\nQual o seu nome? ");
			String nome = leiaString.nextLine().toUpperCase();
			System.out.print("Insira o numero da sua matricula: ");
			int matricula = leia.nextInt();
			System.out.print("Insira seu CPF: ");
			String cpf = leia.next();
			System.out.print("Status da matricula: ");
			int opcaoStatus = leia.nextInt();
				
				Medio medio = new Medio(matricula, cpf);	
					
				
				
				//pegar a nota
				System.out.printf("\n\n\n\n\n\n\nEscola: %s\nSlogan: %s\n\nEnsino %s",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
				System.out.println("\nMatricula: "+medio.getMatricula());
				System.out.println("CPF: "+medio.getCpf());
				
			for(int x=0; x<10; x++) 
			{
				System.out.print("Deseja A-adicionar ou R-retirar? ");
				op=leia.next().toUpperCase().charAt(0);
				if (op == 'A')
				{
					
					System.out.print("insira nota: ");
					double adicionarPonto=leia.nextDouble();
					medio.adicionarNota(adicionarPonto);
					medio.getPontos();
					System.out.println("Sua nota atual é: " + medio.getPontos()); 
					boletim.add(adicionarPonto); 
			
				}
				else 
				{
					System.out.println("insira nota");
					double adicionarPonto=leia.nextDouble();
					medio.tirarNota(adicionarPonto);
					medio.getPontos();
					System.out.println("Sua nota atual é: "+medio.getPontos()); 
					boletim.add(adicionarPonto); 
					 	
				}
				
				
				
			}
			System.out.println("Voce deseja imprimir seu boletim?\n1 - sim\n2 - nao");
			char pediBoletim=leia.next().charAt(0);
			
			if(pediBoletim =='1') 
			{
				System.out.println("seu boletim: "+boletim);
				System.out.println("Sua nota final é: "+medio.getPontos());
				
			}
			else
			{
				System.out.println("Sua nota final é: "+medio.getPontos());
				System.out.println("Obrigado por utilizar nosso software");
				
			}
			
			}
			

		
	
	if(opcaoDesejada == 2 ) //ENSINO GRADUAÇÃO!!!
	{
		
		Scanner leiaS = new Scanner (System.in);
		Scanner leiaI = new Scanner (System.in);
		Graduacao graduando1 = new Graduacao(0,"");
		
			char opc =' ';
			double valor = 0.0;
			System.out.printf("\nEscola: %s\nSlogan: %s\n\nEnsino %s\n\n",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
			System.out.print("Matricula: ");
			graduando1.setMatricula(leiaI.nextInt());
			System.out.print("CPF: ");
			graduando1.setCpf(leiaS.nextLine());
				
				for(int i =0; i<10; i++) 
				{
					
					System.out.printf("\nMOVIMENTO %d - I-inclusão de nota ou R-retirada de nota:",i+1);
					opc = leiaS.next().toUpperCase().charAt(0);
					System.out.printf("Bonus atual: %.1f",graduando1.getBonus());
					System.out.printf("\nTotal atual: %.1f ",graduando1.getPontos()); 
					System.out.printf("\nValor movimento: ");
					valor = leiaI.nextDouble();
					if(opc == 'I') graduando1.adicionarNota(valor);
				    else if (opc == 'R') graduando1.tirarNota(valor);
				}
				System.out.printf("Bonus Final Restante: %.1f",graduando1.getBonus());
				System.out.printf("\nNota Final: %.1f ",graduando1.getPontos()); 
	
			leiaS.close();
			leiaI.close();
		}

	
	
		if(opcaoDesejada == 3 ) //ENSINO PÓS!!!
		{
			Estudante pos = new Pós(0, "aaa", 0, true);
			
			
			int lerMatricula;
			String cpf;
			char auxAtivo = 0;
			double pontos = 0;
	
			System.out.println("Bem vindo à base de dados do aluno!\nVocê escolheu a opção de ensino Pós.");
			System.out.println("Para entrar no sistema do aluno, digite a sua matrícula: ");
			lerMatricula = leia.nextInt();
			pos.setMatricula(lerMatricula);
	
			System.out.println("Agora digite o número do seu CPF: ");
			cpf = leia.next();
			pos.setCpf(cpf);
	
			System.out.println("Agora informe o status do aluno, digite: \n(1) - Ativo\n(2) - Inativo\n ");
			auxAtivo = leia.next().charAt(0);
			
			if(auxAtivo == '1') 
			{
				pos.setAtivo(true);
				
			}
			else 
			{
				pos.setAtivo(false);
			}
		
			System.out.printf("Status do aluno: %s \n" , (pos.isStatus() == true)? "Ativo":"Inativo" );
		
		
			for(int x=0; x<=10; x++) 
			{
				System.out.println("Você gostaria de adicionar ou retirar nota? Digite:\n(1) - Adicionar\n(2) - retirar");
				auxAtivo = leia.next().charAt(0);
				System.out.println("Insira uma nota: ");
				pontos = leia.nextDouble();
			
		
					if(auxAtivo == '1') 
					{
						pos.adicionarNota(pontos);
					}
					else if(auxAtivo == '2') 
					{
						pos.tirarNota(pontos);
					}
		
			}
		System.out.println("Sua note é: "+ pos.getPontos());
	}
	
	if(opcaoDesejada == 4 ) //ENSINO MESTRADO!!!
	{
		Scanner leiaS = new Scanner (System.in);
		Scanner leiaI = new Scanner (System.in);
		Mestrado mestre1 = new Mestrado(0,"");
	
		char opc =' ';
		double valor = 0.0;
		
		System.out.printf("\n\n\n\n\n\n\nEscola: %s\nSlogan: %s\n\nEnsino %s\n\n",nomeEscola,sloganEscola,tipoEnsino[opcaoDesejada]);
		System.out.print("Matricula: ");
		mestre1.setMatricula(leiaI.nextInt());
		System.out.print("CPF: ");
		mestre1.setCpf(leiaS.nextLine());
		
		for(int i =0; i<10; i++) 
		{
			
			System.out.printf("\nMOVIMENTO %d - [I] incluir nota ou [R] retirar nota:",i+1);
			opc = leiaS.next().toUpperCase().charAt(0);
			System.out.printf("Crédito atual: %.1f",mestre1.getCreditoMestrado());
			System.out.printf("\nTotal atual: %.1f ",mestre1.getCreditoMestrado()); 
			System.out.printf("\nValor movimento: ");
			valor = leiaI.nextDouble();
			System.out.printf("\nDeseja inserir créditos?");
			
		    if(opc == 'I') mestre1.adicionarNota(valor);
		    else if (opc == 'R') mestre1.tirarNota(valor);	
				
		}
		
		System.out.println(mestre1.getPontos());
		leiaS.close();
		leiaI.close();
	}
	if (opcaoDesejada == 5) 
	{
		System.out.println("Obrigado por utilizar nosso programa!");
	}
}
}


