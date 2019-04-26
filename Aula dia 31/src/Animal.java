
public class Animal {
	private String nome;
	
	public Animal(){
		
	}
	public Animal(String nome){
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String toString(){
		return this.nome;
	}
	
	public boolean equals(Object o){//---->>Sobrescreve
		if( o instanceof Animal){
			Animal x = (Animal)o;
			return nome.equals(x.nome);
		}
		return false;
	}
	
}
