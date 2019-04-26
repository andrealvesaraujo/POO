package Questão_1;

public final class Motocicleta extends VeiculoAutomotor{

	public Motocicleta(String x,int c,int a){
		super(x,c,a);
	}
	
	
	
	public String toString(){
		return "Motocicleta " + this.getModelo() + " com " +this.getTatual()+" litros no tanque.";
	}
}
