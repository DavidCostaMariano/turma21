programa
{
	inclua biblioteca Texto --> t
	inclua biblioteca Calendario --> c
	inclua biblioteca Util
	funcao inicio()
	{
		const cadeia NOMEDAESCOLA = "Generation"
		const cadeia SLOGAN = "Formando sonhadores para não deixarem de sonhar"
		inteiro matricula 
		cadeia cpf
		real pontos = 0.00
		logico status = verdadeiro
		inteiro opcaodesejada = 0
		inteiro opcaoStatus = 0
		cadeia tipoEnsino[]={"BASICO","MÉDIO","GRADUAÇÃO","PÓS","MESTRADO"}

		escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\n1 - BASICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR")
		
		enquanto(opcaodesejada == 0 ou opcaodesejada > 6)
		{
			escreva("\nDIGITE O CODIGO DA OPÇÃO DESEJADA: ")
			leia(opcaodesejada)
		}
		
		
		
		limpa()
			
			opcaodesejada -= 1
			se(opcaodesejada == 5)
		{
			escreva("Agradecemos por utilizar nosso software, volte assim que desejar!")
		}
		senao{
			escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada])
			escreva("\nInsira o número da sua matricula: ")
			leia(matricula)
			escreva("Insira seu CPF: ")
			leia(cpf)
			cpf = ((t.extrair_subtexto(cpf, 0, 3))+"."+(t.extrair_subtexto(cpf, 3, 6))+"."+(t.extrair_subtexto(cpf, 6, 9))+"-"+(t.extrair_subtexto(cpf, 9, 11)))
			escreva("Status da matricula: 1 - Ativa ou 2 - Inativa: ")
			leia(opcaoStatus)
			faca{	
			
			se(opcaoStatus == 1)
			{

			
			se(opcaodesejada == 0)
			{
			
			real somaPontos =0.0
			caracter incluirRetirar
			caracter continuar
			inteiro dataAniversario
			inteiro diaAtual = c.dia_mes_atual()		
			
				
				para(inteiro x = 0; x < 10; x++)
				{limpa()
					escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")	
					escreva("\nSua nota atual é: ",somaPontos)
					faca
					{
					escreva("\nVocê deseja Incluir ou Retirar nota?: ")
					escreva("\nUse I ou R: ")
					leia(incluirRetirar)
					limpa()
					escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")	
					escreva("\nSua nota atual é: ",somaPontos)
					
						se(incluirRetirar == 'i' ou incluirRetirar == 'I')
						{
							escreva("\nInsira o valor que deseja incluir: ")
							leia(pontos)
							somaPontos += pontos
							Util.aguarde(500)
							pare
						}
						
						senao se (incluirRetirar == 'r' ou incluirRetirar == 'R')
						{
							escreva("Insira o valor que deseja Retirar: ")
							leia(pontos)
							somaPontos -= pontos
								se(somaPontos <= 0.0)
								{
									somaPontos = 0.0
									escreva("Sua nota zerou!")
									Util.aguarde(500)
									pare	
								}
								senao
								{
									pare	
								}
						}
						
					}
					enquanto(incluirRetirar !='I' e incluirRetirar !='i' ou incluirRetirar !='S' e incluirRetirar !='s')
						
						
					escreva("\nDeseja continuar?: ")
					leia(continuar)
						
					faca{
						se(continuar == 'n' ou continuar == 'N')
						{
							escreva("Por favor informe a data do seu aniversario: ")
							leia(dataAniversario)
								se(dataAniversario == diaAtual)
								{limpa()
									real bonusAniversario = somaPontos + (somaPontos*0.1)
									somaPontos = bonusAniversario
									escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nSua nota final é: " + somaPontos + "\n")
									x+=10
									pare
								}
								senao
								{limpa()
									escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nSua nota final é: " + somaPontos + "\n")
									x+=10
									pare
								}
						}
						
						senao se(continuar == 's' ou continuar =='S')
						{
							pare
						}
						senao
						{
						escreva("Por favor insira um valor valido!\nDeseja continuar?: S/N ")
						leia(continuar)	
						}
						}
						enquanto(continuar !='n' ou continuar !='N')
					
				}
				pare
			}
			
						
		
		senao se (opcaodesejada == 1)
		{
		
			
		inteiro contadorBoletim = 0
		cadeia simNao = "o"
		caracter incluirRetirar 
		real somaPontos = 0.00
		cadeia pediBoletim = "k"
		inteiro vezesPb = 0
		real notas [10]
		caracter continuar
	
		para(inteiro x = 0; x < 10; x++)
                {
                	limpa()
                    escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")
                    escreva("\nSua nota atual é: ",somaPontos)
                    faca
                    {
                    escreva("\nVocê deseja Incluir ou Retirar nota?: ")
                    escreva("\nUse I ou R: ")
                    leia(incluirRetirar)
                    limpa()
                    escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")
                    escreva("\nSua nota atual é: ",somaPontos)

                        se(incluirRetirar == 'i' ou incluirRetirar == 'I')
                        {
                            escreva("\nInsira o valor que deseja incluir: ")
                            leia(notas[x])
                            somaPontos += notas[x]
                            Util.aguarde(500)
                            pare
                        }
                        senao se (incluirRetirar == 'r' ou incluirRetirar == 'R')
                        {
                            escreva("Insira o valor que deseja Retirar: ")
                            leia(notas[x])
                            somaPontos -= notas[x]
                                se(somaPontos <= 0.0)
                                {
                                    somaPontos = 0.0
                                    escreva("Sua nota zerou!")
                                    Util.aguarde(500)
                                    pare
                                }
                                senao
                                {
                                    pare
                                }
                        }

                    }
                    enquanto(incluirRetirar !='I' e incluirRetirar !='i' ou incluirRetirar !='S' e incluirRetirar !='s')
				escreva("\nDeseja continuar?: ")
                    leia(continuar)

                    faca{
                        se(continuar == 'n' ou continuar == 'N')
                        {
                        	faca{
                        	escreva("\ndeseja imprimir seu boletim?")
                        leia(pediBoletim) 
                        	se(pediBoletim=="sim" ou pediBoletim =="SIM" ou pediBoletim =="Sim")
                        
                        	{
                        		contadorBoletim++ 
                        	se(contadorBoletim<3){
                        		   
                        	
                        	para(inteiro z=0;z<1; z++)
                        		{
                        		para(inteiro y=0;y<10;y++){
                        		escreva( notas[y],"  ")	
                        		}
                        			
                        		}
                        		
                        		x+=10
                        	Util.aguarde(5000)
                        	}
                        	}
                        	senao se(pediBoletim !="sim" ou pediBoletim !="SIM")
                        	
                        	{
                        	escreva("Por favor insira um valor valido: ")
                        	leia(pediBoletim)
                        	Util.aguarde(2000)
                        	}
                        	senao{
                        		x+=10
                        		pare
                        	
                        	}
                        	pare
                        	}
                        	enquanto(contadorBoletim<=3)
                        	pare}
                        

                        senao se(continuar == 's' ou continuar =='S')
                        {
                            pare
                        }
                        senao
                        {
                        escreva("Por favor insira um valor valido!\nDeseja continuar?: S/N ")
                        leia(continuar)
                        }
                        }
                        enquanto(continuar !='n' ou continuar !='N')
                        }
                  pare	
		}
		
		senao se(opcaodesejada == 2)
		
		{
		real valorMovimento	
		
		caracter movimento	
		caracter continuar
		real bonus = 2.0
		
			limpa()
				escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")
                   	se (status){ escreva("Status: 1-Ativa\n")}
				senao
				{ 
				escreva("Status: 2-Inativa")
				escreva("\n impossível registar nota do aluno! Até breve!!\n\n")
				}
				para(inteiro i = 0; i<10; i++){
					limpa()
					escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")
                   	
					escreva("\nTotal atual: ", pontos)
					escreva("\nMOVIMENTO - I-inclusão de nota ou R-retirada nota: ")
					leia(movimento)
					se(movimento == 'I' ou movimento == 'i'){
						escreva("Valor movimento: ")
						leia(valorMovimento)
						pontos = pontos + valorMovimento
					}senao se(movimento == 'R' ou movimento == 'r'){
						escreva("Valor movimento: ")
						leia(valorMovimento)
						pontos = pontos - valorMovimento
					}
					escreva("Continuar S/N:")
					leia(continuar)
					
					faca{
					se(continuar == 'N' ou continuar == 'n'){
						limpa()
						
						se(pontos <0 e continuar =='n' ou continuar =='N')
						{
						pontos = pontos + bonus
						bonus=0.0	
						se(pontos <0 e continuar =='n' ou continuar =='N')
						{
						pontos = 0.0
						escreva("\nSegue seu extrato de informações:\n")
						escreva("----------------------------------\n")
						escreva("\n" + NOMEDAESCOLA)
						escreva("\n" + SLOGAN)
						escreva("\n\nMatricula: " + matricula)
						escreva("\nCPF: " + cpf)
						escreva("\nSua nota final é: ", pontos)
						}
						
						}
						se(pontos >= 0 e continuar =='N' ou continuar =='n'){
						i+=10
						escreva("\nSegue seu extrato de informações:\n")
						escreva("----------------------------------\n")
						escreva("\n" + NOMEDAESCOLA)
						escreva("\n" + SLOGAN)
						escreva("\n\nMatricula: " + matricula)
						escreva("\nCPF: " + cpf)
						escreva("\nSua nota final é: ", pontos)
						}	
						pare
					}		 	
					
					
				
								
				se (i==9 e continuar =='s' ou continuar =='S') 
				{	
					escreva("Você chegou ao limite de notas que pode adicionar ou retirar! Por favor aguarde 5 segundos para receber seu extrato de informações!\n")
						Util.aguarde(5000)
						limpa()
						escreva("\nSegue seu extrato de informações:\n")
						escreva("----------------------------------\n")
						escreva("\n" + NOMEDAESCOLA)
						escreva("\n" + SLOGAN)
						escreva("\n\nMatricula: " + matricula)
						escreva("\nCPF: " + cpf)
						escreva("\nSua nota final é: ", pontos)	}
						
				se(continuar =='s' ou continuar == 'S')
				{
				pare	
				}		
				senao{
					escreva("\nPor favor insira S para Sim ou N para Não!")
					escreva("\nContinuar S/N:")
					leia(continuar)
					}
				pare
				}
								
				enquanto(continuar !='s'ou continuar !='S')
				}
				pare
		}
		senao se(opcaodesejada == 3)
		{
			
			limpa()
				real credito = 5.00
				real nota
				real tt_nota = 0.00
				real media 
				inteiro opc  = 0
				real crd_usar
				caracter tirarNota
				caracter continuar
				
							
				
				para (inteiro mvts=1 ; mvts <=10 ; mvts++)
				{limpa()
					escreva(NOMEDAESCOLA,"\n",SLOGAN,"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: ",matricula,"\nCPF: ",cpf,"\nSua matricula está ativa\n")
					escreva("\nSua nota atual é: "+ tt_nota+"\n")
					faca
					{
					escreva("\nVocê deseja Incluir ou Retirar nota?: ")
					escreva("\nUse I ou R: ")
					leia(tirarNota)
					limpa()
					escreva(NOMEDAESCOLA,"\n",SLOGAN,"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: ",matricula,"\nCPF: ",cpf,"\nSua matricula está ativa\n")
					escreva("\nSua nota atual é: "+ tt_nota+"\n")
					se(tirarNota == 'i' ou tirarNota == 'I')
						{
							escreva("Entre com a nota nº " + mvts + " : ")
							leia(nota) 
							tt_nota = tt_nota + nota
							limpa()
							pare
						}
						
						senao se (tirarNota == 'r' ou tirarNota == 'R')
						{
							escreva("Entre com a nota nº " + mvts + " : ")
							leia(nota) 
							tt_nota = tt_nota - nota
							limpa()
								se(tt_nota <= 0.0)
								{
									tt_nota = 0.0
									escreva("Sua nota zerou!")
									limpa()
									pare	
								}
								senao
								{
									pare	
								}
						}
						
					}
					enquanto(tirarNota !='I' e tirarNota !='i' ou tirarNota !='S' e tirarNota !='s')

						escreva("Deseja continuar?: ")
						leia(continuar)
						
						faca{
						se(continuar == 'n' ou continuar == 'N')
						{
							mvts+=10
							media =  tt_nota / 10
							escreva( "Seu total de notas foi: " + tt_nota + " Portanto sua media será: " + media + "\n \n")
							escreva ("Gostaria de usar o seu saldo de notas credito?\nDigite: \n1- Sim \n2- Não\n\n") 
							leia(opc)
							faca{
										
							se (opc == 1)
							{
						
								 	escreva("\n\nVoce tem o seguinte saldo de pontos para credito: " + credito + " Quantos pontos gostaria de usar? " )
								 	leia(crd_usar)
								 	credito = credito - crd_usar
								 	
								 	se(credito < 0)
								 	{	
								 	credito = 0.00
								 	escreva("Você pode retirar no máximo 5")
								 	media  = media + 5 
								 	limpa()
								 	escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nSeu novo saldo de credito é: "+ credito)
								 	escreva("\nEssa é a sua media final: " + media+"\n\n")
								 	pare	
								 	}
								 	senao se (credito >= 0 ou credito <= 5)
								 	{
								 	media = media + crd_usar
								 	limpa()
								 	escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nSeu novo saldo de credito é: "+ credito)
								 	escreva("\nEssa é a sua media final: " + media+"\n\n")
								 	
								 		
								 	}
								 	pare
				}
				
				
				senao se(opc ==2){
					
		
								 	escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nEssa é a sua media final: " + media+"\n\n")
								 	
								 	 
					
					}
					
					pare
					}


						enquanto(opc != 1 ou opc !=2)
						pare
					}

						senao se (continuar=='s' ou continuar =='S')
						{
							se(mvts == 10)
							{
								escreva("Você já chegou ao limite de notas que pode inserir!")
								mvts+=10
							media =  tt_nota / 10
							escreva( "Seu total de notas foi: " + tt_nota + " Portanto sua media será: " + media + "\n \n")
							escreva ("Gostaria de usar o seu saldo de notas credito?\nDigite: \n1- Sim \n2- Não\n\n") 
							leia(opc)
							faca{
										
							se (opc == 1)
							{
						
								 	escreva("\n\nVoce tem o seguinte saldo de pontos para credito: " + credito + " Quantos pontos gostaria de usar? " )
								 	leia(crd_usar)
								 	credito = credito - crd_usar
								 	
								 	se(credito < 0)
								 	{	
								 	credito = 0.00
								 	escreva("Você pode retirar no máximo 5")
								 	media  = media + 5 
								 	limpa()
								 	escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nSeu novo saldo de credito é: "+ credito)
								 	escreva("\nEssa é a sua media final: " + media+"\n\n")
								 	pare	
								 	}
								 	senao se (credito >= 0 ou credito <= 5)
								 	{
								 	media = media + crd_usar
								 	limpa()
								 	escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nSeu novo saldo de credito é: "+ credito)
								 	escreva("\nEssa é a sua media final: " + media+"\n\n")
								 	
								 		
								 	}
								 	pare
				}
				
				
				senao se(opc ==2){
					
		
								 	escreva("\nSegue seu extrato de informações:\n")
								 	escreva("----------------------------------\n")
								 	escreva("\n" + NOMEDAESCOLA)
								 	escreva("\n" + SLOGAN)
								 	escreva("\n\nMatricula: " + matricula)
								 	escreva("\nCPF: " + cpf)
								 	escreva("\nEssa é a sua media final: " + media+"\n\n")
								 	
								 	 
					
					}
					
					pare
					}


						enquanto(opc != 1 ou opc !=2)
																
							}
							
						pare	
						}
						senao
						{
						escreva("Por favor insira um valor valido!\nDeseja continuar?: S/N ")
						leia(continuar)	
						}
						}
						enquanto(continuar !='n' ou continuar !='N')
					
					}
				
					
				pare
					
			}
					
			
		
		senao se(opcaodesejada == 4)
		{
			
		}
		
			
		}
		se(opcaoStatus <1 ou opcaoStatus >2)
		{
			escreva("Por favor insira: 1 para matricula Ativa ou 2 para matricula Inativa: ")
			leia(opcaoStatus)
		}
		senao se(opcaoStatus == 2)
			{
				escreva("\nSua matricula está inativa, por favor vá até a secretária para ativá-la\n\n")
				pare
			}
		}
			enquanto(opcaoStatus !=1 ou opcaoStatus !=2)
		
			
	}
	}
	
	
	}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {i, 291, 17, 1}-{tipoEnsino, 16, 9, 10};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */