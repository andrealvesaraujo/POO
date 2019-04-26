import java.util.List;
import java.util.ArrayList;
public class Detrano {
	public static List getVeiculosRoubados(){
		List veiculos = new ArrayList();
		veiculos.add(new Carro("PLA0005",1989,"348584834875"));
		veiculos.add(new Moto("MOT3210",2000,"3948549493484"));
		//UNS 100000
		return veiculos;
	}
}
