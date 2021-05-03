programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		real matrizn1[2][3]
		real matrizn2[2][3]
		real matrizm1[2][3]
		real matrizm2[2][3]
		

		para(inteiro x=0; x<2;x++){
			
			para(inteiro y=0; y<3;y++){
			
			matrizn1[x][y] = Util.sorteia(1, 9)
			matrizn2[x][y]= Util.sorteia(1, 9)
			
                matrizm1[x][y] = matrizn1[x][y] + matrizn2[x][y]
                matrizm2[x][y] = matrizn1[x][y] - matrizn2[x][y]


			}
		}
		
		escreva("Matriz n 1 =\n")
		
		para(inteiro x = 0; x<2;x++){
			escreva("[")
			 para(inteiro y = 0; y<3;y++)
			 {
                escreva(matrizn1[x][y]," ")
                }
                escreva("]\n")
		}

		
		pula()

		
		escreva("Matriz n 2 = \n")
		para(inteiro x = 0; x<2;x++){
			escreva("[")
			 para(inteiro y = 0; y<3;y++)
			 {
                escreva(matrizn2[x][y]," ")
                }
                escreva("]\n")
		}


		pula()

		
		escreva("Matriz m 1 = \n")
		para(inteiro x = 0; x<2;x++){
			escreva("[")
			 para(inteiro y = 0; y<3;y++)
			 {
                escreva(matrizm1[x][y]," ")
                }
                escreva("]\n")
		}

		
		pula()

		
		escreva("Matriz m 2 = \n")
		para(inteiro x = 0; x<2;x++){
			escreva("[")
			 para(inteiro y = 0; y<3;y++)
			 {
                escreva(matrizm2[x][y]," ")
                }
                escreva("]\n")
		}
	}


	
	funcao pula(){
	escreva("\n\n")}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizn1, 6, 7, 8}-{matrizn2, 7, 7, 8}-{matrizm1, 8, 7, 8}-{matrizm2, 9, 7, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */