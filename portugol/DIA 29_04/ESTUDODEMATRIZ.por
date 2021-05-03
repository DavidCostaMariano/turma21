programa
{
	
	funcao inicio()
	{
		cadeia agenda [24][31]
		inteiro dia
		inteiro hora
		caracter op

		faca {
			escreva("Digite o dia para cadastro: ")
			leia(dia)
			dia -=1
			escreva("Digite a hora do evento: ")
			leia(hora)
			escreva("Digite a descrição do evento: ")
			leia(agenda[hora][dia])
			escreva("Continua S/N: ")
			leia(op)
			}
			enquanto (op == 'S')
		para(inteiro d =0; d <31; d++)
		para(inteiro h=0; h<24; h++)
		se(agenda[h][d]!=""){
		escreva("Dia :" ,d+1," hora: ",h," evento ",agenda[hora][dia],"\n")
	}}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {agenda, 6, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */