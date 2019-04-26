import java.util.ArrayList;

import java.util.Iterator;

/*Generics:
 * ArrayList<E> x = new ArrayList();
 * Ex:
 * ArrayList<String> x =new ArrayList<String>();
 * x.add("asdasd");-->Dentro agora é String
 *
 *String u =x.get(0);--->N precisa usar typecast pois tem certeza que é uma String.
 *
 *ArrayList<Integer> num= new ArrayList<Integer>();
 *k.add(17);//Auto boxing
 *int u = k.get(0);//Unboxing
 *
 *
 *HashSet<Cliente> ou Set<Cliente> p = new HashSet<Cliente>();
 *HashMap<String,carro> x= new HashMap<String,carro>();
 *
 *P2-->Utlizar generics e Iterator
 *
 */
public class BRGenerics {
	public static void main(String args[]){
		ArrayList<String> x = new ArrayList<String>();
		x.add("bacon");
		x.add("pudim");
		x.add("palavra");
		Iterator <String> it = x.iterator();
		while(it.hasNext()){
			String u = it.next();//N precisa casting
			System.out.println(u);
		}
	}
}
