package Aula;

//BAnco n cai
public class Animal implements Comparable<Animal>{
	private int idade;
	private String nome;
	
	public void setIdade(int i){
		this.idade=i;
	}
	public void setNome(String n){
		this.nome=n;
	}
	public int getIdade(){
		return this.idade;
	}
	public String getNome(){
		return this.nome;
	}
	
	public Animal(String n,int i){
		this.idade=i;
		this.nome=n;
	}
	
	public String toString(){
		return nome + " " + idade;
	}
	public int compareTo(Animal A){
		//return this.nome.compareTo(A.nome);
		
		return (new Integer(idade)).compareTo(A.idade);
		
	}
}
