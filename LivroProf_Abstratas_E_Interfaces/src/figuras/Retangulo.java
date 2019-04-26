package figuras;

public class Retangulo implements AreaCalculavel {
	private double largura,altura;
	
	public Retangulo(double largura,double altura){
		this.largura=largura;
		this.altura=altura;
		
	}
	public double calculaArea(){
		return altura*largura;
	}
}
