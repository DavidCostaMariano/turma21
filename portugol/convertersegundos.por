programa
{
	funcao inicio()
    {
    	inteiro tempo
    	inteiro horas
    	inteiro minutos
    	inteiro segundos

	escreva ("informe o tempo de duraçao do evento em segundos: ")
	leia(tempo)
	horas = tempo/3600
	minutos = (tempo/60)%60
	segundos = tempo%60
	escreva("o tempo de duraçao foi de: " + horas + " hora(s) " +minutos +" minuto(s) " + segundos + " segundo(s)")

}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */