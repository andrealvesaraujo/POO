import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestandoMap {
	public static void main(String args[]){
		ContaCorrente c1 = new ContaCorrente();
		ContaCorrente c2 = new ContaCorrente();
		ContaCorrente c3 = new ContaCorrente();
		c1.depositar(1000);
		c2.depositar(2000);
		c3.depositar(3000);
		
		//Set<Integer> S = new HashSet<Integer>();
		Map<String,ContaCorrente> M = new HashMap<String,ContaCorrente>();
		M.put("Conta1", c1);
		M.put("Conta2", c2);
		M.put("Conta3", c3);
		Map mapa = new HashMap();
		mapa.put("Diretor", c3);
		
		
		//Iterator<String> it =  M.keySet().iterator();
		//Iterator<ContaCorrente> it =  M.values.iterator();
		ContaCorrente opa = (ContaCorrente)mapa.get("Diretor");
		System.out.println(opa.getSaldo());
		ContaCorrente novo = M.get("Conta2");
		System.out.println(novo.getSaldo());
		if(M.containsKey("Conta2")){
			System.out.println("foi");
		}
		System.out.println(M.values());
	}
}
