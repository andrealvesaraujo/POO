package Questão2;
import java.util.*;
public class Utils {
	public static Map retornaMap(List listaNinjas){
		Map m = new HashMap();
		Iterator iter = listaNinjas.iterator();
		while(iter.hasNext()){
			Ninja N = (Ninja)iter.next();
			m.put(N.getCpf(), N);
		}
		
		return m;
	}
}
