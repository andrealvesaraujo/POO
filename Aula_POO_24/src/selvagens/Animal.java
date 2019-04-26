package selvagens;

public class Animal {
	private String nome;
	private int idade;
	private double peso;
	
	public Animal()
	{
		
	}
	public Animal(String nome)
	{
		this.nome=nome;
	}
	
	public void correr()
	{
		System.out.println("Animal " + nome + " correndo");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
