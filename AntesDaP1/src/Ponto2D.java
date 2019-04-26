
public class Ponto2D {
	private double x,y;
	
	public Ponto2D(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return String.format("(%.2f ; %.2f)",x,y);
	}
}
