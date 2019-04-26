
public class Retangulo extends Quadrilateros{
	public Retangulo(double base,double altura){
		super(base,altura,base,altura);
	}
	public double area(){
		double lados[] = getLados();
		return lados[0]*lados[1];
	}
}
