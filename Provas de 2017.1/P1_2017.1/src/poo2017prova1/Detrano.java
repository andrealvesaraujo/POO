package poo2017prova1;

import java.util.ArrayList;
import java.util.List;

public class Detrano {
	public static List getVeiculosRoubados() {
		ArrayList x = new ArrayList();
		x.add(new Carro("xxx123", "id01", 1978));
		x.add(new Moto("yyy123", "id01", 1978));
		return x;
	}
}
