package poo2017prova1;

import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite uma placa");
		String placa = s.nextLine();
		List listaRoubados = Detrano.getVeiculosRoubados();
		Veiculo v = null;
		
		int indiceRoubado = listaRoubados.indexOf(new Carro(placa, null,0));
		if (indiceRoubado > -1) {
			v = (Veiculo)listaRoubados.get(indiceRoubado);
			System.out.print("Veiculo de placa " + v.getPlaca() + " é um(a) ");
			if (v instanceof Carro) {
				System.out.println("carro roubado");
			} else if (v instanceof Moto) {
				System.out.println("moto roubada");
			}
		} else {
			System.out.println("Veiculo nao é roubado");
		}
		
		//3.7.b
		System.out.println(v);
		System.out.println("Carros do ano 1978 " + contadorCarrosRoubados(listaRoubados, 1978));
	}
	public static int contadorCarrosRoubados (List listaCarros, int ano ) {
		int quantidade=0;
		for (int i = 0; i < listaCarros.size(); i++) {
			if (listaCarros.get(i) instanceof Carro) {
				Carro c = (Carro)listaCarros.get(i);
				if (c.getAno()==ano) quantidade ++;
			}
		}
		return quantidade;
	}

}
