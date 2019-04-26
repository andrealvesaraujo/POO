
public class Complexo {
	private double inteiro,fracionario;
	
	public Complexo(double i,double f){
		this.inteiro=i;
		this.fracionario=f;
	}
	public void setInteiro(double i){
		this.inteiro=inteiro;
	}

	public double getFracionario() {
		return fracionario;
	}

	public void setFracionario(double fracionario) {
		this.fracionario = fracionario;
	}

	public double getInteiro() {
		return inteiro;
	}
	
	public void somar(Complexo c){
		this.inteiro = this.inteiro+c.inteiro;
		this.fracionario+=c.fracionario;
	}
	public void subtrair(Complexo c){
		this.inteiro = this.inteiro-c.inteiro;
		this.fracionario-=c.fracionario;
	}
	public String toString(){
		return inteiro +" "+ fracionario+"i";
	}
	public boolean equals(Object o){
		if(o instanceof Complexo){
			Complexo c = (Complexo )o;
			return (c.toString()).equals(this.toString());
			
		}
		return false;
		
	}
	public static void main(String args[]){
		Complexo c1 = new Complexo(10,20);
		Complexo c2 = new Complexo(10,26);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
	}
}
