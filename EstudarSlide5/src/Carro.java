
public class Carro extends Veiculo implements Corredor {
	
	public Carro(String marca){
		super(marca);
	}
	
	public void parar(){
		System.out.println("Carro"+ this.getMarca() + "esta parado");
	}
	public void correr(){
		System.out.println("Carro"+ this.getMarca() + "esta correndo");
	}
}
