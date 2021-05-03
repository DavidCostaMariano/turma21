programa
{
	inclua biblioteca Texto --> t
	inclua biblioteca Calendario --> c
	inclua biblioteca Util
	funcao inicio()
	{
	const cadeia NOMEDAESCOLA = "Escola Generation Brasil"
	const cadeia SLOGAN = "Formando sonhos para quem nunca desiste de sonhar"
	inteiro opcao = 0
	inteiro matricula
	cadeia cpf	
	real pontos [10]
	logico status
	inteiro opcaoStatus = 0
		
	escreva(NOMEDAESCOLA,"\n")
	escreva(SLOGAN,"\n")
	
	
	
	enquanto (opcaoStatus !=1 ou opcaoStatus !=2)
	{
		escreva("\nStatus da matricula: 1-Ativa 2-Inativa: ")
		leia(opcaoStatus)
		limpa()
		se(opcaoStatus == 1 ou opcaoStatus == 2)
		{
			pare
		}
	}
	se(opcaoStatus == 2){
	escreva("\nComo sua matricula esta inativa, solicitamos que entre em contato com a secretaria para ativar a  mesma e podermos visualizar suas notas.")
	escreva("\n\nEspero ter ajudado! Volte sempre que for necessario! :D \n")
	}
	senao se(opcaoStatus !=1 e opcaoStatus !=2)
	{
		escreva("Por favor insira um valor existente para verificar se sua matricula está ativa ou nao!")	
	}
	senao se(opcaoStatus == 1){
	escreva("Matricula: ")
	leia(matricula)
	escreva("CPF: ")
	leia(cpf)
	cpf = ((t.extrair_subtexto(cpf, 0, 3))+"."+(t.extrair_subtexto(cpf, 3, 6))+"."+(t.extrair_subtexto(cpf, 6, 9))+"-"+(t.extrair_subtexto(cpf, 9, 11)))
	
	enquanto (opcao == 0 ou opcao >6)
	{
		escreva("1 - BASICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n\n","DIGITE O CODIGO DA OPÇÃO DESEJADA: ")
		leia (opcao)
	}
	
 	escolha(opcao){
	
	caso(1):
	{
		caracter incluirretirar
		real somaPontos = 0.00
		caracter continuar
		inteiro diaatual = c.dia_mes_atual()
		inteiro diadenascimento
		
		limpa()
		
		Util.aguarde(1000)
		
				
		para(inteiro x = 0; x <10; x++)
			{
				escreva(NOMEDAESCOLA,"\n",SLOGAN,"\n\nENSINO BASICO","\n\nMatricula: ",matricula,"\nCPF: ",cpf,"\nSua matricula está ativa\n")
				se(somaPontos <= 0)
				{
					somaPontos = 0.00
					escreva("Sua nota atual é: ",somaPontos)
				}
			
				senao 
				{
					escreva("\nSua atual é: ",somaPontos,"\n")	
				}

				escreva("\nDeseja I-incluir nota ou R-retirar nota: ")
				leia(incluirretirar)
					
					enquanto(incluirretirar !='I' ou incluirretirar!='i' ou incluirretirar!='S' ou incluirretirar!='s')
					{
					escreva("\nDeseja I-incluir nota ou R-retirar nota: ")
					leia(incluirretirar)
					
					se(incluirretirar == 'I' ou incluirretirar == 'i')
					{
						escreva("Digite o valor da nota que deseja incluir: ")
						leia(pontos[x])
						somaPontos += pontos[x]
						pare
					}
			
						senao se(incluirretirar == 'R' ou incluirretirar == 'r')
					{
						escreva("Digite o valor da nota que deseja Retirar: ")
						leia(pontos[x])
						somaPontos -= pontos[x]
						
						se(somaPontos == 0)
						{
							escreva("\nSua nota atual é 0 então não há o que retirar!\n")
							pare
						}
					}		
					}
										
					escreva("Deseja continuar? S/N: ")
					leia(continuar)
					limpa()

					se(continuar == 'N' ou continuar == 'n')
					{
						x += 10
						escreva("Informe o seu dia de nascimento: ")
						leia(diadenascimento)
							se(diadenascimento == c.dia_mes_atual())
							
							{
								somaPontos += (somaPontos*0.1)
								escreva("Sua nota final é: ",somaPontos)
							}
					
			
		}
					enquanto(continuar !='S' ou continuar !='s' ou continuar !='N' ou continuar !='n')
					{
					escreva("Insira S ou N para continuar ou não: ")
					leia(continuar)
					limpa()
					se(continuar == 'S' ou continuar == 's')
					{
						pare	
					}		
					se(continuar == 'N' ou continuar == 'n')
					{
						x += 10
						escreva("Informe o seu dia de nascimento: ")
						leia(diadenascimento)
							se(diadenascimento == c.dia_mes_atual())
							
							{
								somaPontos += (somaPontos*0.1)
								escreva("Sua nota final é: ",somaPontos)
							}
					pare
			
					}
					}
					
		
		}
	
	pare
	}
	
	caso(2):
	{
	pare			
	}
	caso(3):
	{	
		pare	
	}
	caso(4):
	{	
		limpa()
							real credito = 5.00
							inteiro mvt  = 1
							real nota
							real tt_nota = 0.00
							real media 
							inteiro opc  = 0
							real crd_usar
							real tirarNota
							
							escreva(NOMEDAESCOLA,"\n",SLOGAN,"\n\nENSINO PÓS","\n\nMatricula: ",matricula,"\nCPF: ",cpf,"\nSua matricula está ativa\n")
				
							para (mvt ; mvt <=10 ; mvt++){
							  escreva ( "Entre com a nota nº " + mvt + " : ")
							  leia(nota) 
							  tt_nota = nota + tt_nota

														}

							media =  tt_nota / 10
		
							escreva( "Seu total de notas foi:  " + tt_nota + " Portanto sua media será " + media + "\n \n")

							
							 escreva ("Digite: \n1- Sim \n2- Não\n\nGostaria de usar o seu saldo de nostas credito?\n") 
							 leia(opc)
							 enquanto(opc !=1 ou opc !=2)
							 {
							 escreva ("Digite: \n1- Sim \n2- Não\n\nGostaria de usar o seu saldo de nostas credito?\n") 
							  leia(opc)
							  escolha (opc){
								 caso (1): {
								 	escreva("\n\nVoce tem o seguinte saldo de pontos para credito: " + credito + " Quantos pontos gostaria de usar? " )
								 	leia(crd_usar)
								 	credito = credito - crd_usar 
								 	media   = media + crd_usar 
								 	escreva("\n\nSeu novo saldo de pontos é: " + credito)
								 	escreva("\n\nSua nova media é: " + media) 
								 }
			
								 caso (2): {
		
								 	escreva("\nSegue seu extrato de inofrmações: \n\n ")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n" + matricula)
								 	escreva("\n" + cpf)
								 	escreva("\nEssa é a sua media final: " + media)
								 	 
								 }
							  }	
							 }
					pare	}
		

	
		caso(5):
	{		
	pare		
	}

	caso(6):
	{
		escreva("\nVolte a utilizar nosso programa quando necessário! Até breve!!\n\n")	
		pare	
	}
	}
}
}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2713; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */