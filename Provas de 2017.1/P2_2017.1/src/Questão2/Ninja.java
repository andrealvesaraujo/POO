package Questão2;

public class Ninja implements Treinamento, Comparable{
	private String cpf;
	private String nome;
	private int idade;
	
	public Ninja(String cpf,String n,int i){
		this.cpf=cpf;
		this.nome=n;
		this.idade=i;
	}
	public Ninja(String cpf){
		this.cpf=cpf;
	}
	
	
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int i){
		this.idade=i;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String n){
		this.nome=n;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public void treinar(){
		System.out.println(this.nome + "treinando");
	}
	
	
	
	public boolean equals(Object o){
		if(o instanceof Ninja){
			Ninja N = (Ninja)o;
			return this.cpf.equals(N.cpf);
		}
		return false;
	}
	
	
	public int compareTo(Object o){
		if(o instanceof Ninja){
			Ninja N = (Ninja)o;
			return (new Integer(N.idade)).compareTo(this.idade);
		}
		return 0;
	}
	
	
	public String toString(){
		return this.getNome();
	}
}
