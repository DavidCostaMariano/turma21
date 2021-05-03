programa
{
	inclua biblioteca Matematica --> m
	funcao inicio()
	{
		cadeia nome
		real nota = 0.00
		real media = 0.00
		real maiorNota = 0.00
		inteiro menor5 = 0
		real somaNota = 0.00

		para(inteiro y = 1; y<=5; y++)
		{
			escreva("Insira o nome dos alunos: ")
			leia(nome)
			}
	
		para (inteiro x = 1; x<=5; x++)
			{
				escreva("escreva as notas: ")
				leia(nota)
				somaNota = somaNota + nota
				media = (somaNota/5)
				
			se(nota < 5)
				{
					menor5++	
				}
			
				se (maiorNota < nota)
					{
						maiorNota = nota
					}
			}
				escreva("\na maior nota é: ",maiorNota)
				escreva("\na soma de notas é: ", somaNota)
				escreva("\nA media das notas é: " , (m.arredondar(media, 2)) ,"\n")
				escreva(menor5 ," pessoas tiraram menos que 5")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */