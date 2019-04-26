

public class Reta{
	private double angular;
	private double linear;

	public Reta(double a,double b){
		this.angular = a;
		this.linear = b;

	}
	public Reta(double x1,double y1,double x2,double y2){
		double subx,suby;
		suby=y1-y2;
		subx=x1-x2;
		this.angular =subx/suby;
		this.linear = y1-(x1*angular);

	}
	public void setAngular(double a){

		this.angular=a;

	}
	public void setLinear(double b){
		this.linear=b;
	}
	public double getAngular(){
		return this.angular;
	}
	public double getLinear(){
		return this.linear;
	}
	public boolean verificar(double x,double y){
		if(y==(this.angular*x+this.linear)){
			return true;
		}
		return false;
	}
	public String toString(){
		if(this.linear>0){
			return String.format("y = +%.2fx + %.2f\n",angular,linear);
		}else if(this.linear == 0){
			return "y = " +this.angular + "x";
		}else{
			return "y = " +this.angular + "x " + linear;
		}

	}
	
	
	public Ponto2D intersecao(Reta R){
		Ponto2D p;
		double sub1,sub2;
		
		if(this.angular == R.angular){
			return null;
		}
		sub1 = this.angular - R.angular;
		sub2 = -(this.linear - R.linear);
		p = new Ponto2D(sub2/sub1,(this.angular*(sub2/sub1))+this.linear);
		return p;
	}

	public static void main(String[] args){
		Reta R = new Reta(5,4);
		System.out.println(R);
		Ponto2D p = new Ponto2D(2.158,3.6);
		System.out.println(p);
		 p = R.intersecao(new Reta(2,2));
		 System.out.println(p);
	}








}