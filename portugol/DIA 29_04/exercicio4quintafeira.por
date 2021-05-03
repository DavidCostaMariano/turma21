programa
{
	
	funcao inicio()
	{
	real matriz [3][3]
	real soma = 0.00
	real somaDiagonal = 0.00


		para(inteiro l=0; l<3;l++)
		{
			para(inteiro c=0; c<3;c++)
			{
				escreva("insira o " ,c+1, "º valor da ", l+1, "º linha: ")
				leia(matriz[l][c])	
				soma += matriz[l][c]
			
				se(l==c)
				{
					somaDiagonal += matriz[l][c]
				}
			
			}
		}
			escreva("\nA soma total é: ", soma)
			escreva("\nA soma da diagonal principal é: ", somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 6, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */