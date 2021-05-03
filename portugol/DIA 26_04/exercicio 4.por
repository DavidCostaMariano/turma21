programa {
	inclua biblioteca Matematica --> mat
	funcao inicio(){
	real a
	real b
	real c
	real D
	real R
	real S
	
	escreva ("informe o valor de A" + "\n")
	leia (a)
	escreva ("Informe o valor de B" + "\n")
	leia (b)
	
	R = (mat.potencia((a + b), 2.0))
	escreva("O valor de R é: " + R +"\n")


	escreva("Informe o valor de B" + "\n")
	leia (b)
	escreva("Informe o valor de C" + "\n")
	leia (c)
	S = (mat.potencia((b + c),2.0))
	escreva ("O valor de S é: " +S+"\n")
	D = (R + S) / 2
	escreva("D é igual a: " + D)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */