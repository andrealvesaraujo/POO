
public class DVD extends Loja{
	private double duracao;
	
	public DVD(String codigo){
		super(codigo);
	}
	public DVD(String c,String n,double v,double d){
		super(c,n,v);
		this.duracao=d;
	}
	public double getDuracao() {
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public String toString(){
		return "DVD : "+super.toString()+" , " + this.duracao;
	}
	
}
