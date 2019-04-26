package figuras;

public class Circulo implements AreaCalculavel {
	private double raio;
	
	
	public Circulo(double r){
		this.raio=r;
	}
	
	
	public double calculaArea(){
		return raio*Math.PI;  
	}
}
