import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* PROVA 
 * 
 * 
 * MAp n é collection
 * 
 * */
public class Teste {
	
	public static void main(String[] args) {
			//ArrayList<String> x = new ArrayList<String>();
			/*x.add("casa");
			x.add("carro");
			x.add("mesa");
			x.add("casa");
			x.add("casa");
			
			System.out.println(Collections.frequency(x, new String("casa")));//Vai usar o equals
			*/
			Set<Integer> s = new HashSet<Integer>();
			s.add(59);
			s.add(15);
			s.add(67);
			s.add(2);
			s.remove(2);	
			Iterator<Integer> it = s.iterator();
			while(it.hasNext()){
				
			
				System.out.println(it.next());

				
			}
			
			
			List<Filme> x = new ArrayList<Filme>();
			
			x.add(new Filme("Batman",2010));
			x.add(new Filme("DogVille",2003));
			x.add(new Filme("DogVille",2003));
			x.add(new Filme("MatchPoint",2010));
			x.add(new Filme("DogVille",2003));
			x.add(new Filme("Batman",2010));
			x.add(new Filme("DogVille",2003));
			x.add(new Filme("DogVille",2003));
			System.out.println(Collections.frequency(x,new Filme("DogVille",2003)));
			Collections.shuffle(x);
			
			System.out.println(x);
			
			
	}

}
