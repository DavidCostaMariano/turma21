package atividadesLista3;
import java.util.Scanner;
public class Exercicio4 {
public static void main(String []args)
{
	Scanner leia = new Scanner (System.in);
	final int TOTALPESSOAS = 3;
	char opcaoGenero;
	int idade = 0;
	int caracteristica;
	int dados =0;
	int maisDeQuarentaNervosas = 0;
	int menosDeDezoitoCalmas = 0;
	int pessoasCalmas = 0;
	int qtdMulheresNervosas=0;
	int qtdHomensAgressivos=0;
	int outrosCalmos=0;
	while(dados<TOTALPESSOAS)
	{
		dados++;
		System.out.print("Insira sua idade: ");
		idade = leia.nextInt();
	
		
		System.out.print("Insira a letra correspondente ao genero que voc� se identifica M/F/O: ");
		opcaoGenero = leia.next().toUpperCase().charAt(0);
		System.out.print("Voc� se considera uma pessoa:\n1 - calma\n2 - nervosa\n3 - agressiva ");
		caracteristica = leia.nextInt();
		
		if(caracteristica == 1) 
		{
			pessoasCalmas++;
		}
		if(caracteristica == 2 && opcaoGenero =='F') 
		{
				qtdMulheresNervosas++;
		}
		if(caracteristica == 3 && opcaoGenero =='M')
		{
			qtdHomensAgressivos++;
		}
		if(caracteristica == 1 && opcaoGenero =='O')
		{
			outrosCalmos++;
		}
		if (idade >40 && caracteristica ==2) 
		{
			maisDeQuarentaNervosas++;
		}
		if(idade <18 && caracteristica ==1)
		{
			menosDeDezoitoCalmas++;
		}
	
	}
	System.out.printf("\nDe todes que responderam %d s�o calmes",pessoasCalmas);
	System.out.printf("\nO numero de mulheres nervosas �: %d",qtdMulheresNervosas);
	System.out.printf("\nO numero de homens agressivos �: %d", qtdHomensAgressivos);
	System.out.printf("\nA quantidade de pessoas que n�o se identificam com nenhum dos generos e s�o calmas �: %d",outrosCalmos);
	System.out.printf("\nO numero de pessoas nervosas com mais de 40 anos � de: %d",maisDeQuarentaNervosas);
	System.out.printf("\nO numero de pessoas calmas com menos de 18 anos � de: %d ",menosDeDezoitoCalmas);
	leia.close();
}
}
