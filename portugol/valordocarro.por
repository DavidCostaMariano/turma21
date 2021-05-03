programa
{
	inclua biblioteca Matematica --> m
	
	funcao inicio()
	{
	/*objetivo:  O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor. */

	//variaveis
		const real pdistribuidor = 0.28 // 28%
		const real pimposto = 0.45 // 45%

		real custoConsumidor = 0.00
		real custoFabrica = 0.00
		real percentagemDistribuidor = 0.00
		real imposto = 0.00

		escreva ("Digite o custo de fabrica em R$: ")
		leia (custoFabrica)

		
		//processamento
		percentagemDistribuidor = custoFabrica * pdistribuidor
		imposto = custoFabrica * pimposto
		custoConsumidor = percentagemDistribuidor + imposto + custoFabrica
		escreva ("custo de Fabrica : R$",custoFabrica +"\n")
		escreva ("Distribuidor R$ : " , (m.arredondar(percentagemDistribuidor, 2)) + "\n")
		escreva ("impostos  R$ :", (m.arredondar(imposto, 2)) , "\n")
		escreva ("Custo Consumidor R$ :", (m.arredondar(custoConsumidor, 2)))
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1032; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */