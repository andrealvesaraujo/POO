
public abstract class Veiculos {
	private String placa,renavam;
	private int ano;
	
	public Veiculos(String p,int a,String r){
		this.placa=p;
		this.ano=a;
		this.renavam=r;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getRenavam() {
		return renavam;
	}
	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
}
