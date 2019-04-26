package Questão_1;

public class Automovel extends VeiculoAutomotor{

	public Automovel(String x,int c,int a){
		super(x,c,a);
	}
	public String toString(){
		return "Automovel " + this.getModelo() + " com " +this.getTatual()+" litros no tanque.";
	}
	
}
