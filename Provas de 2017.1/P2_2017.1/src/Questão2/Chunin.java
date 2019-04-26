package Questão2;

public class Chunin extends Ninja{
	public Chunin(String cpf,String n,int num){
		super(cpf,n,num);
	}
	public Chunin(String cpf){
		super(cpf);
	}
	public void treinar(){
		System.out.println("Chunin " + this.getNome() +" iniciando treinamento avançado");
	}
}
