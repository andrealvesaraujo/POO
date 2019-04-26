package Questão2;

public class Genin extends Ninja{
	public Genin(String c,String n,int i){
		super(c,n,i);
	}
	public Genin(String c){
		super(c);
	}
	public void treinar(){
		System.out.println("Genin " + this.getNome() +" iniciando treinamento simples");
	}
}
