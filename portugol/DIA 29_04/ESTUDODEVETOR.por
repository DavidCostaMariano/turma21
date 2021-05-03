programa
{
	
	funcao inicio()
	{
		cadeia nomes[3]
		real notas [3]
		cadeia msg
		inteiro numero
	
		
		
		
		para(inteiro x=0; x<3; x++){


		escreva("O numero do alune: ")
		leia(nomes[x])
		escreva("Digite a nota: ")
		leia (notas[x])
		}
		escreva("Lista de alunes\n")
		escreva("-----------------------------------\n")

		para(inteiro x=0; x<3; x++){
		se (notas[x]<=5){
			msg = " estude um pouco mais.\n"
			}

		senao {
			msg = " continue assim. \n"
			}	

			escreva (nomes[x], " sua nota é ", notas[x], msg)
	
	}
	}


}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */