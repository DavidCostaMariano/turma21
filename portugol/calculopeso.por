programa
{
	
	funcao inicio()
	{
		inteiro pesoFixo = 0
		inteiro resultado = 0
		real mediaPeso = 0.00
		inteiro maior = 0
		inteiro menor10 = 0
		para(inteiro y = 1; y <=5; y++)
		{
			escreva("Digite o peso valor inteiro: ")
			leia(pesoFixo)
			resultado = pesoFixo + resultado
			se (pesoFixo > maior){
				maior = pesoFixo
				}

				se(pesoFixo <= 10)
				{
					menor10++	
					}
		}
		mediaPeso = resultado /5
		escreva ("Existem: ", menor10, " pessoas com ou com menos de 10 kilos\n")
		escreva("O peso é igual a : ", resultado ,"\n")
		escreva("a media de peso é: ", mediaPeso)
		escreva("\nO maior peso digitado é: " ,maior)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */