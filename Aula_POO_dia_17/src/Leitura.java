import java.util.Scanner;

public class Leitura {
	public static void main(String[] args){
		/*
		System.out.println("Digite o nome");
		Scanner entrada = new Scanner(System.in);
		String linha =entrada.nextLine();
		System.out.println("insira a idade");
		int idade = entrada.nextInt();
		System.out.println("Oi " + linha + " sua idade " + idade);
		*/
		/*int [] x = new int[5];//Default do array é 0 
		x[0]=6;
	
		x[4]=10;
	
		x[1]=30;
		double soma=0;
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
			soma=soma+x[i];
			
		}
		System.out.println("Media : " + soma/x.length);
		int [] y = {567,754,2,5,6};
		int [] a;
		int j;
		int tr,qw[];
		Conta c [] = new Conta[3];
		for(j=0;j<3;j++)
		{
			c[j]=new Conta();
			c[j].saldo = j*140;
		}
		Cliente [] cl = new Cliente[6]; 
		*/
		Conta c[] = {new Conta(),new Conta(),new Conta()};
		Conta d[] = new Conta[c.length +3];//Prova antiga
		for(int i=0;i<c.length;i++)
		{
			d[i]=c[i];
		}
	}
}
