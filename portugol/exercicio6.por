programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real x1, x2, y1, y2
	real d
	real resultadoDaPotencia
	real raiz
	real resultadoFinal

	

	escreva ("Informe o valor de x1. \n")
	leia(x1)
	escreva ("Informe o valor de x2. \n")
	leia(x2)
	escreva ("Informe o valor de y1. \n")
	leia(y1)
	escreva ("Informe o valor de y2. \n")
	leia(y2)

		
	d = (mat.potencia((x2-x1),2.0)) + (mat.potencia((y2-y1),2.0))
	escreva("o resultado da soma é: "+ d + "\n")
	resultadoDaPotencia = mat.raiz(d, 2.0)

	
	se (resultadoDaPotencia == 0) {
		escreva ("só existe uma raiz real \n")
		escreva ("a raiz é " + resultadoDaPotencia)
		}
		senao{
			escreva ("o resultado da raiz é: " + (mat.arredondar(resultadoDaPotencia,2)))
			}

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */