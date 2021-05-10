package projetoEscola;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

import java.text.ParseException;
import java.util.Calendar;
public class ProjetoEscola {
	static String tipoEnsino[]={"BASICO","MEDIO","GRADUAÇÃO","PÓS","MESTRADO"};
	final static String NOMEDAESCOLA = "Generation";
	final static String SLOGAN="Formando sonhadores para não deixarem de sonhar";
	static int matricula;
	static String cpf;
	static double pontos;
	static boolean status;
	static int opcaoDesejada=0;
	static int opcaoStatus=0;
	
	public static void main (String[]args)
	{
		Calendar c = Calendar.getInstance();
		Scanner leia = new Scanner (System.in);
		
		System.out.println(NOMEDAESCOLA+"\n"+SLOGAN+"\n\n1 - BASICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
		
		while(opcaoDesejada == 0 || opcaoDesejada > 6)
		{
			System.out.println("\nDIGITE O CODIGO DA OPÇÃO DESEJADA: ");
			opcaoDesejada = leia.nextInt();
		}
		
		opcaoDesejada -=1;
		
		if(opcaoDesejada==5)
		{
			System.out.println("Agradecemos por utilizar nosso software, volte assim que desejar");
				
		}
		if(opcaoDesejada >= 0 && opcaoDesejada <5)
		{
			entradadados();
		
			System.out.println("Status da matricula: 1 - Ativa ou 2 - Inativa: ");
			opcaoStatus = leia.nextInt();
			if (opcaoDesejada==0) 
			{
				double somaPontos=0;
				char incluirRetirar;
				char continuar;
				int dataAniversario;
				int diaatual = c.get(Calendar.DAY_OF_MONTH);
				
				for(int x =1; x<=10;x++)
				{
					
					System.out.println(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaoDesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n");
					System.out.printf("\nSua nota atual é: %.2f ",somaPontos);
					
					do
					{
						System.out.println("\nVocê deseja Incluir ou retirar nota? ");
						incluirRetirar = leia.next().toUpperCase().charAt(0);
						
							if(incluirRetirar == 'I') 
							{
								adicionarnota();
								somaPontos += pontos;
							}
							else if(incluirRetirar == 'R')
							{
								retirarnota();
								somaPontos -= pontos;
							}
							
					}
					while(incluirRetirar !='I' && incluirRetirar !='R');
					
					System.out.println("Deseja continuar? ");
					continuar = leia.next().toUpperCase().charAt(0);
					
					do 
					{
						if (continuar == 'N')
						{
							System.out.println("Por favor insira a data do seu aniversário: ");
							dataAniversario = leia.nextInt();
							 if(dataAniversario == diaatual)
							 {
								 double bonusAniversario;
								 somaPontos += (somaPontos*0.1);
								 	extrato();
								 	System.out.println("\nSua nota final é: " + somaPontos + "\n");
								 	x=+10;
							
							 }
							 
							 }
						else if(continuar =='S' && x >=10)
						 {
							 System.out.println("Você chegou ao limite de notas que pode inserir");
							 System.out.println("Por favor insira a data do seu aniversário: ");
								dataAniversario = leia.nextInt();
								 if(dataAniversario == diaatual)
								 {
									 double bonusAniversario;
									 somaPontos += (somaPontos*0.1);
								 }
								 	extrato();
								 	System.out.println("\nSua nota final é: " + somaPontos + "\n");
						 }
						else if (continuar !='N' && continuar !='S') 
						{
							System.out.println("Por favor insira S ou N: ");
							continuar = leia.next().toUpperCase().charAt(0);
									
						}
						
				break;
				}
					while(continuar !='N');
				}
			}
			else if (opcaoDesejada==1) 
			{
				
			}
			else if (opcaoDesejada==2) 
			{
				
			}
			else if (opcaoDesejada==3) 
			{
				
			}
			else if (opcaoDesejada==4) 
			{
				System.out.println("essa é a opçao 5");	
			}
			
	
	}
	
	}
	public static void extrato() 
	{
		 System.out.println("\nSegue seu extrato de informações:\n");
		 System.out.println("----------------------------------\n");
		 System.out.println("\n" + NOMEDAESCOLA);
		 System.out.println("\n" + SLOGAN);
		 System.out.println("\nMatricula: " + matricula);
		 System.out.println("\nCPF: " + cpf);	
	}
	
	public static void adicionarnota() 
	{
		Scanner leia = new Scanner (System.in);
		System.out.println("Informe o valor que deseja incluir: ");
		pontos = leia.nextDouble();
		
	}

	public static void retirarnota() 
	{
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe o valor que deseja retirar: ");
		pontos = leia.nextDouble();
		
	}
	
	public static void entradadados()
	{
		Scanner leia = new Scanner (System.in);
		System.out.println(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaoDesejada]);
		System.out.print("\nInsira o número da sua matricula: ");
		matricula = leia.nextInt();
		System.out.print("Insira seu CPF: ");
		cpf = leia.next();
		
		
		}
}

