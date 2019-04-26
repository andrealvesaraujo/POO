package Questão2;

public class Jonin extends Ninja{

	public Jonin(String cpf,String nome,int i){
		super(cpf,nome,i);
	}
	public Jonin(String cpf){
		super(cpf);
	}
	public void treinar(){
		System.out.println("Jonin " + this.getNome() + " iniciando treinamento de meditação");
	}
}
