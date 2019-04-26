
public class Carro {
	private String placa;

	public Carro(String x){
		placa=x;
	}
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String toString(){
		return "Placa : " + placa;
	}

}
