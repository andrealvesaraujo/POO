package Questão_1;
import java.util.*;
public class Q01Main {

	public static void main(String[] args) {
		BombaDeCombustivel bomba = new BombaDeCombustivel();
		List<VeiculoAutomotor> veiculos = new ArrayList<VeiculoAutomotor>();
		
		//Modelo, Capacidade do Tanque, Qtde de combustível atual
		veiculos.add(new Motocicleta("XTR 125", 20 , 5));
		veiculos.add(new Automovel("Palio 1.6", 50 , 32));
		veiculos.add(new Motocicleta("CB 400", 25 , 15));
		
		System.out.println("Veículos NÃO ORDENADOS");
		System.out.println(veiculos);
		System.out.println();
		
		//ABASTECIMENTO vai acionar o método completarTanque de cada veículo Automotor. 
		//Motocicletas só devem usar 90% da capacidade do tanque.
		
		bomba.abastecerVeiculos(veiculos);
		
		Collections.sort(veiculos);
		
		System.out.println("Veículos ORDENADOS pela quantidade de combustível no tanque");
		System.out.println(veiculos);
		System.out.println();
		
		System.out.println("Total de combustível utilizado: "+bomba.getQtdeCombustivelUtilizado());
	}

}