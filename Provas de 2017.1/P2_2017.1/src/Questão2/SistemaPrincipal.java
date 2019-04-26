package Questão2;
import java.util.*;
public class SistemaPrincipal {
	public static void main(String args[]){
		Academia A = new Academia("Sunagakure");
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a quantidade de Ninjas cadastrados");
		int N = in.nextInt();
		
		while(N!=0){
			int op;
			int idade;String nome;String cpf;
			System.out.println("Digite 1 para o Genin");
			System.out.println("Ou Digite 2 para o Chunin");
			System.out.println("Ou Digite 3 para o Jonin");
			op=in.nextInt();
			System.out.println("Bote as informações desse Ninja(nome,cpf,idade)");
			nome=in.next();
			cpf=in.next();
			idade=in.nextInt();
			Ninja n=null;
			switch(op){
				case 1:n= new Genin(cpf,nome,idade); break;
				case 2:n = new Chunin(cpf,nome,idade); break;
				case 3:n= new Jonin(cpf,nome,idade);break;
				default:System.out.println("Opção invalida");break;
			}
			A.matriculaNinja(n);
			N--;
		}
		System.out.println("Ninjas cadastrados com sucesso");
		System.out.println("Digite o cpf que deseja procurar ou '0' para sair");
		String c = in.next();
		while(!c.equals("0")){
			if((!A.imprimeDadosNinjaSeExistir(new Ninja(c)))){
				System.out.println("Nâo existe ninja com esse cpf");
			}
			
			System.out.println("Digite o cpf que deseja procurar.Para terminar digite '0'");
			c = in.next();
		}
		System.out.println(A);
		System.out.println("Antes: "+A.getListaNinjas());
		Collections.sort(A.getListaNinjas());
		System.out.println(A.getListaNinjas());
		System.out.println(Utils.retornaMap(A.getListaNinjas()));
	}
}
