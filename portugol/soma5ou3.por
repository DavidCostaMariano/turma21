programa
{
	
	funcao inicio()
	{
	
		inteiro somaI = 0
		inteiro somaN = 1
		inteiro numero
		 //entrada

		escreva("Informe um numero entre 1 e 500 que seja multiplo de 3: ")
		leia (numero)
		
		para(inteiro ms= 0 ; ms<500; ms++){
		 
			se((numero%3)==0 e (numero%2)!=0)
				{
					se (numero <=500){
				escreva( ms -1," - ", numero, "\n")	
				numero = numero + 3
				}}
			
			senao se((numero%2)==0) 
			{numero = numero + 3}

			 senao escreva("O numero inserido não é multiplo de 3\n")
			 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */