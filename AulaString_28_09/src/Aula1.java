import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


/*
 * 
 * 
 * 
 * As duas são filhas de Collection
 * List <-----ArrayList,LinkedList
 * Set(conjunto)<-----HashSet:::::::::::::::São conjuntos vc bota o elemento e bota na ordem que a implementação sugere ou seja a ordem não é garantida.
 * Alem disso não ha repetição de numero 
 */
public class Aula1 {
	public static void main(String[] args){
		Set x = new HashSet();
		
		x.add("quadrado");
		x.add("sdoifhsd");
		x.add("carro");
		x.add("bola");
		x.add("bola");

		System.out.println(tamanho(x));
		
		
	}
	public static int tamanho(Set x){
		Iterator it = x.iterator();
		//Objeto que permitir percorrer os elementos de uma estrutura
		int total=0;
		while(it.hasNext()){
			Object o = it.next();
			if(o instanceof String){
				total+=((String)o).length();
			}
			
		}
		return total;
	}
}
