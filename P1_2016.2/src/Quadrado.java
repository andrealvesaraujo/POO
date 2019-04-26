
public class Quadrado extends Figura implements Cortavel,Desenhavel{
	public void cortar(){
		System.out.println("Cortou");
	}
	public void desenhar(){
		System.out.println("Desenhou");
	}
	public Quadrado(String c){
		super(c);
	}
	
	

}
