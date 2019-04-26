
public class Ganso extends Animal implements Voador,Corredor{
	
	public Ganso(){
		
	}
	public Ganso(String nome){
		super(nome);
	}
	
	public void correr(){
		System.out.println("Ganso corre");
	}
	
	public void voar(){
		System.out.println("Ganso voando");
		
	}
}
