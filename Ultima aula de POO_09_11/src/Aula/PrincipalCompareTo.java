package Aula;
import java.util.*;
public class PrincipalCompareTo {
	public static void main(String args[]){
		List<Animal> lista = new ArrayList<Animal>();
		lista.add(new Animal("Simba",15));
		lista.add(new Animal("Bidu",13));
		lista.add(new Animal("Lion",5));
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
	}
}
