
public class Circulo implements FormasG{
	private double raio;
	
	public Circulo(double r){
		this.raio=r;
	
	}
	public double perimetro(){
		return 2*raio*Math.PI;
	}
	public double area(){
		return raio*Math.PI*raio;
	}
}
