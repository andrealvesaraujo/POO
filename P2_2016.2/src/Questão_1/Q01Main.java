package Quest�o_1;
import java.util.*;
public class Q01Main {

	public static void main(String[] args) {
		BombaDeCombustivel bomba = new BombaDeCombustivel();
		List<VeiculoAutomotor> veiculos = new ArrayList<VeiculoAutomotor>();
		
		//Modelo, Capacidade do Tanque, Qtde de combust�vel atual
		veiculos.add(new Motocicleta("XTR 125", 20 , 5));
		veiculos.add(new Automovel("Palio 1.6", 50 , 32));
		veiculos.add(new Motocicleta("CB 400", 25 , 15));
		
		System.out.println("Ve�culos N�O ORDENADOS");
		System.out.println(veiculos);
		System.out.println();
		
		//ABASTECIMENTO vai acionar o m�todo completarTanque de cada ve�culo Automotor. 
		//Motocicletas s� devem usar 90% da capacidade do tanque.
		
		bomba.abastecerVeiculos(veiculos);
		
		Collections.sort(veiculos);
		
		System.out.println("Ve�culos ORDENADOS pela quantidade de combust�vel no tanque");
		System.out.println(veiculos);
		System.out.println();
		
		System.out.println("Total de combust�vel utilizado: "+bomba.getQtdeCombustivelUtilizado());
	}

}