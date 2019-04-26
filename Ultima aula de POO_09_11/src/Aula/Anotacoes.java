package Aula;
import java.util.*;
/*
 * 
 * Collectios:Metodos:
 * sort();
 * shuffle();
 * frequency();
 * 
 * 
 * 
 */
public class Anotacoes {
	public static void main(String args[]){
		List<String> lista = new ArrayList<String>();
		lista.add("carro");
		lista.add("farro");
		lista.add("barco");
		lista.add("arvore");
		Collections.shuffle(lista);
		System.out.println(Collections.frequency(lista,"carro"));
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
		
		List<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(15);
		lista2.add(10);
		lista2.add(577);
		lista2.add(50);
		System.out.println(lista2);
		Collections.sort(lista2);
		System.out.println(lista2);
		
		
		
		
		
	}
}
