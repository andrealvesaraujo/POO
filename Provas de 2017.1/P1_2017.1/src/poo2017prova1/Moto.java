package poo2017prova1;

public class Moto extends Veiculo{
	public Moto (String placa, String id, int ano) {
		super (placa, id, ano);
	}
	@Override
	public String toString() {
		return getPlaca();
	}
}
