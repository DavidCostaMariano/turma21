package exercicios_13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ErroArquivo {
	public static void main(String[]args) {
	File arquivo = new File("C:\\Users\\David\\OneDrive\\Área de Trabalho\\Curso Generation\\ARQUIVOS COMPARTILHADOS EM AULA\\aloo.txt");
	Scanner leia = null;
	try {
		leia = new Scanner (arquivo);
		while (leia.hasNext())
		{
			System.out.println(leia.nextLine());
		}
	}
	catch (IOException erro) {
		System.out.print("Erro na abertura do arquivo!!");
		erro.printStackTrace();
		}
	
finally 
{
	if (leia !=null) {
		leia.close();
		}
	}
	}
	}