import javax.swing.plaf.synth.SynthSeparatorUI;

public class Ponto2D {
	private double x,y;

	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Ponto2D(){
		
	}
	public Ponto2D(double x1,double x2){
		this.x=x1;
		this.y=x2;
	}
	public Ponto2D(Ponto2D p){
		this.x=p.x;
		this.y=p.y;
	}
	public String toString(){
		return "Ponto:" + this.x +" "+this.y;
	}
	public boolean equals(Object o){
		
		if(o instanceof Ponto2D)
		{
			Ponto2D p = (Ponto2D)o;
			return (p.toString()).equals(this.toString());
		}
		return false;
	}
	public Ponto2D distancia(Ponto2D p){
		Ponto2D ult=new Ponto2D();
		ult.setX(p.x-this.x);
		ult.setY(p.y-this.y);
		
		
		
		return ult;
	}
	public static void main(String args[]){
		Ponto2D p1 = new Ponto2D(5,6.789);
		Ponto2D p2 = new Ponto2D(p1);
		Ponto2D p3 = new Ponto2D(10,45.34);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p2.equals(p1));
		System.out.println(p3.distancia(p1));
		
	}
}
