
public class CD extends Loja{
	private int faixas;
	
	public CD(String codigo){
		super(codigo);
	}
	public CD(String c,String n,double v,int f){
		super(c,n,v);
		this.faixas=f;
	}
	public int getFaixas() {
		return faixas;
	}
	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
	public String toString(){
		return "CD: "+super.toString() + " , " + this.faixas;
	}
	
}
