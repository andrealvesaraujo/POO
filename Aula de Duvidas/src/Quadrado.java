
public class Quadrado extends Quadrilateros {
	
	public Quadrado(double l1){
		super(l1,l1,l1,l1);
	}
	public double area(){
		double lados[] = getLados();
		return lados[0]*lados[0];
	}
}
