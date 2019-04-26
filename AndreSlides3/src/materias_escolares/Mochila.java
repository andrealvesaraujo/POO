package materias_escolares;

public class Mochila {
	private String cor;
	private int anoFab;
	
	public void setCor(String c)
	{
		this.cor=c;
	}
	public String getCor(){
		return this.cor;
	}
	
	public void setAnoFab(int n)
	{
		this.anoFab=n;
	}
	public int getAnoFab(){
		return this.anoFab;
	}
	public void mostrarMochila()
	{
		System.out.println("Cor "+this.cor +" e ano: " +this.anoFab);
	}
}
