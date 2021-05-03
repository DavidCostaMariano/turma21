programa
{
	
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
	const inteiro HABITANTES = 3
		real mediaSalario = 0.00
		real mediaFilhos = 0.00
		real maiorSalario = 0.00
		real percentagem = 0.00
		real salario = 0.00
		
		inteiro quantidadeFilhos = 0
		real somaSalario = 0.00
		inteiro somaFilho = 0
		real menorCem = 0.000
		
	//entrada
		
		para(inteiro ms=1; ms<=HABITANTES; ms++)
		{
			escreva(ms,"º Por favor, Informe o salario que voce recebe: ")
			leia (salario)
			escreva ("quantos filhos a familia tem?: ")
			leia (quantidadeFilhos)
			somaSalario += salario
			somaFilho += quantidadeFilhos
			
			


			se(salario > maiorSalario)
				{
					maiorSalario = salario
				}
				se(salario < 100)
					{
						menorCem++
						
					}
					mediaFilhos = somaFilho / HABITANTES
					mediaSalario = somaSalario / HABITANTES
					percentagem = (menorCem /HABITANTES) * 100
		}
			
		
		escreva ("\nA média de salario da população é: ",m.arredondar(mediaSalario, 2))
		escreva ("\nA média de filhos da população é: ", mediaFilhos)
		escreva ("\nO maior salario informado foi de: ", maiorSalario)
		escreva ("\nA porcentagem de pessoas que tem um salário maior que R$100,00 é de: ", m.arredondar(percentagem, 2) ,"%")
	//saida
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mediaSalario, 8, 7, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */