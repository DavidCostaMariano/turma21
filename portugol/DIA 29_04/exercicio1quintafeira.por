programa
{
	
	funcao inicio()
	{
		inteiro pontuacao [4]
		inteiro maiorNota = 0

		para(inteiro x=0; x<4; x++)
		{
		escreva("Digite a pontuação do participante: ")
		leia (pontuacao[x])	
		}
		
		para(inteiro x=0; x<4; x++){
		escreva("O participante: ",x+1," recebeu a nota: ",pontuacao[x], "\n")
		

		
		se (pontuacao[x] > maiorNota){
		maiorNota = pontuacao[x]
		}
		
		}
		escreva("\nA maior nota foi: ",maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {pontuacao, 6, 10, 9}-{maiorNota, 7, 10, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */