programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
inteiro anos
inteiro dias
inteiro meses

escreva("informe quantos dias de vida você já viveu: ")
leia (dias)
anos = dias / 365
meses = dias /30
escreva ("voce tem " + anos + " ano(s) de vida" + "isso em meses da " + mat.arredondar( meses, 0))
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