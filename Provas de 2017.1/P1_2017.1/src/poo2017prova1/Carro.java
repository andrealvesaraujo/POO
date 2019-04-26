package poo2017prova1;

public class Carro extends Veiculo{
	public Carro (String placa, String id, int ano) {
		super (placa, id, ano);
	}
	@Override
	public String toString() {
		return getPlaca();
	}
}
