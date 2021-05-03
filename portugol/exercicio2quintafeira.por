programa
{
	inclua biblioteca Util
	funcao inicio()
	{
	/*objetivo
	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
		*/

		inteiro lancamentos[10] //vetor e numero de lancamentos - 10
		real soma = 0.00
		real media = 0.00
		inteiro maiorPontuacao = 0
		inteiro vezesMaiorPontuacao = 0

        //sorteando valores de um dado e colocando num vetor
        para (inteiro x=0; x<10; x++){

          lancamentos[x] = Util.sorteia(1, 6)
		escreva("O valor ", x+1, " foi: ",lancamentos[x],"\n")
       	soma = soma + lancamentos[x]
       	
        se(lancamentos[x] > maiorPontuacao) {
		maiorPontuacao = lancamentos[x]
			}

        }
		para(inteiro x = 0; x < 10; x++) {
			se(lancamentos[x] == maiorPontuacao) {
				vezesMaiorPontuacao += 1
			}
		}

        
        media = soma / 10
        escreva("-----------------------------------------\n")
        escreva("A média dos lançamentos foi: ",media, "\n")
        escreva("A maior pontuaçao foi: ",maiorPontuacao, " e ela se repetiu: ", vezesMaiorPontuacao)
        
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 844; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */